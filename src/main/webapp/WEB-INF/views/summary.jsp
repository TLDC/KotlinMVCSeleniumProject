<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>Your Manos</title>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
</head>
<body>
	<div class="container text-center">    	
    	<div class="jumbotron">
		  <h1>Your Manos</h1>
		</div>
    	
    	<div class="row">
			<ul class="nav nav-tabs">
			  <li role="presentation" class="active"><a href="#name" onclick="showDiv('nameDiv');">Name</a></li>
			  <li role="presentation"><a href="#age" onclick="showDiv('ageDiv');">Age</a></li>
			  <li role="presentation"><a href="#gender" onclick="showDiv('genderDiv');">Gender</a></li>
			  <li role="presentation"><a href="#height" onclick="showDiv('heightDiv');">Height</a></li>
			  <li role="presentation"><a href="#confirmed" onclick="showDiv('confirmedDiv');">Real Manos!?</a></li>
			</ul>
		</div>
		
		<div class="row div" id="nameDiv" style="display: none;">
			<h1 id="name">${manos.name} Manos</h1>
		</div>
		
		<div class="row div" id="ageDiv" style="display: none;">
			<h1 id="age">${manos.age} years old</h1>
		</div>
		
		<div class="row div" id="genderDiv" style="display: none;">
			<h1 id="gender">${manos.gender}</h1>
		</div>
		
		<div class="row div" id="heightDiv" style="display: none;">
			<h1 id="height">${manos.height}cm</h1>
		</div>
		
		<div class="row div" id="confirmedDiv" style="display: none;">
			<h1 id="confirmed">I am a <c:if test="${!manos.confirmed}">FAKE </c:if>Manos</h1>
		</div>
    </div>
    
    <script>
    	function showDiv(toShow) {
    		var divElements = document.getElementsByClassName("div");
    		for (var i=0; i<divElements.length; i++) {
    			divElements[0].style.display = "none";
    		}
    		var show = document.getElementById(toShow);
    		show.style.display = "";
    	}
    </script>
</body>
</html>