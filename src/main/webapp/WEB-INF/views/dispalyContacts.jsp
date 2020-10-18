<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Contact</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<script>
	function onDeleteConfirm(){
		return confirm("Are You Sure You Want to Delete...");
	}
</script>

</head>
<body>
<div>
<h1><a href="/">Add New Contact</a></h1>
<font color="green">${deleteMsg}</font>
</div>
	<div>
		<table border="1" style="width:50%" >
			<tr>
				<th>Conact Id</th>
				<th>Conact Name</th>
				<th>Conact Number</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${contacts}" var="contact">
				<tr>
					<td>${contact.cid}</td> 
					<td>${contact.cname}</td>
					<td>${contact.cnum}</td>
					<td>${contact.email}</td>
					<td><a href="/editContact?cid=${contact.cid}">Edit</a></td>
					<td><a href="/deleteContact?cid=${contact.cid}" onclick="return onDeleteConfirm()">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>