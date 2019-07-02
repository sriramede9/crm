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
	color: white;
	background-color: #008CBA;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
}
</style>

<script type="text/javascript">
	function fun() {
		var txt = "hello bmro";

		if (!confirm("are you sure")) {

			return false;

		}

	}
</script>

<meta charset="ISO-8859-1">
<title>List customers</title>
</head>
<body>
	<h1>CRM - Customer Relationship Manager</h1>


	<button id="formbutton" value="click"
		onclick="window.location.href='add'; return false;">Click to
		add New Customer</button>
	<br>
	<br>

	<table id="customers">
		<tr>
			
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Id</th>
			<th>Action</th>
		</tr>



		<c:forEach items="${list}" var="item">

			<c:url var="updateLink" value="/customer/updateform">

				<c:param name="customerid" value="${item.id}"></c:param>
			</c:url>

			<c:url var="deleteLink" value="/customer/deleteform">

				<c:param name="customerid" value="${item.id }"></c:param>

			</c:url>

			<tr>
				
				<td>${item.first_name}</td>
				<td>${item.last_name}</td>
				<td>${item.email}</td>
				<td><a href="${updateLink}">Update</a>|<a name="del"
					onclick="fun()" href="${deleteLink }">delete</a></td>

			</tr>
		</c:forEach>
	</table>









</body>
</html>