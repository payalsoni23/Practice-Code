<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details Page</title>
</head>
<body>

		Student details:
		<br><br>
		${student.firstName} ${student.lastName}
		<%-- old name: ${param.studentName} studentName is parameter from JSP file, hence "param." is used--%>
		<%-- new name: ${newStudent} newStudent is parameter from controller --%>
		<br>
		Mobile number - ${student.mobileNumber}
		<br>
		Number of passes - ${student.passes}
		<br>
		Course code - ${student.code}
		<br>
		Country - ${student.country}
		<br>
		Programming Language - ${student.programmingLang}
		<br>
		Operating Systems:
		<ol>
			<c:forEach var="temp" items="${student.operatingSystem}">
			<li> ${temp} </li>
			</c:forEach>
		</ol>
</body>
</html>