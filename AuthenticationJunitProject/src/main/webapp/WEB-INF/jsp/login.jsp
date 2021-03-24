<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

<h2>Please login below: </h2><br>

<form action="login" method="post" >
	 
	  <label for="name">Name:</label><br>
	  <input type="text" id="name" name="name" required> <br>
	 
	  <label for="password">Password:</label><br>
	  <input type="text" id="password" name="password" required><br><br>
	  
	  <input type="submit" value="Enter">
	</form>
	
	<br>
	<a href="/">Return Home</a>
	<br>


</body>
</html>