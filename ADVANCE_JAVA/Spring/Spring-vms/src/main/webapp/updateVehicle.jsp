<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.jsp.spring.mvc.vms.entity.Vehicle"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%Vehicle vehicle = (Vehicle)request.getAttribute("find-vehicle"); %>

<form action="update-vehicle" method="post">
<input type="text" value="<%=vehicle.getId()%>" readonly="readonly">
<input type="text" value="<%=vehicle.getModel()%>" name="model">
<input type="text" value="<%=vehicle.getBrand()%>" name="brand">
<input type="text" value="<%=vehicle.getType()%>" name="type">
<input type="number" value="<%=vehicle.getPrice()%>" name="price">
<input type="text" value="<%=vehicle.getColour()%>" name="colour">
<input type="submit" value="UPDATE VEHICLE">
</form>

</body>
</html>