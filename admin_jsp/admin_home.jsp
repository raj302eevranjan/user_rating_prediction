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
		
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


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
<div class="row" style="margin-left: 0px; margin-right: 0px;">
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

<!-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
      </li>
      <li><a href="#">Page 2</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav> -->



<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
			<li class="active"><a href="<%=request.getContextPath() %>/Add_Category?submit=Display" target="afrm">Category Module</a></li>
			<li class="active"><a href="<%=request.getContextPath() %>/Add_Item?submit=Display" target="afrm" >Add Mov</a> </li>
			<li class="active"><a href="<%=request.getContextPath() %>/Add_Item?submit=View" target="afrm" >View Mov</a> </li>
			 <li class="active"><a href="<%=request.getContextPath() %>/admin_jsp/view_user.jsp" target="afrm" >User</a> </li>
			 <li class="active"><a href="<%=request.getContextPath() %>/Unintersted_Items?submit=Display" target="afrm" >Uninteresting Mov</a> </li>
					<li class="active"><a href="<%=request.getContextPath() %>/admin_jsp/upload_mov_list.jsp"  target="afrm" >Upload Movie List</a> </li>
					 <li class="active"><a href="<%=request.getContextPath() %>/admin_jsp/upload_dataset.jsp"  target="afrm" >Upload Rating History</a> </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="<%=request.getContextPath() %>/ChangePass?submit=change" target="afrm" >Change Password</a> </li>
				<li class="active"><a href="index.html" >Logout</a> </li>
		</ul>
  </div>
</nav>

<!-- 
Body Section 
-->

<div class="row" style="margin-left: 0px; margin-right: 0px;">
	<div class="col-sm-12">
			<iframe frameborder="0" scrolling="auto" name="afrm" style="height: 1000px; width: 100%;"></iframe>
	</div>
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