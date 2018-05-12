package org.apache.jsp.admin_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Movie Recommendation System</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <!-- Bootstrap styles -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <!-- Customize styles -->\r\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <!-- font awesome styles -->\r\n");
      out.write("\t<link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- Favicons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/ico/favicon.ico\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("function toggleVisibility() {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"signup\").style.display = \"\";\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"gototop\"> </div>\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"span4\">\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t<!-- <a class=\"logo\" href=\"index.html\">\r\n");
      out.write("\t\t<img src=\"assets/img/logo-bootstrap-shoping-cart.png\" alt=\"bootstrap sexy shop\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</a> -->\r\n");
      out.write("\t\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"span4\">\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<img src=\"assets/img/title.png\" width=\"850px\">\r\n");
      out.write("\t</center>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Navigation Bar Section \r\n");
      out.write("-->\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("\t  <div class=\"navbar-inner\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t  <a data-target=\".nav-collapse\" data-toggle=\"collapse\" class=\"btn btn-navbar\">\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t  </a>\r\n");
      out.write("\t\t  <div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t  <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Add_Category?submit=Display\" target=\"afrm\">Category Module</a></li>\r\n");
      out.write("\t\t\t   <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Add_Item?submit=Display\" target=\"afrm\" >Add Mov</a> </li>\r\n");
      out.write("\t\t\t   <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Add_Item?submit=View\" target=\"afrm\" >View Mov</a> </li>\r\n");
      out.write("\t\t\t    <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_jsp/view_user.jsp\" target=\"afrm\" >User</a> </li>\r\n");
      out.write("\t\t\t    <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Unintersted_Items?submit=Display\" target=\"afrm\" >Uninteresting Mov</a> </li>\r\n");
      out.write("\t\t\t       <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_jsp/upload_mov_list.jsp\"  target=\"afrm\" >Upload Movie List</a> </li>\r\n");
      out.write("\t\t\t        <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin_jsp/upload_dataset.jsp\"  target=\"afrm\" >Upload Rating History</a> </li>\r\n");
      out.write("\t\t\t     <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePass?submit=change\" target=\"afrm\" >Change Password</a> </li>\r\n");
      out.write("\t\t\t     <li class=\"active\"><a href=\"index.html\" >Logout</a> </li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- \r\n");
      out.write("Body Section \r\n");
      out.write("-->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute;top:220px;left:300px;\">\r\n");
      out.write("<iframe frameborder=\"0\" scrolling=\"auto\" name=\"afrm\" height=\"470\" width=\"850\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" class=\"gotop\"><i class=\"icon-double-angle-up\"></i></a>\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/jquery.easing-1.3.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo-1.4.3.1-min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/shop.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
