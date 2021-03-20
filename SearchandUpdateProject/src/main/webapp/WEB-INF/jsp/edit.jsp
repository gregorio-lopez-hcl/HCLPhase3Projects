<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Users Table</title>
</head>
<body>
<h2>Edit Existing User</h2>

<h3>User to edit: ${users.toString()}</h3>


<form action="edit" method="post" name="form_name" id="form_id" class="form_class" >
	 
	  <label for="id">Id:</label><br>
	  <input type="text" id="id" name="id" value = "${user.id}"><br>
	  
	  <label for="name">Name:</label><br>
	  <input type="text" id="name" name="name"><br>
	  
	  <label for="email">Email:</label><br>
	  <input type="text" id="email" name="email"><br>
	 
	  <label for="password">Password:</label><br>
	  <input type="text" id="password" name="password"><br><br>
	  
	  <input type="submit" value="Enter">
	</form>
	<br> 
	<a href="/">Return Home</a> <br> 

</body>
</html>