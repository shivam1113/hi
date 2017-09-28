<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<script src="js/jquery-1.12.3.js" type="text/javascript"></script>
	<script src="js/MyJSLib.js" type="text/javascript"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Entry Employee Page</title>
	</head>
	<body>
		<center>
		<form:form method="post" modelAttribute="employee" action="submitEmpDetails.do">
  		
  		<label for="empNm">Enter Name:</label>
  		<form:input path="empNm" id="empNm" type="text"/><br/>
  		<form:errors path="empNm" name="error" ></form:errors><br/>
  		
  		
  		<label for="sal">Enter Salary:</label>
  		<form:input path="empSal" id="sal" type="text"/><br/>
  		
  		<label for="hireDate">Enter Date of Joining:</label>
  		<form:input path="hireDate" id="hireDate" type="text"/><br/>
  		
  		<label for="email">Enter Email Id:</label>
  		<form:input path="email" id="email" type="text"/><br/>
  		<form:errors path="email" name="error" ></form:errors><br/>
  		
  		<input type="submit" value="Submit Details"/>
		</form:form>
		</center>
	</body>
</html>