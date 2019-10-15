<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.capgi.hbms.admin.model.RoomModel" %>
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookEasy</title>
<style>
    .div-style-1 {
      background-color: lightgrey;
      text-align: center;
      border: 3px bisque;
      padding: 10px;
      margin: 5px;
    }

    h1,
    h2 {
      text-align: center;
      text-transform: capitalize;
      color: black;
    }

    p {
      text-indent: 50px;
      text-align: justify;
      letter-spacing: 3px;
      font-family: Georgia, 'Times New Roman', Times, serif;
      font-size: 25px;
    }
    p1{
text-indent: 50px;
  text-align: justify;
  letter-spacing: 3px;
  font-family: Georgia, 'Times New Roman', Times, serif;
  font-size: 20px;
}

    a {
      text-decoration: none;
      color: blue;
    }
  </style>
</head>
<body ><%
    List<RoomModel> viewRoomCustomer = (List<RoomModel>)request.getAttribute("viewRoomCustomer");
    for(RoomModel rm: viewRoomCustomer){
    	out.print("<h1>BookEasy</h1>");
    	out.print("<div id='d1' class='div-style-1'>");
    	out.print(" <h2>"+rm.getRoom_no()+"</h2><br>");
    	out.print(" <p><br>"+rm.getRoom_type()+"</p><br>");
    	out.print("<p><br>"+rm.getPer_night_rate()+"</p><br>");
    	out.print("<p><br>"+rm.getAvailability()+"</p><br>");
    	out.print("<form>");
    	out.print("<input type='submit' value='Book now' style='background-color:lightgreen'><br>");
    	out.print("</form>");
    	out.print("</div>");
    }

    %>

</body>

</html>