<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Task</title>
</head>
<body>

<h2>Add New Task</h2>

<form action="/addtask" method="post">
 <label for="name">Task Name:</label><br>
  <input type="text" id="name" name="name"><br>
  <label for="sdate">Start Date:</label><br>
  <input type="date" id="sdate" name="sdate"><br>
  <label for="edate">End Date:</label><br>
  <input type="date" id="edate" name="edate"><br><br>
  <label for="desc">Description:</label><br>
  <textarea id="desc" name="desc" rows=10 cols=30></textarea><br>
  <label for="sev">Severity</label><br>
  <select id="sev" name="sev">
  	<option value="high">High</option>
  	<option value="medium">Medium</option>
  	<option value="low">Low</option>
  </select><br><br><br>
  <label for="user">User ID#:</label><br>
  <input type="number" id="user" name="user"><br>
  <br> 
  <br>
  <input type="submit" value="Add Task">

</form>
</body>
</html>