<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>BOOKEASY</title>
	<link rel="stylesheet" type="text/css" href="website/Style.css">
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<style>
	body{
		background-image: url('Images/HotelWebsite.jpg');
		background-color: #bbdefb;
	}
	ul li
	{
		display:inline;
		padding:30px;
			}
			
</style>  
<script>
	


</script>
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
<div class="row">
<div class="col-sm-9">
<div class="container">
     <div class='col-sm-1'>
     </div>
     <div class="col-sm-7">
     	<label><b>WHERE TO STAY?</b></label>
      <select class='form-control' onchange="city(this.value);">
      	<option value='0'>--SELECT CITY--</option>
      	<option value='1'>BENGALURU</option>
      	<option value='2'>MUMBAI</option>
      	<option value='3'>PUNE</option>
      	<option value='4'>KOLHAPUR</option>
      	<option value='5'>JAYSINGPUR</option>
      	<option value='6'>SANGLI</option>
      	<option value='7'>BELGAON</option>

            </select><br>
            <label><b>HOTELS</b>
            </label>
            <select class='form-control' onchange="hotel(this.value)">
            		<option id='00'>--SELECT HOTEL--</option>
      	<option value='11'>MAYURA SAGAR</option>
      	<option value='22'>TAJ</option>
      	<option value='33'>SRI BALAJI</option>
      	<option value='44'>NATRAJ</option>
      	<option value='55'>SUN CITY</option>
      	<option value='66'>ASHRAY</option>
      	<option value='77'>KRISHNA</option>

            </select><br>

            <label><b>ROOM</b></label>
             <select class='form-control' onchange="room(this.value)">
            		<option id='000'>--SELECT ROOM--</option>
      	<option value='111'>SUPER DELUXE</option>
      	<option value='222'>DELUXE</option>
      	<option value='333'>REGULAR</option>
      	<option value='444'>DORMITORY</option>
      

            </select>
            <br>
            <label><b>CHECK IN :&nbsp</b></label>
            <div class='col-sm-3' style='display:inline'>
            <input type="date" id="dat1"><br>
  <label><b>CHECK OUT :&nbsp</label></b></label>
            <input type="date" id="dat2" ><br><br>
            <button class='btn btn-primary btn-lg btn-block' id='click1'>SEARCH</button>
        </div>
    

     </div>
     <div class='col-sm-1'>
     </div>
</div>
</div>
<div class='col-sm-3'  style='float:right;background-color: #12331; border-radius:1px; '>
	 <h4>LOGIN HERE</h4>
	<form action="LoginCustomerController" method="post">
    <div class='form=group'>
    	
    	<input class='form-control' type='text' id='username' name='user_name' placeholder="USERNAME" required>
    </div><br>
    
    <div class='form=group'>
    	<input class='form-control'  type='password'id='password' name='password' placeholder="PASSWORD" required>
    </div><br>
     <button type='submit' class='btn btn-success'>SUBMIT</button>
     <button type='reset' class='btn btn-danger'>RESET</button>
     <br>
    
			</form>
			 <a href='forgetpassword.html' style='font-size:14px; color:blue;'>Forgot Password?</a><br>
      <a href='Register.html' style='font-size:14px; color:blue;'>Create a new account</a>
	</div>
</div>
<footer>
<nav class="navbar fixed-bottom navbar-dark bg-dark">
  <ul style='list-style-type:none;'>
			<li><a href="home.html">Home</a></li>
			<li><a href="services.html">Services</a></li>
			<li><a href="gallery.html">Gallery</a></li>
			<li><a href="about.html">About</a></li>
			<li><a href="contact.html">Contact</a></li>

		</ul>
</nav>
</footer>
            </body>
            <script>
            	var x=0;
            	var y=00;
            	var z=000;
            	function city(monu)
            	{
                  x=monu;
            	}
            	function hotel(sauru)
            	{
            		 y=sauru;
            	}
            	function room(adu)
            	{
            		 z=adu;
            	}
            	$('#click1').click(function(){
console.log(x);
console.log(y);
console.log(z);   

              var dat1=$('#dat1').val();
              var dat2=$('#dat2').val();
  console.log(dat1);
              console.log(dat2);
              if(x=='0' || y=='00' || z=='000')
                 {
                 	alert('ALL FIELDS ARE MANDATORY');
                 	return false;
                 }

                 if(dat1=="" || dat2=="")
                 {
                 	alert("ENTER VALID DATES");
                 	return false;
                 }
                  var runj=Date.parse(dat1);
                  var runj1=Date.parse(dat2);
                  console.log(runj);
                  console.log(runj1);

                  if(runj1<runj)
                  {
                  	alert("FORGET YOUR PAST & MOVE AHEAD");
                  	return false;
                  }

                  var todays=new Date('08-Oct-2019');
                  console.log(todays);
                   var todays1= Date.parse(todays);
                     console.log(todays1);
                   if(runj<todays1 || runj1<todays1)
                   {
                   	alert("DATES SHOULD NOT BE LESS THAN TODAY");
                   	return false;
                   }
                     alert(" SEARCH SUCCESSFULL");
                                          

            	});
         
            </script>
</html>
