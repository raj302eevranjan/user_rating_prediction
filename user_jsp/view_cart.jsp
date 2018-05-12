<!DOCTYPE html>
<%@page import="com.dao.UserDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.AdminDAO"%>
<html lang="en">
  <head>
      <link href="<%=request.getContextPath() %>/assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- Customize styles -->
	<link href="style.css" rel="stylesheet"/>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
	
	
	
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/assets/css/rating.css" />
 <script type="text/javascript" src="<%=request.getContextPath() %>/assets/js/jquery.js"></script>
      <script type="text/javascript" src="<%=request.getContextPath() %>/assets/js/rating.js"></script>
	  <script type="text/javascript">
        $(function ()
        {
            $('.rating').rating();

            $('.ratingEvent').rating({ rateEnd: function (v) { $('#result').text(v); } });
        });
    </script>
    
    
    
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
    <% 
int no=convert(request.getParameter("no"));
if(no==1)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Movie Rated Sucessfully");</script>
</div>
<%
}

if(no==2)
{
%>
<div class="gradientbuttons" id="message" style="position:absolute;top:10px;left:380px">
	<script type="text/javascript">alert("Product Removerd From Cart");</script>
</div>
<%
}
    %>
  </head>
<body>


	

			
			
			<div class="container-fluid">
				<!-- <div class="row"> -->
					<%
		 String item_code= "2";
			ResultSet rs1=UserDao.get_Cart_Details();
			while(rs1.next())
			{   
		  %>
			<div class="col-sm-6">
				<form class="form-horizontal qtyFrm" action="<%=request.getContextPath() %>/Select_Category"  method="get">
			
					<div class="span9">
			
			<div class="well well-small">
			<div class="row-fluid">
					
					<div class="span7">
		
						<h3>Name of the Movie   <%=rs1.getString(3)%></h3>
						<hr class="soft"/>  
						<input type="hidden" name="cart_id" value="<%=rs1.getString(1)%>">
						<input type="hidden" name="item_id" value="<%=rs1.getString(4)%>">
						<input type="hidden" name="cat_id" value="<%=rs1.getString(5)%>">
							
					</div>
					
					
					</div>
					
					<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
					  <h4>Movie Information</h4>
						<table class="table table-striped">
						<tbody>
						<tr class="techSpecRow"><td class="techSpecTD1">Name of the Movie :</td><td class="techSpecTD2"><%=rs1.getString(3)%></td></tr>
						<tr class="techSpecRow"><td class="techSpecTD1">Movie Collection:</td><td class="techSpecTD2"><%=rs1.getString(6)%></td></tr>
						<%-- <tr class="techSpecRow"><td class="techSpecTD1">Quantity:</td><td class="techSpecTD2"><%=rs1.getString(7)%></td></tr>
						<tr class="techSpecRow"><td class="techSpecTD1">Total :</td><td class="techSpecTD2"><%=rs1.getString(8)%> Rs</td></tr>
						 --%>
						
						<tr class="techSpecRow"><td class="techSpecTD1">Rate It:</td><td class="techSpecTD2">
															<div class="left mr10 mb5">
																<a href="#" abs absolute barbecues
																	Menu" data-result-type="ResCard_Menu"
																	class="result-menu btn btn-small cblack"> <input type="text" name="user_rate" class="rating rating5"   /> </a>
																
															</div>
															</td></tr>
						
						</tbody>
						</table>
						</div>
						</div>
						
						<button type="submit" class="shopBtn" name="submit" value="Buy">Rate</button>
						
							<!-- <button type="submit" class="shopBtn" name="submit" value="Remove"><span class=" icon-shopping-cart"></span>Remove</button>
					 -->
		</div>
		</div>
		
		
		</form>
			</div>
            <%
			}
			%>
				<!-- </div> -->
			</div>
		
	
	<script src="<%=request.getContextPath() %>/assets/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="<%=request.getContextPath() %>/assets/js/shop.js"></script>
			
  </body>
</html>