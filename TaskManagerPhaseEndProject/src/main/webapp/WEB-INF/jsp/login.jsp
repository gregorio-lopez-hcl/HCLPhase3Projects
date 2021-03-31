<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

<form action="/login" method="post" name="form_name" id="form_id" class="form_class" >
	  <label for="name">Name:</label><br>
	  <input type="text" id="name" name="name"><br>
	  <label for="password">Password:</label><br>
	  <input type="password" id="password" name="password"><br>


<input type="submit" value="Login">
	</form>

</body>
</html>