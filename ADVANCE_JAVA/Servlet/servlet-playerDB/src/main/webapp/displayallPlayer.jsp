<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.jsp.playerdb.entity.Player"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Player> players = (List)request.getAttribute("playersList");
	%>


	<table border="">
		<tr>
			<th>PlayerId</th>
			<th>Title</th>
			<th>Age</th>
			<th>Nationality</th>
			<th>Team</th>
			<th>salary</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
		for (Player player : players) {
		%>
		<tr>
			<td><%=player.getPlayerId()%></td>
			<td><%=player.getTitle()%></td>
			<td><%=player.getAge()%></td>
			<td><%=player.getNatinality()%></td>
			<td><%=player.getTeam()%></td>
			<td><%=player.getSalary()%></td>
			<td><a href="find-by-id?playerId=<%=player.getPlayerId()%>">Update</a></td>
			<td><a href="delete-by-id?playerId=<%=player.getPlayerId()%>">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
<h2><a href="index.jsp"">Go Back to dashboadr</a></h2>
</body>
</html>