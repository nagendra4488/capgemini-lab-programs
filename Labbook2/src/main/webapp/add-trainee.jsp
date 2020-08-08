<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Trainee Details</h1><br>

<form action="/add" method="post">
Enter Trainee Name:<input type="text" name="txtName"> <br>
Enter Trainee ID :<input type ="number",name="traineeId"><br>
Enter Trainee Domain :<input type="text" name="traineeDomain"><br>
Enter Trainee Location :<input type ="text" name="traineeLocation"><br>
<button type="submit" >Add Trainee</button>
</form>


</body>
</html>