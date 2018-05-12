package org.apache.jsp.user_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.dao.AdminDAO;

public final class view_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("    \r\n");
      out.write("  <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("  <html>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("      <title>Movie Recommendation System</title>\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("      <meta name=\"description\" content=\"\">\r\n");
      out.write("      <meta name=\"author\" content=\"\">\r\n");
      out.write("      <!-- Bootstrap styles -->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"st.css\">\r\n");
      out.write("      <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("      <link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <link rel=\"shortcut icon\" href=\"assets/ico/favicon.ico\"> \r\n");
      out.write("      \r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/rating.css\" />\r\n");
      out.write("   <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/rating.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("          $(function ()\r\n");
      out.write("          {\r\n");
      out.write("              $('.rating').rating();\r\n");
      out.write("\r\n");
      out.write("              $('.ratingEvent').rating({ rateEnd: function (v) { $('#result').text(v); } });\r\n");
      out.write("          });\r\n");
      out.write("      </script>\r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("  <body onload=\"startTimer();\">\r\n");
      out.write("  ");

  String cat_code= request.getParameter("cat_code");
  String cat_name=AdminDAO.getCategoryName(cat_code);
  
      out.write("\r\n");
      out.write("    <!--\r\n");
      out.write("    Featured Products\r\n");
      out.write("    -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <!-- <div class=\"well well-small\"> -->\r\n");
      out.write("        <h3> ");
      out.print(cat_name );
      out.write(" Movies  </h3>\r\n");
      out.write("        <!-- <hr class=\"soften\"/> -->\r\n");
      out.write("        <!-- <div class=\"row-fluid\"> -->\r\n");
      out.write("        <!-- <ul class=\"thumbnails\"> -->\r\n");
      out.write("        ");

        ResultSet rs1=AdminDAO.get_selected_category_Item_Details(cat_code);
        int id=0;
        String Groupname="",Groupdesc="";
        int count = 0;
        while(rs1.next())
        {
          String cnm=AdminDAO.getCategoryName(rs1.getString(3));
          
      out.write("\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <li class=\"span4\">\r\n");
      out.write("        <div class=\"thumbnail\">\r\n");
      out.write("        <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs1.getString(1));
      out.write("&cat_code=");
      out.print(rs1.getString(3));
      out.write("\" title=\"add to cart\"> QUICK VIEW</a>\r\n");
      out.write("        <a  href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs1.getString(1));
      out.write("\">\r\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm);
      out.write("/Item_Images/");
      out.print(rs1.getString(5));
      out.write("\" alt=\"\"></a>\r\n");
      out.write("        <div class=\"caption\">\r\n");
      out.write("          <h5>");
      out.print(rs1.getString(2));
      out.write("</h5>\r\n");
      out.write("         \r\n");
      out.write("                            <div class=\"left mr10 mb5\">\r\n");
      out.write("                            <a href=\"#\" abs absolute barbecues\r\n");
      out.write("                              Menu\" data-result-type=\"ResCard_Menu\"\r\n");
      out.write("                              class=\"result-menu btn btn-small cblack\"> <input type=\"text\" class=\"rating rating5\" readonly=\"readonly\" value=\"");
      out.print(rs1.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                            \r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("                          <div class=\"left mr10 mb5\">\r\n");
      out.write("                            <a href=\"#\" title=\"Posted Date\"\r\n");
      out.write("                              class=\"result-photos btn btn-small search-result-reviews\"\r\n");
      out.write("                              data-result-type=\"ResCard_Photos\">Rated By:");
      out.print(rs1.getString(7));
      out.write(" </a>\r\n");
      out.write("                            \r\n");
      out.write("                          </div>\r\n");
      out.write("                          \r\n");
      out.write("                          <div class=\"clear\"></div>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("      </li>\r\n");
      out.write("            </div>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("        <!-- </ul>   -->\r\n");
      out.write("    <!-- </div> -->\r\n");
      out.write("    <!-- </div> -->\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("    <script src=\"assets/js/jquery.easing-1.3.min.js\"></script>\r\n");
      out.write("      <script src=\"assets/js/jquery.scrollTo-1.4.3.1-min.js\"></script>\r\n");
      out.write("      <script src=\"assets/js/shop.js\"></script>\r\n");
      out.write("     \r\n");
      out.write("    </body>\r\n");
      out.write("  </html>");
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
