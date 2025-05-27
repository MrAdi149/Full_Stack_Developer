<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Enter the vehicle details</h2>
<form action="add-vehicle" method="post">
<input type="text" placeholder="enter model" name ="model"> <br>
<input type="text" placeholder="enter brand" name ="brand"> <br>
<input type="text" placeholder="enter type" name ="type"> <br>
<input type="number" placeholder="enter price" name ="price"> <br>
<input type="text" placeholder="enter colour" name ="colour"> <br>
<input type="submit" value="ADD VEHICLE">
</form>
</body>
</html>