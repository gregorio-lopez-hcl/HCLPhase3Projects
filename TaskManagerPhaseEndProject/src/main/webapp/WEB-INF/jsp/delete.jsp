<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Task</title>
</head>
<body>


<jsp:include page="list.jsp" />

<h2>Delete Task</h2>



<form action ="/delete" method = "post">

	<label for = "id">Enter User ID:</label><br>
	<input type="number" name="id"><br>
	<input type ="submit" value="Delete">



</form>

<a href = "/userhome">Return to User Home</a>

</body>
</html>