<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */


/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .savebtn {
  float: left;
  width: 50%;
 
}

/* Add padding to container elements */
.container {
  padding: 16px;
  text-align: center;
}

/* The Modal (background) */


/* Modal Content/Box */


/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close {
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
  padding-top: 50px;
  text-align: center;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .savebtn {
     width: 100%;
  }
}
</style>
<body>


    <div class="container">
      <h1>Modify Room</h1>
      
      <hr>
      <label for="number"><b>Room No.</b></label>
      <input type="text" placeholder="Enter Room No." name="number" required>

      <h1><b>Room Type</b></h1>
      <select class='container' onchange="city(this.value);" required>
        <option value='0'>--Room Type--</option>
        <option value='1'>Standard non A/C room</option>
        <option value='2'>Standard A/C room</option>
        <option value='3'>Executive A/C room</option>
        <option value='4'>Deluxe A/C room</option>
        
            </select>

    <div class="container">

      <h1 for="number"><b>Rate Per Night</b></h1>
      <input type="number" placeholder="Enter Rate Per Night" name="number" required>

      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
        <button type="submit" class="savebtn">Save Data</button>
      </div>
    </div>
  </form>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
</script>

</body>
</html>
