
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
<%

HttpSession ses=request.getSession();

String cid=ses.getAttribute("cid").toString();
System.out.println("--------"+cid);
//ses.setAttribute("cid", cid);
	ResultSet rs=(ResultSet)AdminDAO.getCategoryDetails(cid);
	int id=0;
	String Category_Name="",Category_Short_Name="";
	while(rs.next())
	{
	
	    id=rs.getInt(1);
	    Category_Name=rs.getString(2);
	    Category_Short_Name=rs.getString(3);
	   
	

	}
%>
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
			<form action="<%=request.getContextPath() %>/Add_Category">
					<input type="hidden" name="add1" value="YES"></input>
				
				<center><label><font style="font-family: Monotype Corsiva; font-size: 35px; color: #333333;">Update Category Module</font></label></center><br></br>
					<table style="width: 130">
				<table>    
						<tr>
							<td><label><font style="color: #333333;">Category&nbsp;Name</font></label> </td><td>
							<input type="text" tabindex="1" class="input" name="Category_Name"
								placeholder="Category Name" required  value="<%=Category_Name %>"></td>
							
						</tr>
						<tr>
								<td><label><font style="color: #333333;">Category&nbsp;ShortName</font></label> </td><td>
							<input type="text" tabindex="1" class="input" name="Category_Short_Name"
								placeholder="Category Short Name"  value="<%=Category_Short_Name %>" required></td>
						</tr>
						

					</table>
					</table>
				
					<button type="submit" name="submit" value="update" class="shopBtn btn-block">update</button>
					
					
				
				

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