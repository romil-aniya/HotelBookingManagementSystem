<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.capgi.hbms.admin.model.AdminModel" %>
<!DOCTYPE html>
<html>
<head>
<style>
.div-style-1 {
  border: 10px solid gray;
  padding: 20px;
  background-color:honeydew;
  margin:10px;
}

h1 {
  text-align: left;
  text-transform: capitalize;
  color: green;
}

p {

  letter-spacing: 3px;
  font-family: Georgia, 'Times New Roman', Times, serif;
  font-size: 20px;
}
p1{
text-indent: 50px;
  text-align: right;
  letter-spacing: 3px;
  font-family: Georgia, 'Times New Roman', Times, serif;
  font-size: 20px;
}

a {
  text-decoration: none;
  color:blue;
}
</style>
</head>
<body>
<%
    List<AdminModel> viewHotelCustomer = (List<AdminModel>)request.getAttribute("viewHotelCustomer");
    for(AdminModel am: viewHotelCustomer){
    	out.print("<div id="+"d1"+" class="+"div-style-1>");
    	out.print("<h1>"+am.getHotel_name()+"</h1>");
    	out.print("<p1>"+am.getDescription()+"</p1>");
    	out.print("<p><b>Address: </b>"+am.getAddress()+"</p>");
    	out.print("<br> <p1><b>Phone number: </b>"+am.getPhone_no1()+"</p1>");
    	out.print("<p1> <b>Email: </b>"+am.getEmail()+"</p1>");
    	out.print("<br><p1><b>Average rate per night: </b>"+am.getAvg_rate_per_night()+"</p1>");
    	out.print("<p1><b> Rating: </b> "+am.getRating()+"</p1>");
    	out.print("</div>");
    	out.print("<form action='ViewRoomCustomerController' method='get'>");
    	out.print("<input type='submit' value='View rooms' style='background-color:cornflowerblue'/>");		
    	out.print("</form>");
    	
    }

    %>
    
</body>
</html>