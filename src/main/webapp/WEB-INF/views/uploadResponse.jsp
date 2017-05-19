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
<h1>File <c:if test="${!response.success}">NOT</c:if> uploaded successfully</h1>
<br>
<c:if test="${!response.success}">Error message: ${response.errorMsg}</c:if>
<c:if test="${response.success}"><img src="${response.location}"/></c:if>

</body>
</html>