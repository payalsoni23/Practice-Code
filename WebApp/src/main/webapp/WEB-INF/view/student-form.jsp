<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
 .error {color:red}
</style>

<title>Student Form Page</title>
</head>
<body>

<i>Fill student details. (*) - required fields.</i>
<br><br><br>

	<form:form action="processForm" modelAttribute="student">
	
	First Name (*): <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error" />
	<br><br>
	Last Name: <form:input path="lastName" />
	<br><br>
	Mobile number (*): <form:input path="mobileNumber" />
	<form:errors path="mobileNumber" cssClass="error" />
	<br><br>
	Number of passes (*): <form:input path="passes" />
	<form:errors path="passes" cssClass="error" />
	
	<br><br>
	Course Code: <form:input path="code" />
	<form:errors path="code" cssClass="error" />
	
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
	
	<br><br><br>
	
	Favorite Language:
	
	Java <form:radiobutton path="programmingLang" value="Java" />
	PHP <form:radiobutton path="programmingLang" value="PHP" />
	Ruby <form:radiobutton path="programmingLang" value="Ruby" />
	C# <form:radiobutton path="programmingLang" value="C#" />
	
	<br><br>
	
	Operating Systems:
	
	Linux<form:checkbox path="operatingSystem" value="Linux" />
	Windows<form:checkbox path="operatingSystem" value="Windows" />
	Mac<form:checkbox path="operatingSystem" value="Mac" />
		
	<br><br>
	<input type="submit" value="Submit"/>
	
	</form:form>
	
</body>
</html>