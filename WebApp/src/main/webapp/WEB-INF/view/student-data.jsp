<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<br>
		Country - ${student.country}
		<br>
		Programming Language - ${student.programmingLang}
		<br>
		Operating Systems:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystem}">
			<li> ${temp} </li>
			</c:forEach>
		</ul>
</body>
</html>