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
<h1>REGISTER EMPLOYEE</h1>
${msg}
</center>
<hr>
<pre>
<form action="./adminhome"><input type="submit" value="HOME"> </form>
<form action="./registeremp">
                                                                Name               :    <input type="text" name="name" id ="name"/>
                                                                   
                                                                DOJ                :    <input type="date" name="doj"/>

                                                                EmailId            :    <input type="text" name="email_id" id ="email_id"/>

                                                                Password           :    <input type="password" name="pwd" id ="pwd"/>

                                                                Confirm Password   :    <input type="password" name="cnfpwd" id ="cnfpwd"/>

                                                                                     <input type="submit" value="REGISTER" onclick="return Validate()">
</form>
</pre>
<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("pwd").value;
        var confirmPassword = document.getElementById("cnfpwd").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>
</body>
</html>