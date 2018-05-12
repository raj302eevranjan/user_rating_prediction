package org.apache.jsp.user_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.AdminDAO;
import java.sql.*;

public final class select_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <link href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("      <!-- Customize styles -->\r\n");
      out.write("      <link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
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
      out.write("\r\n");
      out.write("                  <!-- Bootstrap styles -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Latest compiled and minified CSS -->\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("            <!-- jQuery library -->\r\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Latest compiled JavaScript -->\r\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
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
      out.write("      ");
      out.write("\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         function hideMessage()\r\n");
      out.write("         {\r\n");
      out.write("             document.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("         }\r\n");
      out.write("         function startTimer() \r\n");
      out.write("         {\r\n");
      out.write("             var tim = window.setTimeout(\"hideMessage()\", 5000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("         }\r\n");
      out.write("      </script>\r\n");
      out.write("      <style>\r\n");
      out.write("         table, tr, td\r\n");
      out.write("         th, td\r\n");
      out.write("         {\r\n");
      out.write("         padding:12px;\r\n");
      out.write("         }\r\n");
      out.write("      </style>\r\n");
      out.write("      ");
 
         int no=convert(request.getParameter("no"));
         if(no==1)
         {
         
      out.write("\r\n");
      out.write("      <div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:380px\">\r\n");
      out.write("         <script type=\"text/javascript\">alert(\"Item Added Sucessfully\");</script>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");

         }
         
         if(no==2)
         {
         
      out.write("\r\n");
      out.write("      <div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:380px\">\r\n");
      out.write("         <script type=\"text/javascript\">alert(\"Item Updated Sucessfully\");</script>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");

         }
         
         if(no==3)
         {
         
      out.write("\r\n");
      out.write("      <div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:380px\">\r\n");
      out.write("         <script type=\"text/javascript\">alert(\"Item Deleted Sucessfully\");</script>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");

         }
         
      out.write("\r\n");
      out.write("      ");
 
         ResultSet rs=(ResultSet)AdminDAO.getCategory_Details();
             
                 
      out.write("\r\n");
      out.write("   </head>\r\n");
      out.write("   <body onload=\"startTimer()\">\r\n");
      out.write("   <div class=\"container-fluid\">\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("     <div class=\"col-sm-3\"></div>\r\n");
      out.write("     <div class=\"col-sm-6\">\r\n");
      out.write("       <form action=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category\" method=\"get\" style=\"margin-top: 20px;\">\r\n");
      out.write("            <center><label><font style=\"font-family: Monotype Corsiva; font-size: 35px; color: #333333;\">Select Category</font></label></center>\r\n");
      out.write("            <br></br>\r\n");
      out.write("            <table style=\"width: 130\">\r\n");
      out.write("            <table>\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td><label style=\"margin-left: 100px;\"><font style=\"color: #333333;\">Movie&nbsp;Category</font></label> </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                     <select style=\"width: 250px; height: 25px;\" name=\"cat_code\">\r\n");
      out.write("                        <option value=\"Select\" >Select</option>\r\n");
      out.write("                        ");
 
                           while(rs.next())
                           {
                           
      out.write("\r\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(1) );
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(rs.getString(2) );
      out.write("</option>\r\n");
      out.write("                        ");

                           } 
                           
      out.write(" \r\n");
      out.write("                     </select>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <button type=\"submit\" name=\"submit\" value=\"Show_Products\" class=\"shopBtn btn-block\" style=\"margin: auto; width: 400px;\">Show Movies</button>\r\n");
      out.write("         </form>\r\n");
      out.write("     </div>\r\n");
      out.write("     <div class=\"col-sm-3\"></div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("      <div style=\"text-align: center;\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <a href=\"#\" class=\"gotop\"><i class=\"icon-double-angle-up\"></i></a>\r\n");
      out.write("      <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("      <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.js\"></script>\r\n");
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
