<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form Page</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student" method="get">
	
	First Name: <form:input path="firstName" />
	<br><br>
	Last Name: <form:input path="lastName" />
	
	<input type="button" value="Submit"/>
	
	</form:form>

</body>
</html>