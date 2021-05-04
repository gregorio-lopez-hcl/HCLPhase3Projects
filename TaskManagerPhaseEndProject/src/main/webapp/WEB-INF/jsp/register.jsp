<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h2>New User Registration</h2>

<form action="/register" method="post" name="form_name" id="form_id" class="form_class" >

	  <label for="name">Name:</label><br>
	  <input type="text" id="name" name="name"><br>
	  
	  <label for="email">Email:</label><br>
	  <input type="email" id="email" name="email"><br><br>
	  
	  <label for="password">Password:</label><br>
	  <input type="password" id="password" name="password"><br><br>
	  
	  <input type="submit" value="Register">
	</form>
	
	<br>
	<a href="/">Return Home</a>
	<br>
	<p>Existing User? Login here: <a href="/login">Login</a> <p>

</body>
</html>