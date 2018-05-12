package org.apache.jsp.user_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.prediction.prediction;
import com.prediction.Prepare_Predection_Datset;
import java.util.ArrayList;
import com.dao.UserDao;
import java.sql.ResultSet;
import com.dao.AdminDAO;

public final class product_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <link href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("      <!-- Customize styles -->\r\n");
      out.write("      <link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("      <!-- Bootstrap styles -->\r\n");
      out.write("      <!-- Latest compiled and minified CSS -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("      <!-- jQuery library -->\r\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("      <!-- Latest compiled JavaScript -->\r\n");
      out.write("      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- font awesome styles -->\r\n");
      out.write("      <link href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("      <!--[if IE 7]>\r\n");
      out.write("      <link href=\"css/font-awesome-ie7.min.css\" rel=\"stylesheet\">\r\n");
      out.write("      <![endif]-->\r\n");
      out.write("      <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("      <![endif]-->\r\n");
      out.write("      <!-- Favicons -->\r\n");
      out.write("      <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/ico/favicon.ico\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style1.css\" type=\"text/css\" />\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/animate.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/rating.css\" />\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/rating.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         $(function ()\r\n");
      out.write("         {\r\n");
      out.write("             $('.rating').rating();\r\n");
      out.write("         \r\n");
      out.write("             $('.ratingEvent').rating({ rateEnd: function (v) { $('#result').text(v); } });\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("            ");

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
                      
                      
      out.write("\r\n");
      out.write("\r\n");
      out.write("                      <p style=\"font-size: 20px; text-align: center;\">Name of the Movie&nbsp;&nbsp;:&nbsp;&nbsp;");
      out.print(rs1.getString(2));
      out.write("</p>\r\n");
      out.write("                  <div id=\"myTabContent\" class=\"tab-content tabWrapper\" style=\"border: 1px solid orange;\">\r\n");
      out.write("               <div class=\"tab-pane fade active in\" id=\"home\">\r\n");
      out.write("                  <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("                    <div class=\"col-sm-12\" style=\"text-align: center;\">\r\n");
      out.write("                      <h4>Movie Information</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("                    <div class=\"col-sm-6\" style=\"text-align: center;\">\r\n");
      out.write("                      <p>Category&nbsp;&nbsp;:</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6\" style=\"text-align: center;\">\r\n");
      out.write("                      <p>");
      out.print(AdminDAO.getCategoryName(rs1.getString(3)));
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("                    <div class=\"col-sm-6\" style=\"text-align: center;\">\r\n");
      out.write("                      <p>Rating&nbsp;&nbsp;:</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                      <div class=\"left mr10 mb5\" style=\"text-align: center;\">\r\n");
      out.write("                                 <a href=\"#\" abs absolute barbecues\r\n");
      out.write("                                    Menu\" data-result-type=\"ResCard_Menu\"\r\n");
      out.write("                                    class=\"result-menu btn btn-small cblack\"> <input type=\"text\" class=\"rating rating5\" readonly=\"readonly\" value=\"");
      out.print(rs1.getString(7));
      out.write("\" /> </a>\r\n");
      out.write("                              </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- <table class=\"table table-striped\" style=\"margin-bottom: 0px;\">\r\n");
      out.write("                     <tbody>\r\n");
      out.write("                        <tr class=\"techSpecRow\">\r\n");
      out.write("                           <td class=\"techSpecTD1\">Category:</td>\r\n");
      out.write("                           <td class=\"techSpecTD2\">");
      out.print(AdminDAO.getCategoryName(rs1.getString(3)));
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <tr class=\"techSpecRow\">\r\n");
      out.write("                           <td class=\"techSpecTD1\">Rating:</td>\r\n");
      out.write("                           <td class=\"techSpecTD2\">\r\n");
      out.write("                              \r\n");
      out.write("                           </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                     </tbody>\r\n");
      out.write("                  </table> -->\r\n");
      out.write("                  <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("                    <form class=\"form-horizontal qtyFrm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category\"  method=\"get\" style=\"margin-bottom: 0px; text-align: center;\">\r\n");
      out.write("                     <div class=\"control-group\" style=\"display: none;\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <div class=\"controls\">\r\n");
      out.write("                           <!-- <input type=\"number\" name=\"Qty\" class=\"span6\" placeholder=\"Qty.\"> -->\r\n");
      out.write("                           <input type=\"hidden\" name=\"item_code\" value=\"");
      out.print(rs1.getString(1));
      out.write("\">\r\n");
      out.write("                           <input type=\"hidden\" name=\"prize\" value=\"");
      out.print(rs1.getString(5));
      out.write("\"> \r\n");
      out.write("                           <input type=\"hidden\" name=\"item_name\" value=\"");
      out.print(rs1.getString(2));
      out.write("\"> \r\n");
      out.write("                           <input type=\"hidden\" name=\"cat_code\" value=\"");
      out.print(rs1.getString(3));
      out.write("\"> \r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <button type=\"submit\" class=\"shopBtn\" name=\"submit\" value=\"Add_Cart\" style=\"margin-right: 20px; margin-top: 10px;\">Rate It</button>\r\n");
      out.write("                  </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

               }
               
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-sm-8\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-sm-6\">\r\n");
      out.write("                <p style=\"font-size: 20px; text-align: center;\">Recommended Items</p>\r\n");
      out.write("\r\n");
      out.write("                  <ul class=\"thumbnails\">\r\n");
      out.write("         ");

            String user_id=session.getAttribute("name").toString();
              String rec_item=UserDao.select_user_Recent_item(user_id);
             
            
              String root=request.getRealPath("dataset");
            int item_id=prediction.Item_predict(Integer.parseInt(user_id),root);
            
             ArrayList<Integer> un_item=UserDao.select_UNINT_Item_Details(cat_id,rate,""+item_id);
            
            ResultSet rs4=AdminDAO.get_Item_Details(item_id+"");
                while(rs4.next())
                {
                  String cnm=AdminDAO.getCategoryName(rs4.getString(3));
              
      out.write("\r\n");
      out.write("         <li class=\"span4\" style=\"width: 100%;\">\r\n");
      out.write("            <div class=\"thumbnail\" style=\"height: 175px;\">\r\n");
      out.write("            <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs4.getString(1));
      out.write("\" title=\"add to cart\"> QUICK VIEW</a>\r\n");
      out.write("            <a  href=\"product_details.html\"><img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm);
      out.write("/Item_Images/");
      out.print(rs4.getString(5));
      out.write("\" alt=\"\"></a>\r\n");
      out.write("            <div class=\"caption\">\r\n");
      out.write("            <h5>");
      out.print(rs4.getString(2));
      out.write("</h5>\r\n");
      out.write("            <div class=\"left mr10 mb5\" style=\"text-align: center; margin-bottom: 20px;\">\r\n");
      out.write("               <a href=\"#\" abs absolute barbecues\r\n");
      out.write("                  Menu\" data-result-type=\"ResCard_Menu\"\r\n");
      out.write("                  class=\"result-menu btn btn-small cblack\"> <input type=\"text\" class=\"rating rating5\" readonly=\"readonly\" value=\"");
      out.print(rs4.getString(7));
      out.write("\" /> </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"left mr10 mb5\" style=\"text-align: center;\">\r\n");
      out.write("               <a href=\"#\" title=\"Posted Date\"\r\n");
      out.write("                  class=\"result-photos btn btn-small search-result-reviews\"\r\n");
      out.write("                  data-result-type=\"ResCard_Photos\">Rated By:");
      out.print(rs4.getString(7));
      out.write(" </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("         </li>\r\n");
      out.write("         ");

            }
            
            
      out.write("\r\n");
      out.write("         ");

            for(int i=0;i<un_item.size();i++)
            {
              
              
              ResultSet rs3=AdminDAO.get_Item_Details(un_item.get(i).toString());
              while(rs3.next())
              {
                String cnm=AdminDAO.getCategoryName(rs3.getString(3));
            
      out.write("\r\n");
      out.write("         <li class=\"span4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("               <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("\" title=\"add to cart\"> QUICK VIEW</a>\r\n");
      out.write("               <a  href=\"product_details.html\"><img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm);
      out.write("/Item_Images/");
      out.print(rs3.getString(5));
      out.write("\" alt=\"\"></a>\r\n");
      out.write("               <div class=\"caption\">\r\n");
      out.write("                  <h5>");
      out.print(rs3.getString(2));
      out.write("</h5>\r\n");
      out.write("                  <div class=\"left mr10 mb5\">\r\n");
      out.write("                     <a href=\"#\" abs absolute barbecues\r\n");
      out.write("                        Menu\" data-result-type=\"ResCard_Menu\"\r\n");
      out.write("                        class=\"result-menu btn btn-small cblack\"> <input type=\"text\" class=\"rating rating5\" readonly=\"readonly\" value=\"");
      out.print(rs3.getString(7));
      out.write("\" /> </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"left mr10 mb5\">\r\n");
      out.write("                     <a href=\"#\" title=\"Posted Date\"\r\n");
      out.write("                        class=\"result-photos btn btn-small search-result-reviews\"\r\n");
      out.write("                        data-result-type=\"ResCard_Photos\">Rated No:");
      out.print(rs3.getString(8));
      out.write(" </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"clear\"></div>\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("         </li>\r\n");
      out.write("         ");

            }
            }
            
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-sm-6\">right part</div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.easing-1.3.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.scrollTo-1.4.3.1-min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/shop.js\"></script>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
