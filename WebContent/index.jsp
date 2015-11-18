<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
	<script type="text/javascript" src="resources/index.js"></script>
	<link rel="stylesheet" type="text/css" href="resources/main.css">
	
	<title>Visa Document Checker</title>
</head>


<body>
	<div id="welcomeBanner" class="navBanner">Welcome to the Visa Document Checklist</div>
	
	<div id="visaPanel">	
		<div class="welcomeInstruction">To begin, select the type of visa you are applying for:</div>
		
		<div id="choiceButtonContainer">
			<input id="load_FLR_M" type="submit" value="FLR(M)" 
				alt="Check your document list for a Further Leave To Remain (Marriage) Application" />
		</div>
	</div>
	
	<div id="checklistContainer"/>
</body>
</html>