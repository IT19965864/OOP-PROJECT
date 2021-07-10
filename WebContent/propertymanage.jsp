<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Property</title>
	<link rel="stylesheet" type="text/css" href="header.css">
</head>
<body bgcolor="DarkSlateGray" >
	
	<ul id="b1">
			<li class="a2"><img src="batch.png" width="260px" height="100px" class ="a19" >
			<li><a href="Home.jsp" class="a1">HOME</a></li>
			<li><a href="Login.jsp" class="a0">LOG IN</a></li>
			<li><a href="#" class="a0">ABOUT US</a></li>
		</ul>
		
		
		<hr class="a4">
		<ul id="b9">
			
			<li><a href="propertymanage.jsp">Buy Property</a></li>
			<li><a href="#">Sell Property</a></li>
			<li><a href="#">Features</a></li>
			<li><a href="#l">Benefits</a></li>
		</ul>
		<br>
		<br>
		<br>
	
	<h1 style="color:dark green ;text-align:left; margin-top:-1cm"><b>Property Reservation</b></h1>
	<p>If you want to reserve a property enter the propertyID and your NIC.</p>
	
	<form action = "reserve" method="post">
		<p><b>PropertyID :</b></p>
		<input type ="text" name="propertyid"  style="height:30px;width:200px">
		 
		
		<P><b>BuyerNIC :</b></P>
		<input type="text" name="buyernic" style="height:30px;width:200px">
		<br><br>
		<input type="submit" name="submit" value="Reserve" style="font-size:15px; height:40px;width:100px;padding-right:20px;background-color:gray;">

	</form>
	
	<h1 style="color:dark green ;text-align:right; margin-top:-8cm; margin-right:6.6cm"><b>Property Purchasing</b></h1>
	<p style="text-align:right;margin-right:1.4cm">If you want to purchase a property enter the propertyID  and your NIC.</p>
	
	<form action="purchase" method="post" style="float:right; margin-right:7.7cm;margin-top:-0.5cm">
		<p><b>PropertyID : </b></p>
		<input type="text" name="propertyid" style="height:30px;width:200px">
		
		<p><b>BuyerNIC :</b></p>
		<input type="text" name="buyernic" style="height:30px;width:200px">
		<br>
		<br>
		<input type="submit" name="submit" value="Purchase" style="font-size:15px; height:40px;width:100px;padding-right:20px;background-color:gray">
		
		
	</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
		<br>
		<div>
		<hr class="a4">
		<ul id="b3">
		
		<li class="a8">Property Master Pvt Ltd.</li>
		</ul>
		</div>
		<br>
		<br>
		
		<ul id="b4">
		<li class="a9">SHERE THE MOMENT</li>
		<li class="a10">QUICK LINKS</li>
		</ul>
		<ul id="b7">
		<li><a href="#" class="a14"><img src="fb.png" width="30px" height="30px" ></a></li>
		<li><a href="#"class="a15"><img src="twt.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a16"><img src="insta.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a17"><img src="youtube.png" width="30px" height="30px"></a></li>
		<li><a href="#"class="a18"><img src="in.png" width="30px" height="30px"></a></li>
		</ul>
		<ul id="b5">
		<li><a href="#">FAQ</a></li>
		<li><a href="#">Contact Us</a></li>
		<li><a href="#">Privacy & Policy</a></li>
		<li><a href="#">Terms & Condition</a></li>
		<li><a href="#">Technical support</a></li>
		</ul>

		<ul id="b6">
		<li class="a11">All right Reserved</li>
		<li class="a12">Copyright 2020 Property Master PVT LTD</li>
		</ul>
</body>
</html>