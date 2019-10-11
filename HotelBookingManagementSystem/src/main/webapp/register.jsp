<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>REGISTRATION FORM</title>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  <style>
    ul li
    {
        display:inline;
        padding:30px;
            }
            body{
                overflow: scroll;
            }
  </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <a class="navbar-brand" href="#"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
       <center><b><i><h3 style="color:white;font-family:century gothic; font-size:40px; ">BOOKEAZY</h3></i></b></center>
    </ul>
  </div>
</nav>
<br>


    <form action="RegisterCustomerController" method="post">
    
	<caption><center><h1>Registration Form</h1></center></caption>
 
    <table border="1" align="center" width="400" bgcolor="#99A3A4" >

       

    <tr>

        <th>Your first name</th>

        <td><input type="text" name="first_name"/></td>

    </tr>

    <tr>

        <th>Your last name</th>

        <td><input type="text"  name="last_name"/></td>

    </tr>

    <tr>

        <th>Enter your password</th>

        <td><input type="password" name="password"/></td>

    </tr>

    <tr>

        <th>ReEnter your password</th>

        <td><input type="password"/></td>

    </tr>

    <tr>

        <th>Enter your email</th>

        <td><input type="email" name="email"/></td>

    </tr>

    <tr>

        <th>Mobile Number</th>

        <td><input type="text" name="mobile_no"/></td>

    </tr>
    
    <tr>

        <th>Phone Number</th>

        <td><input type="text" name="phone"/></td>

    </tr>

    <tr>

        <th>Residential Address</th>

        <td><textarea rows="8" cols="27" name="address"></textarea></td>

    </tr>


    <tr>

        <td colspan="2" align="center"><input type="submit" value="Save My Data"/>

        <input type="reset" value="Reset Data"/>

        </td>

    </tr>

</table>
</form>
<!--  <footer>
<nav class="navbar fixed-bottom navbar-dark bg-dark">
  <ul style='list-style-type:none;'>
            <li><a href="home.html">Home</a></li>
            <li><a href="services.html">Services</a></li>
            <li><a href="gallery.html">Gallery</a></li>
            <li><a href="about.html">About</a></li>
            <li><a href="contact.html">Contact</a></li>

        </ul>
</nav>
</footer>  -->
</body>
</html>