<%@ page import="java.sql.*" %>
<%@page import="com.dao.AdminDAO"%>
<html>
<head>
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

</head>
<%
int no=convert(request.getParameter("no"));
if(no==1)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
<script type="text/javascript">
	alert("Succeefully Changed Password ...!!")
	</script>
</div>
<%}
if(no==2)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
<script type="text/javascript">
	alert("OOP's new Password does not match with confirm password ...!!")
	</script>
	
</div>
<%}
if(no==3)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:280px">
<script type="text/javascript">
	alert("OOP's Your New Password Does't Match With Confirm ...!!")
	</script>

</div>
<%}%>
<body onload="startTimer()">


<br></br>
<form action="<%=request.getContextPath() %>/ChangePass" method="get">




<div>

	<p id="al">Your Old Password : <input type="password" name="opass"></input></p>
	<p id="al">Your New Password : <input type="password" name="npass"></input></p>
	<p id="al">Your Confirm Password : <input type="password" name="cpass"></input></p>
	
	
</div>
<br>
<br>

<button type="submit" class="shopBtn btn-block"name="submit" value="Change_Password">Change Password</button>


</form>
</body>
</html>