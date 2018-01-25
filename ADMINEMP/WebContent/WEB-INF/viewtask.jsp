<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import=" java.util.ArrayList" %>
    <%@ page import="com.dao.*" %>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>VIEW-TASK</h1>
</center>
<hr>
<form action="./adminhome"><input type="submit" value="HOME"> </form>
<%
MyDao m = new MyDao();
ArrayList<TaskBean> list=m.viewtaskDetails();
%>
<center><table border=1 width="75%" bgcolor="#cccccc" >
<tr><th>TASK-ID</th><th>EMPPLOYEE-ID</th><th>TASK</th><th>STATUS</th></tr>
<%for (TaskBean e:list){ %>
<tr>
<td><%= e.getTaskid()%></td>
<td><%= e.getEmpid()%></td>
<td><%= e.getTask()%></td>
<td><%= e.getStatus()%></td>
</tr>




<%} %>

</table>
</center>

</body>
</html>