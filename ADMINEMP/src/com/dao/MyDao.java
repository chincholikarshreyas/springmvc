package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.db.*;

import com.bean.*;


public class MyDao {
	public int checkLogin(String uid,String pwd, HttpServletRequest request)
	{
		int x=0;
	
		try(Connection con=new DbOperation().start())
		{
			PreparedStatement ps=con.prepareStatement("select * from adminlogin where uid=? and password=?");
			ps.setString(1,uid);
			ps.setString(2,pwd);
			ResultSet rs=ps.executeQuery();
			PreparedStatement ps2 = con.prepareStatement("select * from empregister where email_id=? and password=?");
			ps2.setString(1, uid);
			ps2.setString(2, pwd);
			ResultSet rs2 = ps2.executeQuery();
			if(rs.next()){
	
		//	HttpSession session = request.getSession();
		//	session.setAttribute("uid", uid);
				x=1;
			} else if (rs2.next()) {

	
			//	HttpSession session = request.getSession();
			//	session.setAttribute("email_id", uid);
			//	session.setAttribute("user", rs2.getString("name"));
				x=1;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return x;
	}
	 public int EmpInsert(EmpBean e)
	 {
		 int x=0;
		 try(Connection con=new DbOperation().start())
			{
				PreparedStatement ps=con.prepareStatement("insert into empregister(name,DOJ,email_id,password)values(?,?,?,?)");
				
				ps.setString(1,e.getName());
				ps.setString(2, e.getDOJ());
				ps.setString(3,e.getEmail_id());
				ps.setString(4,e.getPassword());
				
				x=ps.executeUpdate();
			}catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			
		 return x;
	 }
	 public ArrayList<EmpBean> viewEmpDetails()
		{
		 ArrayList<EmpBean> list=new ArrayList<>();
		 try(Connection con=new DbOperation().start())
			{
				PreparedStatement ps=con.prepareStatement("select * from empregister");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					EmpBean e=new EmpBean();
					e.setEid(rs.getInt("Eid"));
					e.setName(rs.getString("name"));
					e.setEmail_id(rs.getString("email_id"));
					e.setDOJ(rs.getString("DOJ"));
					list.add(e);
				}
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			return list;
		}
	 public int taskInsert(TaskBean e)
	 {
		 int x=0;
		 try(Connection con=new DbOperation().start())
			{
				PreparedStatement ps=con.prepareStatement("insert into task(empid,task,status)values(?,?,?)");
				ps.setInt(1, e.getEmpid());
				ps.setString(2, e.getTask());
				ps.setString(3,e.getStatus());
				x=ps.executeUpdate();
			}catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			
		 return x;
	 }
	 public ArrayList<TaskBean> viewtaskDetails()
		{
		 ArrayList<TaskBean> list=new ArrayList<>();
		 try(Connection con=new DbOperation().start())
			{
				PreparedStatement ps=con.prepareStatement("select * from task");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					TaskBean e=new TaskBean();
					e.setTaskid(rs.getInt("taskid"));
					e.setEmpid(rs.getInt("empid"));
					e.setTask(rs.getString("task"));
					e.setStatus(rs.getString("status"));
					list.add(e);
				}
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			return list;
		}
	

}
