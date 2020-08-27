<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/ran">
  <label for="count">Enter the count:</label>
  <input type="text" name="count" ><br>
  <input type="submit" value="Submit">
</form>
<h1>${sessionScope.Result1}   ${sessionScope.Result2 }</h1>
</body>
</html>