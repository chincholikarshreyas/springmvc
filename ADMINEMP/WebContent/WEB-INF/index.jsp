<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
   <h1>LOGIN</h1>
   <hr/>

   <form action="./CheckLogin" >
   <pre>
   
Login ID  :  <input type="text" name="uid" />
   
Password  :  <input type="password" name="pwd" />
   
Type      :  <select name="type">
             <option  selected>ADMIN</option>
             <option >EMPLOYEE</option>
                               
</select>    

             <input type="Submit"/>
               </pre>
      </form>
 
</center>

</body>
</html>