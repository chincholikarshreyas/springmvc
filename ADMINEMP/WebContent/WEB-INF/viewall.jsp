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
<h1>VIEW-ALL EMPLOYEE LIST</h1>
</center>
<hr>
<form action="./adminhome"><input type="submit" value="HOME"> </form>
<%
MyDao m = new MyDao();
ArrayList<EmpBean> list=m.viewEmpDetails();
%>
<center><table border=1 width="75%" bgcolor="#cccccc" >
<tr><th>EID</th><th>NAME</th><th>DOJ</th><th>EMAIL-ID</th></tr>
<%for (EmpBean e:list){ %>
<tr>
<td><%= e.getEid()%></td>
<td><%= e.getName()%></td>
<td><%= e.getDOJ()%></td>
<td><%= e.getEmail_id()%></td>
</tr>




<%} %>

</table>
</center>
</body>

</html>