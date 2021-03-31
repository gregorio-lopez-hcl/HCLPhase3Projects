<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>

<h1>User Home-Task Page</h1>

<h2>Welcome User ${User.getId} </h2>

<h3>Choose an option:</h3>

<a href="/list">List Current Tasks</a><br>
<a href="/addtask">Add New Task</a><br>
<a href="/deletetask">Delete Task</a><br>
<a href="/edittask">Edit Task</a><br>

</body>
</html>