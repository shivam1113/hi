<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<script src="js/jquery-1.12.3.js" type="text/javascript"></script>
	<script src="js/MyJSLib.js" type="text/javascript"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Update Name</title>
	</head>
	<body>
		<h1>Capgemini India Pvt. Ltd.</h1>
		<h3>${pageHead}</h3>
		<center>
		<%-- <form action="submitNewEmpName.do" >
			<label for="empNo"></label>
			<select name="empNo">
				<c:forEach items="${idList}" var="empNo">	
					<option value="${empNo}">${empNo}</option>
				</c:forEach>
			</select><br/>
			<label for="newName"></label>
			<input type="text" name="newName" id="newName" />		
			<input type="submit" value="Submit">
			 --%>
			 
			 <form action="submitNewEmpName.do">
	
		<label for="traineeId">Enter Trainee Id:</label>
  		<input name="traineeId" id="traineeId" type="number"/><br/>		
  		
  		<label for="traineeName">Enter Trainee Name:</label>
  		<input name="traineeName" id="traineeName" type="text"/><br/>	
  		
  		<label for="traineeDomain">Enter Trainee Domain:</label>
  		<input name="traineeDomain" id="traineeDomain" type="text"/><br/>
  			
  		<label for="traineeLocation">Enter Trainee Location:</label>
  		<input name="traineeLocation" id="traineeLocation" type="text"/><br/>	
  		
  		
		<input type="submit" value="Update"/>
		</form>
			
	
		</center>
	</body>
</html>