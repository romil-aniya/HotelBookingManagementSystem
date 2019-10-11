<%@page import="com.capgi.hbms.admin.model.BookingModel"%>
<%@ page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Booking Id</th>
<th>Room Id</th>
<th>User Id</th>
<th>Booked from</th>
<th>Booked To</th>
<th>Number of adults</th>
<th>Number of children</th>
<th>amount</th>
</tr>
<%
List<BookingModel> listbookingmodel=(List<BookingModel>)request.getAttribute("viewBookingCustomer");


for(BookingModel bm:listbookingmodel){
	out.print("<tr><td>"+bm.getBooking_id()+"</td>");
	out.print("<td>"+bm.getRoom_id()+"</td>");
	out.print("<tr><td>"+bm.getUser_id()+"</td>");
	out.print("<td>"+bm.getBooked_from()+"</td>");
	out.print("<tr><td>"+bm.getBooked_to()+"</td>");
	out.print("<td>"+bm.getNo_of_adults()+"</td>");
	out.print("<tr><td>"+bm.getNo_of_children()+"</td>");
	out.print("<td>"+bm.getAmount()+"</td>");
}



%>
</table>
</body>
</html>