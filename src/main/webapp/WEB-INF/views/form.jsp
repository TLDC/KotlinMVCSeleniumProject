<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"
				uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form"
				uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Your Manos</title>
</head>
<body>
	<form:form method="POST" action="/kotlin-mvc-project/addManos" modelAttribute="manos">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" id="name"/></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td>
					<form:select path="age" id="age">
						<form:option value="0" label="Please Select"/>
						<form:options items="${ageOptions}"/>
					</form:select>
				</td>		
			</tr>
			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:radiobutton path="gender" value="M" label="Male" id="maleGender"/>
				<form:radiobutton path="gender" value="F" label="Female" id="femaleGender"/></td>
				
			</tr>
			<tr>
				<td><form:label path="height">Height</form:label></td>
				<td><form:input path="height" id="height"/></td>
			</tr>
			<tr>
				<td><form:label path="confirmed">Confirm you are a Manos</form:label></td>
				<td><form:checkbox path="confirmed" id="confirmed"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" id="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>