<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Feedback</title>
</head>
<body>

<form action="/updatefeedback" method="post">
	
	  <label for="comments">Comment:</label><br>
	  <input type="text" id="comments" name="comments" required><br>
	  
	  <label for="rating">Rating:</label><br>
	  <input type="text" id="rating" name="rating" required><br><br>
	  
	  <label for="user">User:</label><br>
	  <input type="text" id="user" name="user" required><br>
	  
	  <input type="submit" value="Save Feedback">
	</form>



</body>
</html>