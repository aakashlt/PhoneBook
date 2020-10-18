<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WellCome To PhoneBook</title>
</head>
<body>

	<table >

		<form:form action="saveContact" method="post" modelAttribute="contact">
			<tr>
			   <td><form:hidden path="cid" id="cid" /></td>
				<td><label for="cname">Contact Name</label></td>
				<td><form:input path="cname" id="cname" /></td>
				
			</tr>
			<tr>
				<td><label for="cnum">Contact Number</label></td>
				<td><form:input path="cnum" id="cnum" /></td>
			</tr>
			<tr>
				<td><label for="email">Email</label></td>
				<td><form:input path="email" id="email" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</form:form>
	</table>
	
	<div>
		<font color="green">${succMsg}</font>
		 <font color="red">${errorMsg}</font>
	</div>
	<h1><a href="dispalyContacts">dispalyContacts</a></h1>
</body>
</html>