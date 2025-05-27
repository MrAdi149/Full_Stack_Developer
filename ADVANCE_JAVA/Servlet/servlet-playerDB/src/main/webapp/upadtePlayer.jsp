<%@page import="com.jsp.playerdb.entity.Player"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Player player = (Player) request.getAttribute("playerObject"); %>

<h1>Update player details</h1>
<form action="save-payer" method="post">
<input type="number" name="playerId" value="<%=player.getPlayerId()%>" readonly="readonly"> <br>
<input type="text"  name="title" value="<%=player.getTitle()%>"> <br>
<input type="number" name="age" value="<%=player.getAge()%>"> <br>
<input type="text"  name="nationality" value="<%=player.getNatinality()%>"> <br>
<input type="text"  name="team" value="<%=player.getTeam()%>"> <br>
<input type="number"  name="salary" value="<%=player.getSalary()%>"> <br>
<input type="submit" value="UPDATE PLAYER">

</form>
</body>
</html>