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
    <h1>Kotlin MVC Project for Selenium Showcasing</h1>
	<p>
	    This project has been set up for two purposes:
	    <ol>
	    <li> <b>To showcase the benefits of the Kotlin language:</b> This project has been
	    written in Kotlin. Kotlin (<a href="https://kotlinlang.org/">https://kotlinlang.org/</a>)
	    is a new language which is completely interoperable with Java (1.6 onwards) and which addresses
	    a number of the issues with the Java language (e.g null safety, checked exceptions, verbose
	    boilerplate code). A showcase of these benefits can be found in the unit tests for the source code of this
	    project.</li>
	    <li> <b>To showcase Selenium:</b> Selenium is a tool for automated smoke testing of web based applications. In this MVC project
	    we wanted to demonstrate a wide as possible selection of ways one might interact with a web page to cover as much
	    of the automation capabilities of Selenium as possible. The navigation below provides links to three such scenarios.</li>
	    </ol>
	</p>

<br>
<h2>Navigation:</h2>
<ul>
<li><a href="${pageContext.request.contextPath}/manosMaker">HTML Form Example</a></li>
<li><a href="${pageContext.request.contextPath}/fileUploader">File Upload Example</a></li>
<li>Javascript/Bootstrap Example (WIP)</li>
</ul>

<footer>
<p>Written by T. Croft & S. Webster</p>
</footer>

</body>
</html>