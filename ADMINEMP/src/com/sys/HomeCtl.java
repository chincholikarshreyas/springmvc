package com.sys;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.EmpBean;
import com.bean.TaskBean;
import com.dao.MyDao;


@Controller
public class HomeCtl {

	@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	

	}
	
	@RequestMapping("/CheckLogin")
	public ModelAndView logincheck(HttpServletRequest request){
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String type=request.getParameter("type");
		System.out.println(type);
		//HttpSession session=request.getSession(false);
		//String user=(String)session.getAttribute("uid");

		//String user1=(String)session.getAttribute("email_id");
		//System.out.println(user1);
		//System.out.println(user);
		 ModelAndView mv1 = new ModelAndView("error","msg", "incorrect user id and password");
		   MyDao m=new MyDao();
		     int y= m.checkLogin(uid, pwd, request);
		     
		    
		  if(y==1&&type.equalsIgnoreCase("admin")/*&&user.equalsIgnoreCase("shreyas")*/){
			  ModelAndView mv = new ModelAndView("adminhome");
				return mv;
		  }
		  else if(y==1&&type.equalsIgnoreCase("employee")/*&&user1.equalsIgnoreCase("ram@gmail.com")*/){
			  ModelAndView mv = new ModelAndView("employeehome");
				return mv;
		  }
		  else
			  return mv1;
		
	}

	@RequestMapping("/fail")
	public String wrong(){
		return "index";
	}
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	@RequestMapping("/viewall")
	public String viewall(){
		return "viewall";
	}
	@RequestMapping("/assigntask")
	public String assigntask(){
		return "assigntask";
	}
	@RequestMapping("/viewtask")
	public String viewtask(){
		return "viewtask";
	}
	@RequestMapping("/adminhome")
	public String adminhome(){
		return "adminhome";
	}
	@RequestMapping("/registeremp")
	public ModelAndView registeremp(@RequestParam  String name,@RequestParam  String doj,@RequestParam  String email_id,@RequestParam  String pwd){
		
		 ModelAndView mv1 = new ModelAndView("register","msg", "Not Registered");
		
		EmpBean e=new EmpBean();
		e.setName(name);
		e.setDOJ(doj);
		e.setEmail_id(email_id);
		e.setPassword(pwd);
		
		int x=0;
		x=new MyDao().EmpInsert(e);
		if(x!=0)
		{
			 ModelAndView mv = new ModelAndView("register","msg","Successfully Registered");
				return mv;
			
		}
		return mv1;
	}
	@RequestMapping("/givetask")
	public ModelAndView givetask(@RequestParam int empid , @RequestParam String task){
		ModelAndView mv1 = new ModelAndView("assigntask","msg", "Not Registered");
		TaskBean e = new TaskBean();
		e.setEmpid(empid);
		e.setTask(task);
		e.setStatus("pending");
		int x=0;
		x=new MyDao().taskInsert(e);
		if(x!=0){
			ModelAndView mv = new ModelAndView("assigntask","msg","Task Assigned");
			return mv;
			
		}
		
		return mv1;
	}
		

}
