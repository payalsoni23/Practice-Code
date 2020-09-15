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
	<br><br>
	Country:
	<form:select path="country">
	
	<!-- when defining options manually -->
	<%-- <form:option value="India" label="India" />
	<form:option value="US" label="US" />
	<form:option value="UK" label="UK" />
	<form:option value="Germany" label="Germany" /> --%>
	
	<!-- when reading options from java linked hash map -->
	<form:options items="${student.countryCodes}"/>
	
	</form:select>
	<br><br>
	<input type="submit" value="Submit"/>
	
	</form:form>
	
	Favorite Language:
	
	Java <form:radiobutton path="programmingLang" value="Java" />
	PHP <form:radiobutton path="programmingLang" value="PHP" />
	Ruby <form:radiobutton path="programmingLang" value="Ruby" />
	C# <form:radiobutton path="programmingLang" value="C#" />
	<br>
	
	Operating Systems:
	
	Linux<form:checkbox path="operatingSystem" value="Linux" />
	Windows<form:checkbox path="operatingSystem" value="Windows" />
	Mac<form:checkbox path="operatingSystem" value="Mac" />

</body>
</html>