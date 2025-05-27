<%@page import="com.jsp.spring.mvc.vms.entity.Vehicle"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>DETAILS OF ALL VEHICLES</h1>

	<%
	List<Vehicle> vehicles = (List) request.getAttribute("all-Vehicle");
	%>

	<table border="">
		<tr>
			<th>id</th>
			<th>model</th>
			<th>brand</th>
			<th>type</th>
			<th>price</th>
			<th>color</th>
			<th>update</th>
			<th>delete</th>

		</tr>

		<%
		for (Vehicle vehicle : vehicles) {
		%>
		<tr>
			<td><%=vehicle.getId()%></td>
			<td><%=vehicle.getModel()%></td>
			<td><%=vehicle.getBrand()%></td>
			<td><%=vehicle.getType()%></td>
			<td><%=vehicle.getPrice()%></td>
			<td><%=vehicle.getColour()%></td>
			<td><a href="find-by-id?id=<%=vehicle.getId()%>">Update</a></td>
			<td><a href="delete-vehicle?id=<%=vehicle.getId()%>">Delete</a></td>

		</tr>
		<%
		}
		%>


	</table>

	<h2>
		<a href="index.jsp">Go Back to DashBoard</a>
	</h2>
</body>
</html>