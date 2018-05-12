
<%@page import="com.dao.AdminDAO"%>
<%@ page import="java.sql.*" %>
<html>
 <link href="<%=request.getContextPath() %>/assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- Customize styles -->
    <link href="style.css" rel="stylesheet"/>
    <!-- font awesome styles -->
	<link href="<%=request.getContextPath() %>/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
		<!--[if IE 7]>
			<link href="css/font-awesome-ie7.min.css" rel="stylesheet">
		<![endif]-->

		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

	<!-- Favicons -->
    <link rel="shortcut icon" href="<%=request.getContextPath() %>/assets/ico/favicon.ico">

<head>
	
<link rel="stylesheet" href="css/style1.css" type="text/css" />
	
	<link rel="stylesheet" href="css/animate.css">
	
	
	
<style>
table, tr, td
th, td
{
padding:15px;
}
</style>
<style> 
#popup {

    box-shadow: 10px 10px 50px #1A1A14;
}
</style>
</head>
<body onload="startTimer()"style="height: 450px;">


			

		
		
		<div style="position: absolute; top: 30px; left: 50px;">
			
		<form name="frm" action="<%=request.getContextPath()%>/Upload_Mov_List" enctype="multipart/form-data" method="post">
			
	<h1>Upload File</h1>
	<table style="width: 500px;text-align: center;">
		<tr align="center">
				<td>Browse File <font color="red" size="4">*</font></td>
				<td width="25px">:</td>
				<td>
						<div id="radio">
							<input type="file" name="file"  />
						</div>
				</td>
		</tr>
		
		
		
		
		<tr align="center">
				<td colspan="3" align="center">
						<input id="alert_button" type="submit" name="action" value="Upload" style="left: 175px;"/>
				</td>
		</tr>
	</table>
	   
	</form>
		</div>
		
		
		
		
		
		
		
		<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="<%=request.getContextPath() %>/assets/js/jquery.js"></script>
	<script src="<%=request.getContextPath() %>/assets/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/shop.js"></script>

	
	
		
		

</body>
</html>