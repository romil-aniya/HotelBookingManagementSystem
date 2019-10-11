<%@page import="com.capgi.hbms.admin.model.RoomModel"%>
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
<th>Room Id</th>
<th>Room Type </th>
</tr>
<%
List<RoomModel> listroomsadmin=(List<RoomModel>)request.getAttribute("listroomssadmin");


for(RoomModel am:listroomsadmin){
	
	out.print("<tr><td>"+am.getRoom_id()+"</td>");
	out.print("<td>"+am.getRoom_type()+"</td>");
	
}
%>

</table>
</body>
</html>