<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<script src="js/jquery-1.12.3.js" type="text/javascript"></script>
	<script src="js/MyJSLib.js" type="text/javascript"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee List</title>
	</head>
	<body>
		<h1>Capgemini India Pvt. Ltd.</h1>
		<h3>${pageHead}</h3>
	
		<form action="getUpdatingId.do">
	
		<label for="traineeId">Enter Trainee Id:</label>
  		<input name="traineeId" id="traineeId" type="number"/><br/>		
		<input type="submit" value="Modify"/>
		</form>
		
		
		
		
		
	</body>
</html>