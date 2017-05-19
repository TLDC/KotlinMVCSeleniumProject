<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"
               uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kotlin MVC Project</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/upload" method="POST" enctype="multipart/form-data">
		<p>
			File: <input type="file" name="file" multiple="true" />
		</p>
		<input type="submit" value="Upload It" />
	</form>


</body>
</html>