package org.apache.jsp.user_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.dao.AdminDAO;

public final class changepass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      ");
      out.write("\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         function hideMessage()\r\n");
      out.write("         {\r\n");
      out.write("         \tdocument.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("         }\r\n");
      out.write("         function startTimer() \r\n");
      out.write("         {\r\n");
      out.write("         \tvar tim = window.setTimeout(\"hideMessage()\", 5000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("         }\r\n");
      out.write("      </script>\r\n");
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
      out.write("   </head>\r\n");
      out.write("   ");

      int no=convert(request.getParameter("no"));
      if(no==1)
      {
      out.write("\r\n");
      out.write("   <div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         alert(\"Succeefully Changed Password ...!!\")\r\n");
      out.write("      </script>\r\n");
      out.write("   </div>\r\n");
      out.write("   ");
}
      if(no==2)
      {
      out.write("\r\n");
      out.write("   <div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         alert(\"OOP's new Password does not match with confirm password ...!!\")\r\n");
      out.write("      </script>\r\n");
      out.write("   </div>\r\n");
      out.write("   ");
}
      if(no==3)
      {
      out.write("\r\n");
      out.write("   <div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:280px\">\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("         alert(\"OOP's Your New Password Does't Match With Confirm ...!!\")\r\n");
      out.write("      </script>\r\n");
      out.write("   </div>\r\n");
      out.write("   ");
}
      out.write("\r\n");
      out.write("   <body onload=\"startTimer()\">\r\n");
      out.write("      <br></br>\r\n");
      out.write("      <form action=\"");
      out.print(request.getContextPath() );
      out.write("/Change_User_Pass\" method=\"get\">\r\n");
      out.write("         <div>\r\n");
      out.write("            <p id=\"al\">Your Old Password : <input type=\"password\" name=\"opass\"></input></p>\r\n");
      out.write("            <p id=\"al\">Your New Password : <input type=\"password\" name=\"npass\"></input></p>\r\n");
      out.write("            <p id=\"al\">Your Confirm Password : <input type=\"password\" name=\"cpass\"></input></p>\r\n");
      out.write("         </div>\r\n");
      out.write("         <br>\r\n");
      out.write("         <br>\r\n");
      out.write("         <button type=\"submit\" class=\"shopBtn btn-block\"name=\"submit\" value=\"Change_Password\">Change Password</button>\r\n");
      out.write("      </form>\r\n");
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
