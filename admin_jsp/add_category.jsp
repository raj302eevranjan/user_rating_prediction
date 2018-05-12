
<%@page import="com.dao.AdminDAO"%>
<%@ page import="java.sql.*"%>

<html>
<head>
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
	
	<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style1.css" type="text/css" />
	
	<link rel="stylesheet" href="<%=request.getContextPath() %>/css/animate.css">
	<%! 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 
%>
	
	<script type="text/javascript">
function hideMessage()
{
	document.getElementById("message").style.display="none"; 
}
function startTimer() 
{
	var tim = window.setTimeout("hideMessage()", 5000);  // 5000 milliseconds = 5 seconds
}
</script>
<style>
table, tr, td
th, td
{
padding:12px;
}

</style>



<% 
int no=convert(request.getParameter("no"));
if(no==1)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Category Added Sucessfully");</script>
</div>
<%
}

if(no==2)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Category Updated Sucessfully");</script>
</div>
<%
}

if(no==3)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Category Deleted Sucessfully");</script>
</div>
<%
}
%>


<body onload="startTimer()"style="height: 450px;">

	


		
		<div style="position: absolute; top: 30px; left: 50px;">
			<form action="<%=request.getContextPath() %>/Add_Category">
					<input type="hidden" name="add1" value="YES"></input>
				
				<center><label><font style="font-family: Monotype Corsiva; font-size: 35px; color: #333333;">Add Category Module</font></label></center><br></br>
					<table style="width: 130">
				<table>    
						<tr>
							<td><label><font style="color: #333333;">Category&nbsp;Name</font></label> </td><td>
							<input type="text" tabindex="1" class="input" name="Category_Name"
								placeholder="Category Name" required></td>
							
						</tr>
						<tr>
								<td><label><font style="color: #333333;">Category&nbsp;ShortName</font></label> </td><td>
							<input type="text" tabindex="1" class="input" name="Category_Short_Name"
								placeholder="Category Short Name" required></td>
						</tr>
						

					</table>
					
				
					<button type="submit" name="submit" value="Add" class="shopBtn btn-block">ADD</button>
					
					
				
				

			</form>
		
		
			
			
			<form action="<%=request.getContextPath() %>/Add_Category" >
		<table border="1">
  <tr>
   <th><font  color="#333333;">Select</font></th>
  
    <th><font color="#333333;">Category Name</font></th>
    <th><font  color="#333333;">Category Short Name</font></th>
   <th><font  color="#333333;">Edit</font></th>
   <th><font  color="#333333;">Delete</font></th>
  </tr>
  <%
  
	ResultSet rs=(ResultSet)AdminDAO.getCategory_Details();
	int id=0;
	String Groupname="",Groupdesc="";
	while(rs.next())
	{
	
	   
		%>
  <tr>
  <td><input type="checkbox" value="<%=rs.getInt(1) %>"  class="input" name="Cid" ></td>
    <td><input type="text" value="<%=rs.getString(2) %>"  class="input" name="Category_Name" ></td>
    <td><input type="text" value="<%=rs.getString(3)%>"  class="input" name="Category_Short_Name" ></td>
  
    <td><button type="submit" class="shopBtn btn-block"name="submit" value="Edit">Edit</button></td>
     <td><button type="submit" class="shopBtn btn-block" name="submit" value="Delete">Delete</button></td>
  </tr>
  <%							
						
	}
%>
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