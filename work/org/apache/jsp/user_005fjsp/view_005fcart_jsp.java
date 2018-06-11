package org.apache.jsp.user_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.UserDao;
import java.sql.ResultSet;
import com.dao.AdminDAO;

public final class view_005fcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("      <link href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <!-- Customize styles -->\r\n");
      out.write("\t<link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Latest compiled and minified CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery library -->\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Latest compiled JavaScript -->\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/rating.css\" />\r\n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/rating.js\"></script>\r\n");
      out.write("\t  <script type=\"text/javascript\">\r\n");
      out.write("        $(function ()\r\n");
      out.write("        {\r\n");
      out.write("            $('.rating').rating();\r\n");
      out.write("\r\n");
      out.write("            $('.ratingEvent').rating({ rateEnd: function (v) { $('#result').text(v); } });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
 
int no=convert(request.getParameter("no"));
if(no==1)
{

      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:380px\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"Movie Rated Sucessfully\");\r\n");
      out.write("\t\t// var view_movies_button = document.getElementById(\"view_movies_button_user\").click();\r\n");
      out.write("\t\t// alert(\"view movies button user\");\r\n");
      out.write("\t\tvar xhttp = new XMLHttpRequest();\r\n");
      out.write("\t\txhttp.onreadystatechange = function () {\r\n");
      out.write("\t\t\tif(this.readyState == 4 && this.status == 200){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdocument.write(this.responseText);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txhttp.open(\"GET\", \"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=Display\", true);\r\n");
      out.write("\t\txhttp.send();\r\n");
      out.write("\t</script>\r\n");
      out.write("</div>\r\n");

}

if(no==2)
{

      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:10px;left:380px\">\r\n");
      out.write("\t<script type=\"text/javascript\">alert(\"Product Removerd From Cart\");</script>\r\n");
      out.write("</div>\r\n");

}
    
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t");

		 String item_code= "2";
			ResultSet rs1=UserDao.get_Cart_Details();
			int count = 0;
			while(rs1.next())
			{   
				count++;
				if(count%2 != 0){
		  
      out.write("\r\n");
      out.write("\t\t  <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal qtyFrm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category\"  method=\"get\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"well well-small\">\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<h3 style=\"text-align: center;\">Name of the Movie   ");
      out.print(rs1.getString(3));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t<hr class=\"soft\"/>  \r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"cart_id\" value=\"");
      out.print(rs1.getString(1));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"item_id\" value=\"");
      out.print(rs1.getString(4));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"cat_id\" value=\"");
      out.print(rs1.getString(5));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"myTabContent\" class=\"tab-content tabWrapper\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t  <h4>Movie Information</h4>\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Name of the Movie :</td><td class=\"techSpecTD2\">");
      out.print(rs1.getString(3));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Movie Collection:</td><td class=\"techSpecTD2\">");
      out.print(rs1.getString(6));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Rate It:</td><td class=\"techSpecTD2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"left mr10 mb5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" abs absolute barbecues\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMenu\" data-result-type=\"ResCard_Menu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"result-menu btn btn-small cblack\"> <input type=\"text\" name=\"user_rate\" class=\"rating rating5\"   /> </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" style=\"text-align: center; margin-top: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"shopBtn\" name=\"submit\" value=\"Buy\">Rate</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <button type=\"submit\" class=\"shopBtn\" name=\"submit\" value=\"Remove\"><span class=\" icon-shopping-cart\"></span>Remove</button>\r\n");
      out.write("\t\t\t\t\t -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t  ");

				}
				else{
		  
      out.write("\r\n");
      out.write("\t\t  <div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t<form class=\"form-horizontal qtyFrm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category\"  method=\"get\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"well well-small\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h3 style=\"text-align: center;\">Name of the Movie   ");
      out.print(rs1.getString(3));
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t<hr class=\"soft\"/>  \r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cart_id\" value=\"");
      out.print(rs1.getString(1));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"item_id\" value=\"");
      out.print(rs1.getString(4));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cat_id\" value=\"");
      out.print(rs1.getString(5));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"myTabContent\" class=\"tab-content tabWrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t  <h4>Movie Information</h4>\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Name of the Movie :</td><td class=\"techSpecTD2\">");
      out.print(rs1.getString(3));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Movie Collection:</td><td class=\"techSpecTD2\">");
      out.print(rs1.getString(6));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Rate It:</td><td class=\"techSpecTD2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"left mr10 mb5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" abs absolute barbecues\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMenu\" data-result-type=\"ResCard_Menu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"result-menu btn btn-small cblack\"> <input type=\"text\" name=\"user_rate\" class=\"rating rating5\"   /> </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\" style=\"text-align: center; margin-top: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"shopBtn\" name=\"submit\" value=\"Buy\">Rate</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- <button type=\"submit\" class=\"shopBtn\" name=\"submit\" value=\"Remove\"><span class=\" icon-shopping-cart\"></span>Remove</button>\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <hr style=\"margin-top: 0px;\">\r\n");
      out.write("            ");

			}
		}
			
      out.write("\r\n");
      out.write("\t\t\t\t<!-- </div> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t\t\r\n");
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
