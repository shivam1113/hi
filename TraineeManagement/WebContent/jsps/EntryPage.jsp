<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<script src="js/jquery-1.12.3.js" type="text/javascript"></script>
	<script src="js/MyJSLib.js" type="text/javascript"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Entry Trainee Page</title>
	</head>
	<body>
		<center>
		<form:form method="post" modelAttribute="employee" action="submitEmpDetails.do">
  		
  		<label for="traineeId">Enter Trainee Id:</label>
  		<form:input path="traineeId" id="traineeId" type="number"/><br/>
  		
  		<label for="traineeName">Enter Trainee Name:</label>
  		<form:input path="traineeName" id="traineeName" type="text"/><br/>
  		
  		<label for="traineeLocation">Trainee Location:</label>
  	<%-- 	<form:input path="traineeLocation" id="traineeLocation" type="checkbox"/> --%>
  		<form:radiobutton path="traineeLocation" id="traineeLocation" value="Chennai"/>Chennai	
  		<form:radiobutton path="traineeLocation" id="traineeLocation" value="Banglore"/>Banglore
  		<form:radiobutton path="traineeLocation" id="traineeLocation" value="Pune"/>Pune
  		<form:radiobutton path="traineeLocation" id="traineeLocation" value="Mumbai"/>Mumbai<br/>
  		  		
  		<label for="traineeDomain">Trainee Domain:</label>
  		<form:select path="traineeDomain" id="traineeDomain">
  		<form:option value="JEE">JEE</form:option>
  		<form:option value="JPA">JPA</form:option>
  		<form:option value="Python">Pyhton</form:option>
  		<form:option value="DotNet">DotNet</form:option>
  		</form:select><br/>
  		
  		
  		<input type="submit" value="Submit Details"/>
		</form:form>
		</center>
	</body>
</html>