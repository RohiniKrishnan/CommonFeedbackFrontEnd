<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
    <%@include file="footer.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>

<script type="text/javascript">
function validate(){
	var username = document.getElementById("uname").value;
	var password = document.getElementById("psw").value;
	if ( username == "Admin" && password == "admin123"){
	alert ("Login successfully");
	/* window.location = "http://localhost:7171/response"; */ // Redirecting to other page.
	return true;
	}
	else return "Invalid userId and password";
}
</script>
</head>
<body align="center">
<form action="http://localhost:7171/response"></form>
  <div class="container">
  </br></br>
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" id="uname" required></br></br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required></br></br>
        <a href="http://localhost:7171/response">login</a></br></br>
   <!--  <button type="submit">Login</button> -->
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
  </br></br>
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn" onclick="return validate()">Cancel</button>
    
  </div>
  </form>
</body>
</html>