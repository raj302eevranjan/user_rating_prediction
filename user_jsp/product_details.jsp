<!DOCTYPE html>
<%@page import="com.prediction.prediction"%>
<%@page import="com.prediction.Prepare_Predection_Datset"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.UserDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.AdminDAO"%>
<html lang="en">
   <head>
      <link href="<%=request.getContextPath() %>/assets/css/bootstrap.css" rel="stylesheet"/>
      <!-- Customize styles -->
      <link href="style.css" rel="stylesheet"/>

      <!-- Bootstrap styles -->
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
   </head>
   <body>
      <div class="container-fluid">
        <div class="row">
          <div class="col-sm-4">

            <%
                     String item_code= request.getParameter("item_code");
                        String cat_id= request.getParameter("cat_id");
                     String prizes="";
                     String rate="";
                      ResultSet rs1=AdminDAO.get_Item_Details(item_code);
                      int id=0;
                      
                      String Groupname="",Groupdesc="";
                      while(rs1.next())
                      {
                        prizes=rs1.getString(5);
                        rate=rs1.getString(7);
                      %>

                      <p style="font-size: 20px; text-align: center;">Name of the Movie&nbsp;&nbsp;:&nbsp;&nbsp;<%=rs1.getString(2)%></p>
                  <div id="myTabContent" class="tab-content tabWrapper" style="border: 1px solid orange;">
               <div class="tab-pane fade active in" id="home">
                  <div class="row" style="margin-left: 0px; margin-right: 0px;">
                    <div class="col-sm-12" style="text-align: center;">
                      <h4>Movie Information</h4>
                    </div>
                  </div>
                  <div class="row" style="margin-left: 0px; margin-right: 0px;">
                    <div class="col-sm-6" style="text-align: center;">
                      <p>Category&nbsp;&nbsp;:</p>
                    </div>
                    <div class="col-sm-6" style="text-align: center;">
                      <p><%=AdminDAO.getCategoryName(rs1.getString(3))%></p>
                    </div>
                  </div>
                  <div class="row" style="margin-left: 0px; margin-right: 0px;">
                    <div class="col-sm-6" style="text-align: center;">
                      <p>Rating&nbsp;&nbsp;:</p>
                    </div>
                    <div class="col-sm-6">
                      <div class="left mr10 mb5" style="text-align: center;">
                                 <a href="#" abs absolute barbecues
                                    Menu" data-result-type="ResCard_Menu"
                                    class="result-menu btn btn-small cblack"> <input type="text" class="rating rating5" readonly="readonly" value="<%=rs1.getString(7)%>" /> </a>
                              </div>
                    </div>
                  </div>
                  <!-- <table class="table table-striped" style="margin-bottom: 0px;">
                     <tbody>
                        <tr class="techSpecRow">
                           <td class="techSpecTD1">Category:</td>
                           <td class="techSpecTD2"><%=AdminDAO.getCategoryName(rs1.getString(3))%></td>
                        </tr>
                        <%-- <tr class="techSpecRow"><td class="techSpecTD1">Certificate:</td><td class="techSpecTD2"><%=rs1.getString(9)%></td></tr> --%>
                        <tr class="techSpecRow">
                           <td class="techSpecTD1">Rating:</td>
                           <td class="techSpecTD2">
                              
                           </td>
                        </tr>
                     </tbody>
                  </table> -->
                  <div class="row" style="margin-left: 0px; margin-right: 0px;">
                    <form class="form-horizontal qtyFrm" action="<%=request.getContextPath() %>/Select_Category"  method="get" style="margin-bottom: 0px; text-align: center;">
                     <div class="control-group" style="display: none;">
                        <%-- <label class="control-label"><span><%=rs1.getString(5)%> Rs</span></label> --%>
                        <div class="controls">
                           <!-- <input type="number" name="Qty" class="span6" placeholder="Qty."> -->
                           <input type="hidden" name="item_code" value="<%=rs1.getString(1)%>">
                           <input type="hidden" name="prize" value="<%=rs1.getString(5)%>"> 
                           <input type="hidden" name="item_name" value="<%=rs1.getString(2)%>"> 
                           <input type="hidden" name="cat_code" value="<%=rs1.getString(3)%>"> 
                        </div>
                     </div>
                     <button type="submit" class="shopBtn" name="submit" value="Add_Cart" style="margin-right: 20px; margin-top: 10px;">Rate It</button>
                  </form>
                  </div>
               </div>
            </div>
            <%
               }
               %>
          </div>
          <div class="col-sm-8">
            <div class="row">
              <div class="col-sm-6">
                <p style="font-size: 20px; text-align: center;">Recommended Movie</p>

                  <ul class="thumbnails">
         <%
            String user_id=session.getAttribute("name").toString();
              String rec_item=UserDao.select_user_Recent_item(user_id);
             
            
              String root=request.getRealPath("dataset");
            int item_id=prediction.Item_predict(Integer.parseInt(user_id),root);
            
             ArrayList<Integer> un_item=UserDao.select_UNINT_Item_Details(cat_id,rate,""+item_id);
            
            ResultSet rs4=AdminDAO.get_Item_Details(item_id+"");
                while(rs4.next())
                {
                  String cnm=AdminDAO.getCategoryName(rs4.getString(3));
              %>
         <li class="span4" style="width: 100%;">
            <div class="thumbnail" style="height: 175px;">
            <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs4.getString(1)%>" title="add to cart"> QUICK VIEW</a>
            <a  href="product_details.html"><img src="<%=request.getContextPath() %>/<%=cnm%>/Item_Images/<%=rs4.getString(5)%>" alt=""></a>
            <div class="caption">
            <h5><%=rs4.getString(2)%></h5>
            <div class="left mr10 mb5" style="text-align: center; margin-bottom: 20px;">
               <a href="#" abs absolute barbecues
                  Menu" data-result-type="ResCard_Menu"
                  class="result-menu btn btn-small cblack"> <input type="text" class="rating rating5" readonly="readonly" value="<%=rs4.getString(7)%>" /> </a>
            </div>
            <div class="left mr10 mb5" style="text-align: center;">
               <a href="#" title="Posted Date"
                  class="result-photos btn btn-small search-result-reviews"
                  data-result-type="ResCard_Photos">Rated By:<%=rs4.getString(7)%> </a>
            </div>
            <div class="clear"></div>
            <%-- </div>
               <b><span class="pull-left" style="left:1px;"><%=rs4.getString(5)%>Rs</span></b>
               </div> --%>
         </li>
         <%
            }
            
            %>
         <%
            for(int i=0;i<un_item.size();i++)
            {
              
              
              ResultSet rs3=AdminDAO.get_Item_Details(un_item.get(i).toString());
              while(rs3.next())
              {
                String cnm=AdminDAO.getCategoryName(rs3.getString(3));
            %>
         <li class="span4">
            <div class="thumbnail">
               <a class="zoomTool" href="<%=request.getContextPath() %>/Select_Category?submit=product_details&item_code=<%=rs3.getString(1)%>" title="add to cart"> QUICK VIEW</a>
               <a  href="product_details.html"><img src="<%=request.getContextPath() %>/<%=cnm%>/Item_Images/<%=rs3.getString(5)%>" alt=""></a>
               <div class="caption">
                  <h5><%=rs3.getString(2)%></h5>
                  <div class="left mr10 mb5">
                     <a href="#" abs absolute barbecues
                        Menu" data-result-type="ResCard_Menu"
                        class="result-menu btn btn-small cblack"> <input type="text" class="rating rating5" readonly="readonly" value="<%=rs3.getString(7)%>" /> </a>
                  </div>
                  <div class="left mr10 mb5">
                     <a href="#" title="Posted Date"
                        class="result-photos btn btn-small search-result-reviews"
                        data-result-type="ResCard_Photos">Rated No:<%=rs3.getString(8)%> </a>
                  </div>
                  <div class="clear"></div>
                  <%--  
                     </div>
                     
                       <b><span class="pull-left" style="left:1px;"><%=rs3.getString(5)%>Rs</span></b>
                     </div> --%>
         </li>
         <%
            }
            }
            %>
      </ul>
              </div>
              <div class="col-sm-6">right part</div>
            </div>
          </div>
        </div>
      </div>
      <script src="<%=request.getContextPath() %>/assets/js/bootstrap.min.js"></script>
      <script src="<%=request.getContextPath() %>/assets/js/jquery.easing-1.3.min.js"></script>
      <script src="<%=request.getContextPath() %>/assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
      <script src="<%=request.getContextPath() %>/assets/js/shop.js"></script>
   </body>
</html>