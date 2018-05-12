<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Movie Recommendation System</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap styles -->
    <link href="assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- Customize styles -->
    <link href="style.css" rel="stylesheet"/>
    <!-- font awesome styles -->
	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet">	
	<link href="http://localhost:8080/DM_User_ratting_prediction_may18/assets/css/rating.css" rel="stylesheet">
	<script type="text/javascript" src="http://localhost:8080/DM_User_ratting_prediction_may18/assets/js/jquery.js"></script>
	<script type="text/javascript" src="http://localhost:8080/DM_User_ratting_prediction_may18/assets/js/rating.js"></script>
	<!-- Favicons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.easing-1.3.min.js"></script>
    <script src="assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="assets/js/shop.js"></script>
    
    <script type="text/javascript">
	function toggleVisibility() {
	    document.getElementById("signup").style.display = "";
	}
	</script>
	<style>
	#horizontal_line{
		border-top: 20px solid orange;
	}
	</style>
	</head>
		<body>
			<div id="gototop"> </div>
			<header id="header">
				<div class="row">
					<div class="span4">
						<h1>
						</h1>
					</div>
					<div class="span4">
					</div>
					<center>
						<img src="assets/img/title.png" width="850px">
					</center>
				</div>
			</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
  <div class="navbar-inner">
	<div class="container">
	  <a data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar">
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
	  </a>
	  <div class="nav-collapse">
		<ul class="nav">
		   <li class="active"><a href="<%=request.getContextPath() %>/Select_Category?submit=Display" target="afrm" >View Movies</a> </li>
			<%--   <li class="active"><a href="<%=request.getContextPath() %>/Select_Category?submit=ViewCart" target="afrm" >Rate Movies</a> </li> --%>
		     <li class="active"><a href="<%=request.getContextPath() %>/Change_User_Pass?submit=change" target="afrm" >Change Password</a> </li>
		     <li class="active"><a href="index.html" >Logout</a> </li>
		</ul>
	  </div>
	</div>
  </div>
</div>
	

<!-- <hr id="horizontal_line"> -->
<div id="adventure_movie"></div>
<!-- <hr id="horizontal_line"> -->
<div id="comedy_movie"></div>
<!-- <hr id="horizontal_line"> -->
<div id="drama_movie"></div>
 
Body Section 

<!-- <script>
$(document).ready(function(){
	 $.ajax({
	 	   url: 'http://localhost:8080/DM_User_ratting_prediction_may18/Select_Category?cat_code=1&submit=Show_Products',
		   
	 	   error: function() {
 	      $('#info').html('<p>An error has occurred</p>');
	 	   },
	 	   success: function(data) {
 		    document.getElementById("action_movie").innerHTML = data;
	 		   document.write(data)
	 	   },
	 	   type: 'GET'
 	});
	
	$.ajax({
	 	   url: 'http://localhost:8080/DM_User_ratting_prediction_may18/Select_Category?cat_code=2&submit=Show_Products',
		   
	 	   error: function() {
	 	      $('#info').html('<p>An error has occurred</p>');
	 	   },
	 	   success: function(data) {
	 		   document.getElementById("adventure_movie").innerHTML = data;
 	   },
	 	   type: 'GET'
		});
	
	 $.ajax({
	 	   url: 'http://localhost:8080/DM_User_ratting_prediction_may18/Select_Category?cat_code=3&submit=Show_Products',
		   
	 	   error: function() {
	 	      $('#info').html('<p>An error has occurred</p>');
	 	   },
	 	   success: function(data) {
	 		   document.getElementById("comedy_movie").innerHTML = data;
	 	   },
	 	   type: 'GET'
	 	});
	
	 $.ajax({
	 	   url: 'http://localhost:8080/DM_User_ratting_prediction_may18/Select_Category?cat_code=4&submit=Show_Products',
		   
 	   error: function() {
 	      $('#info').html('<p>An error has occurred</p>');
 	   },
 	   success: function(data) {
 		   document.getElementById("drama_movie").innerHTML = data;
 	   },
 	   type: 'GET'
 	});
	
	
});
</script> -->
	
<div style="position:absolute; top:220px; margin-left: 30px; text-align: 20px;">
	<iframe frameborder="0" scrolling="auto" name="afrm" style="height: 500px; width: 1000px;"></iframe>
</div>

<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
  </body>
</html>