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
		
	<!-- Favicons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    
    
    
    <script type="text/javascript">
function toggleVisibility() {


    document.getElementById("signup").style.display = "";
    

}
</script>
  </head>
<body>


<div id="gototop"> </div>
<header id="header">
<div class="row">
	<div class="span4">
	<h1>
	<!-- <a class="logo" href="index.html">
		<img src="assets/img/logo-bootstrap-shoping-cart.png" alt="bootstrap sexy shop">
		
	</a> -->
	
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
			  <li class="active"><a href="<%=request.getContextPath() %>/Add_Category?submit=Display" target="afrm">Category Module</a></li>
			   <li class="active"><a href="<%=request.getContextPath() %>/Add_Item?submit=Display" target="afrm" >Add Mov</a> </li>
			   <li class="active"><a href="<%=request.getContextPath() %>/Add_Item?submit=View" target="afrm" >View Mov</a> </li>
			    <li class="active"><a href="<%=request.getContextPath() %>/admin_jsp/view_user.jsp" target="afrm" >User</a> </li>
			    <li class="active"><a href="<%=request.getContextPath() %>/Unintersted_Items?submit=Display" target="afrm" >Uninteresting Mov</a> </li>
			       <li class="active"><a href="<%=request.getContextPath() %>/admin_jsp/upload_mov_list.jsp"  target="afrm" >Upload Movie List</a> </li>
			        <li class="active"><a href="<%=request.getContextPath() %>/admin_jsp/upload_dataset.jsp"  target="afrm" >Upload Rating History</a> </li>
			     <li class="active"><a href="<%=request.getContextPath() %>/ChangePass?submit=change" target="afrm" >Change Password</a> </li>
			     <li class="active"><a href="index.html" >Logout</a> </li>
			</ul>
			
			
			
		  </div>
		</div>
	  </div>
	</div>
<!-- 
Body Section 
-->
	
	



<div style="position:absolute;top:220px;left:300px;">
<iframe frameborder="0" scrolling="auto" name="afrm" height="470" width="850"></iframe>
</div>



<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.easing-1.3.min.js"></script>
    <script src="assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="assets/js/shop.js"></script>
  </body>
</html>