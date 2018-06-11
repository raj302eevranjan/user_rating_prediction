<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <%@page import="java.sql.ResultSet"%>
    <%@page import="com.dao.AdminDAO"%>
    <%@page import="java.util.Random"%>
    <head>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Movie Recommendation System</title>
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta name="description" content="">
            <meta name="author" content="">
            <!-- Bootstrap styles -->

            <!-- Latest compiled and minified CSS -->
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

            <!-- jQuery library -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

            <!-- Latest compiled JavaScript -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


            <!-- <link href="assets/css/bootstrap.css" rel="stylesheet"/> -->
            <link rel="stylesheet" type="text/css" href="st.css">
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
            String cat_code = request.getParameter("cat_code");
            Random rand = new Random();
            int a = rand.nextInt(10) + 1;
            cat_code = Integer.toString(a);
            String cat_name = AdminDAO.getCategoryName(cat_code);
            %>
        <script type="text/javascript">
            function toggleVisibility() {
                document.getElementById("signup").style.display = "";
            }
            console.log("the most rated category code is"+ <%= cat_code %> );
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

            <!-- Navigation bar section -->
            <nav class="navbar navbar-inverse navbar-fixed-top">
              <div class="container-fluid">
                <div class="navbar-header">
                  <a class="navbar-brand" href="#">MOVIE RECOMMENDATION SYSTEM</a>
                </div>
                <ul class="nav navbar-nav">
                  <li class="active"><a href="<%=request.getContextPath() %>/Select_Category?submit=Display" target="afrm" id="view_movies_button_user">View Movies</a> </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="<%=request.getContextPath() %>/Change_User_Pass?submit=change" target="afrm" >Change Password</a> </li>
                  <li class="active"><a href="index.html" >Logout</a> </li>
                </ul>
              </div>
            </nav>

            <div class="container" id="showing_all_movie_on_login" style="margin-left: 0px; margin-right: 0px;">


            <!-- <h3> <%=cat_name %> Movies</h3>
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
                            <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs1.getString(1)%>&cat_code=<%=rs1.getString(3)%>"
                                title="add to cart"> QUICK VIEW</a>
                            <a href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs1.getString(1)%>">
                                <img src="<%=request.getContextPath() %>/<%=cnm%>/Item_Images/<%=rs1.getString(5)%>" alt="">
                            </a>
                            <div class="caption">
                                <h5>
                                    <%=rs1.getString(2)%>
                                </h5>
                
                                <div class="left mr10 mb5">
                                    <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu "
                                                                            class="result-menu btn btn-small cblack "> <input type="text
                                        " class="rating rating5 " readonly="readonly " value="<%=rs1.getString(6)%>" /> </a>
                
                                </div>
                
                
                                <div class="left mr10 mb5">
                                    <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                        <%=rs1.getString(7)%>
                                    </a>
                
                                </div>
                
                                <div class="clear"></div>
                
                
                                <%--    </div>
                                
                                  <b><span class="pull-left" style="left:1px;"><%=rs1.getString(5)%>Rs</span>
                                    </b>
                            </div> --%>
                    </li>
                    </div>



                <%
              }
                %>

 -->


                
            </div>





                <div class="container" id="Adventure_movies">
                    <h3>
                        <%=cat_name %> Movies</h3>
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
<%
                            int max = 3;
                            int track = 0;
                             ResultSet rs2=AdminDAO.get_selected_category_Item_Details(cat_code);
                            while(rs2.next()){
                                if(track == 0){
                            %>
    <li data-target="#myCarousel" data-slide-to="<%= count %>" class="active"></li>
    <%
                                }
                            else{
                            %>
        <li data-target="#myCarousel" data-slide-to="<%= count %>"></li>
        <%
                            }
                            max = max - 1;
                            track = track + 1;
                                }
                            %>
            </ol>

            <div class="carousel-inner ">

                    <%
                    track = 0;
                        ResultSet rs3=AdminDAO.get_selected_category_Item_Details(cat_code);
                        while(rs3.next()){
                            String cnm_slider=AdminDAO.getCategoryName(rs3.getString(3)); 
                            track = track + 1;
                            if(track == 1){
                        %>
                        <div class="item active">
                            <div class="row" style="margin-left: 0px; margin-right: 0px;">
                                <div class="col-sm-4">        
                                <li class="span4" style="">
                                    <div class="thumbnail" style="">
                                        <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>&cat_code=<%=rs3.getString(3)%>"
                                            title="click to view"> QUICK VIEW</a>
                                        <a href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>">
                                            <img src="<%=request.getContextPath() %>/<%=cnm_slider%>/Item_Images/<%=rs3.getString(5)%>" alt="">
                                        </a>
                                        <div class="caption">
                                            <div class="row">
                                                <h5>
                                                    <%= rs3.getString(2) %>
                                                </h5>
                                            </div>
                                            <div class="row" style="text-align: center;">
                                                <div class="col-sm-3"></div>
                                                <div class="col-sm-6" style="margin-top: 100px;">
                                                    <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu " class="result-menu btn btn-small cblack ">
                                                                                            <input type="text " class="rating rating5 " readonly="readonly
                                                        " value="<%=rs3.getString(6)%>" /> </a>
                                
                                                </div>
                                                <div class="col-sm-3"></div>
                                            </div>
                                            <div class="row">
                                                <div class="col-sm-3"></div>
                                                <div class="col-sm-6" style="margin-top: 50px;">
                                                    <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                                        <%=rs3.getString(7)%>
                                                    </a>
                                                </div>
                                                <div class="col-sm-3"></div>
                                            </div>
                                        </div>
                                        <!-- <div class="caption" style="height: 200px;">
                                                                        <h5>
                                                                            <%=rs3.getString(2)%>
                                                                        </h5>
                                                                        <div class="left mr10 mb5">
                                                                            <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu" class="result-menu btn btn-small cblack "> <input type="text " class="rating rating5 " readonly="readonly" value="<%=rs3.getString(6)%>" /> </a>
                                                                        </div>
                                                                        <div class="left mr10 mb5">
                                                                            <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                                                            <%=rs3.getString(7)%>
                                                                            </a>
                                                                        </div>
                                                                        <div class="clear"></div>
                                                                        </div> -->
                                    </div>
                                </li>
                                    </div>
                        <%
                            }
                            else{
                                if(track%3 == 0){
                        %>
                        <div class="col-sm-4">
                                                            <li class="span4" style="">
                                                                <div class="thumbnail" style="">
                                                                    <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>&cat_code=<%=rs3.getString(3)%>"
                                                                        title="click to view"> QUICK VIEW</a>
                                                                    <a href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>">
                                                                        <img src="<%=request.getContextPath() %>/<%=cnm_slider%>/Item_Images/<%=rs3.getString(5)%>" alt="">
                                                                    </a>
                                                                    <div class="caption">
                                                                        <div class="row">
                                                                            <h5>
                                                                                <%= rs3.getString(2) %>
                                                                            </h5>
                                                                        </div>
                                                                        <div class="row" style="text-align: center;">
                                                                            <div class="col-sm-3"></div>
                                                                            <div class="col-sm-6" style="margin-top: 100px;">
                                                                                <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu " class="result-menu btn btn-small cblack ">
                                                                                                                        <input type="text " class="rating rating5 " readonly="readonly
                                                                                    " value="<%=rs3.getString(6)%>" /> </a>
                                                            
                                                                            </div>
                                                                            <div class="col-sm-3"></div>
                                                                        </div>
                                                                        <div class="row">
                                                                            <div class="col-sm-3"></div>
                                                                            <div class="col-sm-6" style="margin-top: 50px;">
                                                                                <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                                                                    <%=rs3.getString(7)%>
                                                                                </a>
                                                                            </div>
                                                                            <div class="col-sm-3"></div>
                                                                        </div>
                                                                    </div>
                                                                    <!-- <div class="caption" style="height: 200px;">
                                                                                                    <h5>
                                                                                                        <%=rs3.getString(2)%>
                                                                                                    </h5>
                                                                                                    <div class="left mr10 mb5">
                                                                                                        <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu" class="result-menu btn btn-small cblack "> <input type="text " class="rating rating5 " readonly="readonly" value="<%=rs3.getString(6)%>" /> </a>
                                                                                                    </div>
                                                                                                    <div class="left mr10 mb5">
                                                                                                        <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                                                                                        <%=rs3.getString(7)%>
                                                                                                        </a>
                                                                                                    </div>
                                                                                                    <div class="clear"></div>
                                                                                                    </div> -->
                                                                </div>
                                                            </li></div>
                                </div>
                                </div>
                                <div class="item">
                                <div class="row" style="margin-left: 0px; margin-right: 0px;">
                        <%
                                }
                                else{
                        %>
                            <div class="col-sm-4">        
                                <li class="span4" style="">
                                    <div class="thumbnail" style="">
                                        <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>&cat_code=<%=rs3.getString(3)%>"
                                        title="click to view"> QUICK VIEW</a>
                                        <a href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>">
                                            <img src="<%=request.getContextPath() %>/<%=cnm_slider%>/Item_Images/<%=rs3.getString(5)%>" alt="">
                                        </a>
                                        <div class="caption">
                                            <div class="row">
                                                <h5><%= rs3.getString(2) %></h5>
                                            </div>
                                            <div class="row" style="text-align: center;">
                                                <div class="col-sm-3"></div> 
                                                <div class="col-sm-6" style="margin-top: 100px;">
                                                    <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu " class="result-menu btn btn-small cblack">
                                                            <input type="text " class="rating rating5 " readonly="readonly " value="<%=rs3.getString(6)%>" /> </a>

                                                </div>
                                                <div class="col-sm-3"></div>
                                            </div>
                                            <div class="row">
                                                <div class="col-sm-3"></div>
                                                <div class="col-sm-6" style="margin-top: 50px;">
                                                    <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                                        <%=rs3.getString(7)%>
                                                    </a>
                                                </div>
                                                <div class="col-sm-3"></div>
                                            </div>
                                        </div>
                                        <!-- <div class="caption" style="height: 200px;">
                                        <h5>
                                            <%=rs3.getString(2)%>
                                        </h5>
                                        <div class="left mr10 mb5">
                                            <a href="#" abs absolute barbecues Menu " data-result-type="ResCard_Menu" class="result-menu btn btn-small cblack "> <input type="text " class="rating rating5 " readonly="readonly" value="<%=rs3.getString(6)%>" /> </a>
                                        </div>
                                        <div class="left mr10 mb5">
                                            <a href="#" title="Posted Date" class="result-photos btn btn-small search-result-reviews" data-result-type="ResCard_Photos">Rated By:
                                            <%=rs3.getString(7)%>
                                            </a>
                                        </div>
                                        <div class="clear"></div>
                                        </div> -->
                                        </div>
                                    </li>
                                </div>
                        <%
                                }
                            }
                        }
                        int rem = track%3;
                        if(rem != 0){
                        %>
                                </div>
                        <%
                        }
                %>
                                </div>

                        </div>
            
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
            
                </div>



                
                

            <div class="row" style="margin-left: 0px; margin-right: 0px;" id="target_afrm">
                <div class="col-sm-12">
                    <iframe frameborder="0" scrolling="auto" name="afrm" style="height: 500px; width: 100%;" align="middle" onload="hide_movies()">
                </div>
                </iframe>
            </div>
            <script src="assets/js/bootstrap.min.js"></script>
            <script src="assets/js/jquery.easing-1.3.min.js"></script>
            <script src="assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
            <script src="assets/js/shop.js"></script>
            <script type="text/javascript">
                function hide_movies(){
                    document.getElementById("showing_all_movie_on_login").style.display = "none";
                }
            </script>
    </body>
</html>