<%@page import="com.capgi.hbms.admin.model.AdminModel"%>
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
<th>Hotel Id</th>
<th>Hotel Name</th>
</tr>
<%
List<AdminModel> listhotelsadmin=(List<AdminModel>)request.getAttribute("listhotelsadmin");


for(AdminModel am:listhotelsadmin){
	
	out.print("<tr><td>"+am.getHotel_id()+"</td>");
	out.print("<td>"+am.getHotel_name()+"</td>");
	
}



%>
</table>

</body>
</html>