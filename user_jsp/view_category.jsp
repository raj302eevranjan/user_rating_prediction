    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="com.dao.AdminDAO"%>

    <head>

  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Movie Recommendation System</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- Bootstrap styles -->
      
      
   

          <link rel="stylesheet" type="text/css" href="st.css">
      <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link href="style.css" rel="stylesheet"/>
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet">
      

      <link rel="shortcut icon" href="assets/ico/favicon.ico"> 
      
     
      

   
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
      
    
    </head>
  <body onload="startTimer();">
  <%
  String cat_code= request.getParameter("cat_code");
  String cat_name=AdminDAO.getCategoryName(cat_code);
  %>
    <!--
    Featured Products
    -->

    <div class="container">
      <!-- <div class="well well-small"> -->
        <h3> <%=cat_name %> Movies  </h3>
        <!-- <hr class="soften"/> -->
        <!-- <div class="row-fluid"> -->
        <!-- <ul class="thumbnails"> -->
        <%
        ResultSet rs1=AdminDAO.get_selected_category_Item_Details(cat_code);
        int id=0;
        String Groupname="",Groupdesc="";
        int count = 0;
        while(rs1.next())
        {
          String cnm=AdminDAO.getCategoryName(rs1.getString(3));
          %>
            <div class="col-md-4">
              <li class="span4">
        <div class="thumbnail">
        <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs1.getString(1)%>&cat_code=<%=rs1.getString(3)%>" title="click to view"> QUICK VIEW</a>
        <a  href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs1.getString(1)%>">
        <img src="<%=request.getContextPath() %>/<%=cnm%>/Item_Images/<%=rs1.getString(5)%>" alt=""></a>
        <div class="caption">
          <h5><%=rs1.getString(2)%></h5>
         
                            <div class="left mr10 mb5">
                            <a href="#" abs absolute barbecues
                              Menu" data-result-type="ResCard_Menu"
                              class="result-menu btn btn-small cblack"> <input type="text" class="rating rating5" readonly="readonly" value="<%=rs1.getString(6)%>" /> </a>
                            
                          </div>

                          
                          <div class="left mr10 mb5">
                            <a href="#" title="Posted Date"
                              class="result-photos btn btn-small search-result-reviews"
                              data-result-type="ResCard_Photos">Rated By:<%=rs1.getString(7)%> </a>
                            
                          </div>
                          
                          <div class="clear"></div>
          
        
      <%--  </div>
        
          <b><span class="pull-left" style="left:1px;"><%=rs1.getString(5)%>Rs</span></b>
        </div> --%>
      </li>
            </div>
        <%
        }
        %>
        <!-- </ul>   -->
    <!-- </div> -->
    <!-- </div> -->
    </div>
        

      

    <script src="assets/js/bootstrap.min.js"></script>
    
     
    <script src="assets/js/jquery.easing-1.3.min.js"></script>
      <script src="assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
      <script src="assets/js/shop.js"></script>
     
    </body>
  </html>