<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ListHotelsAdminController" method="get">
	
		<input type="submit" name="listhotelsadmin" value="List Hotels">
	
	</form>
	
	<form action="ListRoomsAdminController">
	
		<input type="submit" value="List Rooms">
	
	</form>
	
	<form action="ListBookingsInHotelAdminController">
	
		<input type="submit" value="List Rooms">
	
	</form>
	
	<form method="post" action="ModifyHotelAdminController">
		<input type="submit" value="<Modify Hotel">
	</form>
	
</body>
</html>