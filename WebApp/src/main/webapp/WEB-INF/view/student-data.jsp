<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details Page</title>
</head>
<body>

		Hello Student
		<br>
		${student.firstName}
		<%-- old name: ${param.studentName} studentName is parameter from JSP file, hence "param." is used--%>
		<br>
		${student.lastName}
		<%-- new name: ${newStudent} newStudent is parameter from controller --%>
</body>
</html>