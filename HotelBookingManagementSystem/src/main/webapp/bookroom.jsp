<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head></head>
    <title>Confirm Booking</title>
    <style>
body{
	text-align:center;
  background-position: center;
	font-family: 'Lato', 'sans-serif';
	font-weight: 400;
  background-size: cover;
  background-color: lightgrey;

}
a{
  text-decoration: none;
}
.info-text{
  text-align:center;
  width: 100%;
}
header, form{
	padding: 4em 10%;
}
    .form-group{
	margin-bottom: 20px;
}
.controls{
	text-align:center;
	position: relative;
}


    </style>
    <body>
    <form action="BookRoomCustomerController" method="post"><br>
    <h1 class="heading">Hotel Booking Management System</h1>
    <h2 class="heading">BOOKEASY</h2>
            <div class="form-group">
                    <h2 class="heading">Booking & contact</h2>
                    <div class="controls">
                            <label for="name">Booking Id</label>
                        <input type="text" id="booking id" class="floatLabel" name="Booking_id"><br><br>
                      
                    </div>
                      <div class="grid">
                        <div class="col-2-3">
                          <div class="controls">
                            <label for="User Id">User Id</label>
                           &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" id="user id" class="floatLabel" name="user_id"><br><br>
                           
                          </div>          
                        </div>
                        <div class="col-1-3">
                          <div class="controls">
                            <label for="room id">Room Id</label>
                            &nbsp&nbsp&nbsp&nbsp&nbsp<input type="room id" id="room id" class="floatLabel" name="room_id"><br><br>
                            
                          </div>          
                        </div>
                      </div>
                    
                          
                      </div>
                  </div>
                  <!--  Details -->
                  <div class="form-group">
                    <h2 class="heading">Booking Details</h2>
                    <div class="grid">
                    <div class="col-1-4 col-1-4-sm">
                      <div class="controls">
                        <label for="booked from" class="label-date"><i class="fa fa-calendar"></i>&nbsp;&nbsp;Booked from</label>
                        <input type="date" id="booked from" class="floatLabel" name="booked_from" value="<?php echo date('Y-m-d'); ?>"><br><br>
                        
                      </div>      
                    </div>
                    <div class="col-1-4 col-1-4-sm">
                      <div class="controls">
                        <label for="booked to" class="label-date"><i class="fa fa-calendar"></i>&nbsp;&nbsp;Booked to</label>
                        <input type="date" id="booked to" class="floatLabel" name="booked_to" value="<?php echo date('Y-m-d'); ?>" /><br><br>
                        
                      </div>      
                    </div>
                      </div>
                      <div class="grid">
                    <div class="col-1-3 col-1-3-sm">
                      <div class="controls">
                    <label for="fruit"><i class="fa fa-male"></i>&nbsp;&nbsp;no_of_adults</label>
                        <i class="fa fa-sort"></i>
                        <select class="floatLabel">
                          <option value="blank"></option>
                          <option value="1">1</option>
                          <option value="2" selected>2</option>
                          <option value="3">3</option>
                        </select>
                        <br><br>
                      </div>      
                    </div>
                    <div class="col-1-3 col-1-3-sm">
                    <div class="controls">
                    <label for="fruit">no_of_children</label>
                      <i class="fa fa-sort"></i>
                      <select class="floatLabel">
                        <option value="0">0</option>
                        <option value="1" selected>1</option>
                        <option value="2" selected>2</option>
                        <option value="3" selected>3</option>
                        </selected></option>
                      </select>
                      <br><br>
                     </div>     
                    </div>
                    <div class="controls">
                        <label for="amount">Amount</label>
                        <input type="text" id="amount" class="floatLabel" name="amount"><br><br>
                      </div>
                        <div class="grid">
                        
                            <button type="submit" value="Submit" class="col-1-4">Submit</button>
                      </div>  
                  </div> <!-- /.form-group -->
                </form>

    </body>
</html>    