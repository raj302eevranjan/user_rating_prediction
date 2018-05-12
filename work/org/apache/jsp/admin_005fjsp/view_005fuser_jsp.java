package org.apache.jsp.admin_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.AdminDAO;
import java.sql.*;

public final class view_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <!-- Customize styles -->\r\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <!-- font awesome styles -->\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<!--[if IE 7]>\r\n");
      out.write("\t\t\t<link href=\"css/font-awesome-ie7.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Favicons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/ico/favicon.ico\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style1.css\" type=\"text/css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/animate.css\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("function hideMessage()\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(\"message\").style.display=\"none\"; \r\n");
      out.write("}\r\n");
      out.write("function startTimer() \r\n");
      out.write("{\r\n");
      out.write("\tvar tim = window.setTimeout(\"hideMessage()\", 5000);  // 5000 milliseconds = 5 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("table, tr, td\r\n");
      out.write("th, td\r\n");
      out.write("{\r\n");
      out.write("padding:5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t<div style=\"position: absolute; top: 30px; left: 60px; width: 150px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t <form action=\"");
      out.print(request.getContextPath() );
      out.write("/Add_Item\" >\r\n");
      out.write("\t\t<table border=\"1\">\r\n");
      out.write("  <tr>\r\n");
      out.write("   <th><font  color=\"#333333;\">Title</font></th>\r\n");
      out.write("  \r\n");
      out.write("    <th><font color=\"#333333;\">User Name</font></th>\r\n");
      out.write("    <th><font  color=\"#333333;\">User Mail</font></th>\r\n");
      out.write("      <th><font  color=\"#333333;\">User DOB</font></th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  ResultSet rs1=AdminDAO.getUsers();
	
	int id=0;
	String Groupname="",Groupdesc="";
	while(rs1.next())
	{
		
	   
		
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"text\" value=\"");
      out.print(rs1.getString(2) );
      out.write("\" style=\"width: 100px;\" class=\"input\" name=\"item_id\" ></td>\r\n");
      out.write("    <td><input type=\"text\" value=\"");
      out.print(rs1.getString(3) );
      out.write("\" style=\"width: 100px;\" class=\"input\" name=\"Item_Name\" ></td>\r\n");
      out.write("    <td><input type=\"text\" value=\"");
      out.print(rs1.getString(4));
      out.write("\" style=\"width: 200px;\" class=\"input\" name=\"Item_stock\" ></td>\r\n");
      out.write("      <td><input type=\"text\" value=\"");
      out.print(rs1.getString(6));
      out.write("\"  style=\"width: 100px;\" class=\"input\" name=\"Item_prize\" ></td>\r\n");
      out.write("        \r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
							
						
	}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.easing-1.3.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.scrollTo-1.4.3.1-min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/shop.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
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
