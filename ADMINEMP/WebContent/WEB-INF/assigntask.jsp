<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>ASSIGN-TASK</h1>
${msg}
</center>
<hr>
<pre>
<form action="./adminhome"><input type="submit" value="HOME"> </form>
<form action="./givetask">
                                                                EID               :    <input type="text" name="empid" />
                                                                   
                                                                TASK              :    <input type="text" name="task"/>

                                                               
                                                                                     <input type="submit" value="GIVE-TASK" >
</form>

</body>
</html>