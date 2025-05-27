
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="hello.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
int a = 10;
String name = "tharun";
String[] names = {"arun","varun","tharun"};

%>

<h1><%= a %></h1>
<h1><%= name %></h1>

<%for(String s: names) { %>
<%=s%>
<%} %>

</body>
</html>