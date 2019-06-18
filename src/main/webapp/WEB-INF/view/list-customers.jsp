<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<style type="text/css">
body {
	background: yellow;
}

#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}

h1 {
	color: white;
	background-color: green;
}

#formbutton {
	padding: 5px;
	color: white;
	background-color: green;
}
</style>

<meta charset="ISO-8859-1">
<title>List customers</title>
</head>
<body>
	<h1>CRM - Customer Relationship Manager</h1>


	<button id="formbutton" value="click"
		onclick="window.location.href='add'; return false;">Click to
		add New Customer</button>
	<br>

	<table id="customers">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Id</th>
		</tr>

		<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.first_name}</td>
				<td>${item.last_name}</td>
				<td>${item.email}</td>
				
			</tr>
		</c:forEach>
	</table>









</body>
</html>