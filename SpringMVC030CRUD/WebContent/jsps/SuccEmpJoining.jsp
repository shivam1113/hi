<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script src="js/jquery-1.12.3.js" type="text/javascript"></script>
	<script src="js/MyJSLib.js" type="text/javascript"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Joining Success</title>
	</head>
	<body>
			<h1>Capgemini India Pvt. Ltd.</h1>
			<h3>${pageHead}</h3>
		
		<table border='1'>
			<tr>
				<th>Employee Number</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
				<th>Hire Date</th>
				
			</tr>
			<%-- <c:forEach items="${emp}" var="emp">  Since recieving single employee --%>
					<tr>
						<td>${emp.empNo}</td>
						<td>${emp.empNm}</td>
						<td>${emp.empSal}</td>
						<td>${emp.hireDate}</td>
						<%-- <td><a href="getEmpDetails.do?empNo=${emp.empNo}"></a></td> --%>
					</tr>
			<%-- </c:forEach> --%>
		</table>
		<a href="getHomePage.do">Go to Home Page</a><br/>
		<a href="getEmpList.do">Go to List</a>
	</body>
</html>