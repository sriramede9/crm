<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Add Customer Form</title>
<style>
h1 {
	color: white;
	background-color: green;
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
</style>



</head>
<body>

	<h1>Add New Customer</h1>


	<form:form modelAttribute="customer" action="formresponse"
		method="post">
		<table id="customers">
			<tr>
				<td>First Name:</td>
				<td><form:input path="first_name" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="last_name" /></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					onclick="window.location.href='list'" value="Save Changes" /></td>

			</tr>
		</table>
	</form:form>

	<p>

		<a href="${pageContext.request.contextPath}/customer/list">Back to
			List</a>

	</p>

</body>
</html>