<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.capgi.hbms.admin.model.BookingModel" %>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="solid">
<tr>
<th>Booking ID</th>
<th>User ID</th>
<th>Amount</th>
</tr>
<%
List<BookingModel> listbookingsinhotel=(List<BookingModel>)request.getAttribute("listbookingsinhotel");


for(BookingModel bookingmodel:listbookingsinhotel){
	
out.print("<tr><td>"+bookingmodel.getBooking_id()+"</td>");
out.print("<td>"+bookingmodel.getUser_id()+"</td>");
out.print("<td>"+bookingmodel.getAmount()+"</td></tr>");
out.print("<td>"+bookingmodel.getRoom_id()+"</td></tr>");
out.print("<td>"+bookingmodel.getBooked_from()+"</td></tr>");
out.print("<td>"+bookingmodel.getBooked_to()+"</td></tr>");
out.print("<td>"+bookingmodel.getNo_of_adults()+"</td></tr>");
out.print("<td>"+bookingmodel.getNo_of_children()+"</td></tr>");
	
	
	
}



%>
</table>

</body>
</html>