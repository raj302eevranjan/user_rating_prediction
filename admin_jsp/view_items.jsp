
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
padding:5px;
}

</style>



<% 
int no=convert(request.getParameter("no"));
if(no==1)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Item Added Sucessfully");</script>
</div>
<%
}

if(no==2)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Item Updated Sucessfully");</script>
</div>
<%
}

if(no==3)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Item Deleted Sucessfully");</script>
</div>
<%
}
%>
<% 
String cat_code= request.getParameter("cat_code");


		%>
		
 	
		
		<%
    String cid = request.getParameter("code");
    
%>
	
</head>

<body onload="startTimer()">

	


		<center>
		
		
			
			 <form action="<%=request.getContextPath() %>/Add_Item" >
		<table border="1">
  <tr>
   <th><font  color="#333333;">Select</font></th>
  
    <th><font color="#333333;">MovName</font></th>
    <th><font  color="#333333;">MovCategory</font></th>
        <th><font  color="#333333;">MovYear</font></th>
        <th><font  color="#333333;">MovImage</font></th>
   <th><font  color="#333333;">Edit</font></th>
   <th><font  color="#333333;">Delete</font></th>
  </tr>
  <%
  
	ResultSet rs1=AdminDAO.get_selected_category_Item_Details(cat_code);
	int id=0;
	String Groupname="",Groupdesc="";
	while(rs1.next())
	{
		String cnm=AdminDAO.getCategoryName(rs1.getString(3));
	   System.out.println(cnm);
		%>
  <tr>
  <td><input type="checkbox" value="<%=rs1.getInt(1) %>" style="width: 100px;" class="input" name="item_id" ></td>
    <td><input type="text" value="<%=rs1.getString(2) %>" style="width: 100px;" class="input" name="Item_Name" ></td>
    <td><input type="text" value="<%=cnm%>"  class="input" style="width: 100px;" name="Item_Category" ></td>
    <td><input type="text" value="<%=rs1.getString(4)%>" style="width: 100px;" class="input" name="Item_stock" ></td>

        <td><img src="<%=request.getContextPath() %>/<%=cnm%>/Item_Images/<%=rs1.getString(5)%>" width="100px""  class="input" name="Item_Image" ></td>
  
    <td><button type="submit" class="shopBtn btn-block"name="submit" value="Edit">Edit</button></td>
     <td><button type="submit" class="shopBtn btn-block" name="submit" value="Delete">Delete</button></td>
  </tr>
  <%							
						
	}
%>
</table>

		</form>		
		</div>
	
	</center>



    <!-- Placed at the end of the document so the pages load faster -->
    <script src="<%=request.getContextPath() %>/assets/js/jquery.js"></script>
	<script src="<%=request.getContextPath() %>/assets/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/shop.js"></script>

	
	
</body>
</html>