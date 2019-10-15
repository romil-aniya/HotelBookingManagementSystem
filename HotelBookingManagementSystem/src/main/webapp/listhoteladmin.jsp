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

<table border="solid">
<tr>
<th>Hotel Id</th>
<th>City</th>
<th>Hotel Name</th>
<th>Address</th>
<th>Description</th>
<th>Average rate</th>
<th>Phone no1</th>
<th>Phone no2</th>
<th>Rating</th>
<th>Email</th>
<th>Fax</th>
</tr>
<%
List<AdminModel> listhotelsadmin=(List<AdminModel>)request.getAttribute("listhotelsadmin");


for(AdminModel am:listhotelsadmin){
	
	out.print("<tr><td>"+am.getHotel_id()+"</td>");
	out.print("<<td>"+am.getCity()+"</td>");
	out.print("<td>"+am.getHotel_name()+"</td>");
	out.print("<td>"+am.getAddress()+"</td>");
	out.print("<td>"+am.getDescription()+"</td>");
	out.print("<td>"+am.getAvg_rate_per_night()+"</td>");
	out.print("<td>"+am.getPhone_no1()+"</td>");
	out.print("<td>"+am.getPhone_no2()+"</td>");
	out.print("<td>"+am.getRating()+"</td>");
	out.print("<td>"+am.getEmail()+"</td>");
	out.print("<td>"+am.getFax()+"</td></tr>");
	
}

%>
</table>

</body>
</html>