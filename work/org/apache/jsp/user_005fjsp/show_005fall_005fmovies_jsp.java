package org.apache.jsp.user_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.dao.AdminDAO;
import java.util.Random;

public final class show_005fall_005fmovies_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("            <title>Movie Recommendation System</title>\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <meta name=\"description\" content=\"\">\r\n");
      out.write("            <meta name=\"author\" content=\"\">\r\n");
      out.write("            <!-- Bootstrap styles -->\r\n");
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
      out.write("\r\n");
      out.write("            <!-- <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\"/> -->\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"st.css\">\r\n");
      out.write("            <link href=\"style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("            <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("            <link rel=\"shortcut icon\" href=\"assets/ico/favicon.ico\">\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/assets/css/rating.css\" />\r\n");
      out.write("            <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/jquery.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/assets/js/rating.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(function ()\r\n");
      out.write("                {\r\n");
      out.write("                    $('.rating').rating();\r\n");
      out.write("                \r\n");
      out.write("                    $('.ratingEvent').rating({ rateEnd: function (v) { $('#result').text(v); } });\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"startTimer();\">\r\n");
      out.write("        ");

            String cat_code = request.getParameter("cat_code");
            Random rand = new Random();
            int a = rand.nextInt(10) + 1;
            cat_code = Integer.toString(a);
            String cat_name = AdminDAO.getCategoryName(cat_code);
            
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function toggleVisibility() {\r\n");
      out.write("                document.getElementById(\"signup\").style.display = \"\";\r\n");
      out.write("            }\r\n");
      out.write("            console.log(\"the most rated category code is\"+ ");
      out.print( cat_code );
      out.write(" );\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("            #horizontal_line{\r\n");
      out.write("            border-top: 20px solid orange;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <div id=\"gototop\"> </div>\r\n");
      out.write("            <header id=\"header\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"span4\">\r\n");
      out.write("                        <h1>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"span4\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <img src=\"assets/img/title.png\" width=\"850px\">\r\n");
      out.write("                    </center>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <!-- Navigation bar section -->\r\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("              <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                  <a class=\"navbar-brand\" href=\"#\">MOVIE RECOMMENDATION SYSTEM</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                  <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=Display\" target=\"afrm\" id=\"view_movies_button_user\">View Movies</a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li class=\"active\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Change_User_Pass?submit=change\" target=\"afrm\" >Change Password</a> </li>\r\n");
      out.write("                  <li class=\"active\"><a href=\"index.html\" >Logout</a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\" id=\"showing_all_movie_on_login\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- <h3> ");
      out.print(cat_name );
      out.write(" Movies</h3>\r\n");
      out.write("            ");

                ResultSet rs1=AdminDAO.get_selected_category_Item_Details(cat_code);
                int id=0;
                String Groupname="",Groupdesc="";
                int count = 0;
                while(rs1.next())
                {
                    String cnm=AdminDAO.getCategoryName(rs1.getString(3));
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <li class=\"span4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs1.getString(1));
      out.write("&cat_code=");
      out.print(rs1.getString(3));
      out.write("\"\r\n");
      out.write("                                title=\"add to cart\"> QUICK VIEW</a>\r\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs1.getString(1));
      out.write("\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm);
      out.write("/Item_Images/");
      out.print(rs1.getString(5));
      out.write("\" alt=\"\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h5>\r\n");
      out.write("                                    ");
      out.print(rs1.getString(2));
      out.write("\r\n");
      out.write("                                </h5>\r\n");
      out.write("                \r\n");
      out.write("                                <div class=\"left mr10 mb5\">\r\n");
      out.write("                                    <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu \"\r\n");
      out.write("                                                                            class=\"result-menu btn btn-small cblack \"> <input type=\"text\r\n");
      out.write("                                        \" class=\"rating rating5 \" readonly=\"readonly \" value=\"");
      out.print(rs1.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                \r\n");
      out.write("                                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                                <div class=\"left mr10 mb5\">\r\n");
      out.write("                                    <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                        ");
      out.print(rs1.getString(7));
      out.write("\r\n");
      out.write("                                    </a>\r\n");
      out.write("                \r\n");
      out.write("                                </div>\r\n");
      out.write("                \r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

              }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\" id=\"Adventure_movies\">\r\n");
      out.write("                    <h3>\r\n");
      out.write("                        ");
      out.print(cat_name );
      out.write(" Movies</h3>\r\n");
      out.write("                    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                        <ol class=\"carousel-indicators\">\r\n");

                            int max = 3;
                            int track = 0;
                             ResultSet rs2=AdminDAO.get_selected_category_Item_Details(cat_code);
                            while(rs2.next()){
                                if(track == 0){
                            
      out.write("\r\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"");
      out.print( count );
      out.write("\" class=\"active\"></li>\r\n");
      out.write("    ");

                                }
                            else{
                            
      out.write("\r\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"");
      out.print( count );
      out.write("\"></li>\r\n");
      out.write("        ");

                            }
                            max = max - 1;
                            track = track + 1;
                                }
                            
      out.write("\r\n");
      out.write("            </ol>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"carousel-inner \">\r\n");
      out.write("\r\n");
      out.write("                    ");

                    track = 0;
                        ResultSet rs3=AdminDAO.get_selected_category_Item_Details(cat_code);
                        while(rs3.next()){
                            String cnm_slider=AdminDAO.getCategoryName(rs3.getString(3)); 
                            track = track + 1;
                            if(track == 1){
                        
      out.write("\r\n");
      out.write("                        <div class=\"item active\">\r\n");
      out.write("                            <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("                                <div class=\"col-sm-4\">        \r\n");
      out.write("                                <li class=\"span4\" style=\"\">\r\n");
      out.write("                                    <div class=\"thumbnail\" style=\"\">\r\n");
      out.write("                                        <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("&cat_code=");
      out.print(rs3.getString(3));
      out.write("\"\r\n");
      out.write("                                            title=\"click to view\"> QUICK VIEW</a>\r\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("\">\r\n");
      out.write("                                            <img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm_slider);
      out.write("/Item_Images/");
      out.print(rs3.getString(5));
      out.write("\" alt=\"\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <div class=\"caption\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <h5>\r\n");
      out.write("                                                    ");
      out.print( rs3.getString(2) );
      out.write("\r\n");
      out.write("                                                </h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\" style=\"text-align: center;\">\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                <div class=\"col-sm-6\" style=\"margin-top: 100px;\">\r\n");
      out.write("                                                    <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu \" class=\"result-menu btn btn-small cblack \">\r\n");
      out.write("                                                                                            <input type=\"text \" class=\"rating rating5 \" readonly=\"readonly\r\n");
      out.write("                                                        \" value=\"");
      out.print(rs3.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                                \r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                <div class=\"col-sm-6\" style=\"margin-top: 50px;\">\r\n");
      out.write("                                                    <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                                        ");
      out.print(rs3.getString(7));
      out.write("\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- <div class=\"caption\" style=\"height: 200px;\">\r\n");
      out.write("                                                                        <h5>\r\n");
      out.write("                                                                            ");
      out.print(rs3.getString(2));
      out.write("\r\n");
      out.write("                                                                        </h5>\r\n");
      out.write("                                                                        <div class=\"left mr10 mb5\">\r\n");
      out.write("                                                                            <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu\" class=\"result-menu btn btn-small cblack \"> <input type=\"text \" class=\"rating rating5 \" readonly=\"readonly\" value=\"");
      out.print(rs3.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <div class=\"left mr10 mb5\">\r\n");
      out.write("                                                                            <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                                                            ");
      out.print(rs3.getString(7));
      out.write("\r\n");
      out.write("                                                                            </a>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <div class=\"clear\"></div>\r\n");
      out.write("                                                                        </div> -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                        ");

                            }
                            else{
                                if(track%3 == 0){
                        
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                                                            <li class=\"span4\" style=\"\">\r\n");
      out.write("                                                                <div class=\"thumbnail\" style=\"\">\r\n");
      out.write("                                                                    <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("&cat_code=");
      out.print(rs3.getString(3));
      out.write("\"\r\n");
      out.write("                                                                        title=\"click to view\"> QUICK VIEW</a>\r\n");
      out.write("                                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("\">\r\n");
      out.write("                                                                        <img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm_slider);
      out.write("/Item_Images/");
      out.print(rs3.getString(5));
      out.write("\" alt=\"\">\r\n");
      out.write("                                                                    </a>\r\n");
      out.write("                                                                    <div class=\"caption\">\r\n");
      out.write("                                                                        <div class=\"row\">\r\n");
      out.write("                                                                            <h5>\r\n");
      out.write("                                                                                ");
      out.print( rs3.getString(2) );
      out.write("\r\n");
      out.write("                                                                            </h5>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <div class=\"row\" style=\"text-align: center;\">\r\n");
      out.write("                                                                            <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                                            <div class=\"col-sm-6\" style=\"margin-top: 100px;\">\r\n");
      out.write("                                                                                <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu \" class=\"result-menu btn btn-small cblack \">\r\n");
      out.write("                                                                                                                        <input type=\"text \" class=\"rating rating5 \" readonly=\"readonly\r\n");
      out.write("                                                                                    \" value=\"");
      out.print(rs3.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                                                            \r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                            <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <div class=\"row\">\r\n");
      out.write("                                                                            <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                                            <div class=\"col-sm-6\" style=\"margin-top: 50px;\">\r\n");
      out.write("                                                                                <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                                                                    ");
      out.print(rs3.getString(7));
      out.write("\r\n");
      out.write("                                                                                </a>\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                            <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <!-- <div class=\"caption\" style=\"height: 200px;\">\r\n");
      out.write("                                                                                                    <h5>\r\n");
      out.write("                                                                                                        ");
      out.print(rs3.getString(2));
      out.write("\r\n");
      out.write("                                                                                                    </h5>\r\n");
      out.write("                                                                                                    <div class=\"left mr10 mb5\">\r\n");
      out.write("                                                                                                        <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu\" class=\"result-menu btn btn-small cblack \"> <input type=\"text \" class=\"rating rating5 \" readonly=\"readonly\" value=\"");
      out.print(rs3.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                                                                                                    </div>\r\n");
      out.write("                                                                                                    <div class=\"left mr10 mb5\">\r\n");
      out.write("                                                                                                        <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                                                                                        ");
      out.print(rs3.getString(7));
      out.write("\r\n");
      out.write("                                                                                                        </a>\r\n");
      out.write("                                                                                                    </div>\r\n");
      out.write("                                                                                                    <div class=\"clear\"></div>\r\n");
      out.write("                                                                                                    </div> -->\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </li></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("                        ");

                                }
                                else{
                        
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-4\">        \r\n");
      out.write("                                <li class=\"span4\" style=\"\">\r\n");
      out.write("                                    <div class=\"thumbnail\" style=\"\">\r\n");
      out.write("                                        <a class=\"zoomTool\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("&cat_code=");
      out.print(rs3.getString(3));
      out.write("\"\r\n");
      out.write("                                        title=\"click to view\"> QUICK VIEW</a>\r\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/Select_Category?submit=product_details&item_code=");
      out.print(rs3.getString(1));
      out.write("\">\r\n");
      out.write("                                            <img src=\"");
      out.print(request.getContextPath() );
      out.write('/');
      out.print(cnm_slider);
      out.write("/Item_Images/");
      out.print(rs3.getString(5));
      out.write("\" alt=\"\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <div class=\"caption\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <h5>");
      out.print( rs3.getString(2) );
      out.write("</h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\" style=\"text-align: center;\">\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div> \r\n");
      out.write("                                                <div class=\"col-sm-6\" style=\"margin-top: 100px;\">\r\n");
      out.write("                                                    <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu \" class=\"result-menu btn btn-small cblack\">\r\n");
      out.write("                                                            <input type=\"text \" class=\"rating rating5 \" readonly=\"readonly \" value=\"");
      out.print(rs3.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                                <div class=\"col-sm-6\" style=\"margin-top: 50px;\">\r\n");
      out.write("                                                    <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                                        ");
      out.print(rs3.getString(7));
      out.write("\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-3\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- <div class=\"caption\" style=\"height: 200px;\">\r\n");
      out.write("                                        <h5>\r\n");
      out.write("                                            ");
      out.print(rs3.getString(2));
      out.write("\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <div class=\"left mr10 mb5\">\r\n");
      out.write("                                            <a href=\"#\" abs absolute barbecues Menu \" data-result-type=\"ResCard_Menu\" class=\"result-menu btn btn-small cblack \"> <input type=\"text \" class=\"rating rating5 \" readonly=\"readonly\" value=\"");
      out.print(rs3.getString(6));
      out.write("\" /> </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"left mr10 mb5\">\r\n");
      out.write("                                            <a href=\"#\" title=\"Posted Date\" class=\"result-photos btn btn-small search-result-reviews\" data-result-type=\"ResCard_Photos\">Rated By:\r\n");
      out.write("                                            ");
      out.print(rs3.getString(7));
      out.write("\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clear\"></div>\r\n");
      out.write("                                        </div> -->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        ");

                                }
                            }
                        }
                        int rem = track%3;
                        if(rem != 0){
                        
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                        ");

                        }
                
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("            \r\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Next</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\" style=\"margin-left: 0px; margin-right: 0px;\" id=\"target_afrm\">\r\n");
      out.write("                <div class=\"col-sm-12\">\r\n");
      out.write("                    <iframe frameborder=\"0\" scrolling=\"auto\" name=\"afrm\" style=\"height: 500px; width: 100%;\" align=\"middle\" onload=\"hide_movies()\">\r\n");
      out.write("                </div>\r\n");
      out.write("                </iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/jquery.easing-1.3.min.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/jquery.scrollTo-1.4.3.1-min.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/shop.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                function hide_movies(){\r\n");
      out.write("                    document.getElementById(\"showing_all_movie_on_login\").style.display = \"none\";\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("    </body>\r\n");
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
