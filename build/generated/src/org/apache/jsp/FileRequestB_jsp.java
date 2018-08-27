package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DataBase.DBQuery;

public final class FileRequestB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html lang=\"en\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!-- Basic Page Needs\n");
      out.write("      ================================================== -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>CDA Generation and Integration for Health Information</title>\n");
      out.write("        <meta name=\"description\" content=\"Free Responsive Html5 Css3 Templates | zerotheme.com\">\n");
      out.write("        <meta name=\"author\" content=\"www.zerotheme.com\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Specific Metas\n");
      out.write("      ================================================== -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- CSS\n");
      out.write("      ================================================== -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/zerogrid.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsiveslides.css\">\n");
      out.write("        <script src=\"js/jquery183.min.js\"></script>\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            // You can also use \"$(window).load(function() {\"\n");
      out.write("            $(function () {\n");
      out.write("                // Slideshow \n");
      out.write("                $(\"#slider\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    pager: false,\n");
      out.write("                    nav: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    before: function () {\n");
      out.write("                        $('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("                    },\n");
      out.write("                    after: function () {\n");
      out.write("                        $('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 8]>\n");
      out.write("       <div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("         <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n");
      out.write("           <img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    <![endif]-->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                    <script src=\"js/html5.js\"></script>\n");
      out.write("                    <script src=\"js/css3-mediaqueries.js\"></script>\n");
      out.write("            <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String admit = "";
            if (session.getAttribute("admit") != null) {
                admit = session.getAttribute("admit").toString();
            }

        
      out.write("\n");
      out.write("        <div class=\"wrap-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <div class=\"zerogrid\">\n");
      out.write("                    <div class=\"wrap-header\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <center>  <h4 style=\"color: blue;\">");
      out.print(admit);
      out.write("</h4>");
 session.removeAttribute("admit");
      out.write("</center>\n");
      out.write("                            <div class=\"col-1-3\">\n");
      out.write("                                <div class=\"wrap-col\">\n");
      out.write("                                    <div class=\"logo\"><a href=\"#\"><img src=\"images/logo.png\"/></a></div>\t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-1-3 offset-1-3\">\n");
      out.write("                                <div class=\"wrap-col\">\n");
      out.write("                                    <form method=\"get\" action=\"/search\" id=\"search\" class=\"f-right\">\n");
      out.write("                                        <input name=\"q\" type=\"text\" size=\"40\" placeholder=\"Search...\" />\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <nav id=\"menu-wrap\"><div id=\"menu-trigger\">Menu</div>    \n");
      out.write("                        <ul id=\"menu\" style=\"display: none;\">\n");
      out.write("                            <li><a href=\"HospitalBHome.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"ReportUploadB.jsp\">Report Upload</a></li>\n");
      out.write("                            <li><a href=\"ViewReportB.jsp\">View Report</a></li>\n");
      out.write("                            <li><a href=\"FileRequestB.jsp\">File Request</a></li>\n");
      out.write("                            <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <section id=\"container\">\n");
      out.write("                <div class=\"wrap-container\">\n");
      out.write("                    <div class=\"zerogrid\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"wrap-col\">\n");
      out.write("                                <div class=\"contact\">\n");
      out.write("                                    <center> <h3>Patient Report</h3> \n");
      out.write("                                        <div id=\"contact_form\">\n");
      out.write("                                            <table style=\"width: 80%; border: 2px solid menutext; \">\n");
      out.write("                                                <tr style=\"border: 2px solid menutext; \"><th style=\"border: 2px solid menutext; \">Patient-ID</th><th style=\"border: 2px solid menutext; \">Patient Name</th><th style=\"border: 2px solid menutext; \">Patient Email-ID</th><th style=\"border: 2px solid menutext;\">Date Of Birth</th> <th style=\"border: 2px solid menutext; \">View</th> </tr>\n");
      out.write("\n");
      out.write("                                                ");

                                                    String hospitalB = "hospitalA";
                                                    DBQuery dbq = new DBQuery();
                                                    ResultSet rs = dbq.patientDetails(hospitalB);
                                                    while (rs.next()) {
                                                        String pid = rs.getString("pid");
                                                        String pName = rs.getString("pName");
                                                        String pEmail = rs.getString("pEmail");
                                                        String date = rs.getString("date");
                                                
      out.write("\n");
      out.write("                                                <tr style=\"border: 2px solid menutext; \"><td style=\"border: 2px solid menutext; \">");
      out.print(pid);
      out.write("</td><td style=\"border: 2px solid menutext; \">");
      out.print(pName);
      out.write("</td><td>");
      out.print(pEmail);
      out.write("</td><td style=\"border: 2px solid menutext; \">");
      out.print(date);
      out.write("</td>\n");
      out.write("                                                    <td style=\"border: 2px solid menutext; \">\n");
      out.write("                                                        <form method=\"post\" action=\"FileRequest\">\n");
      out.write("                                                            <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\">\n");
      out.write("                                                            <input type=\"hidden\" name=\"pName\" value=\"");
      out.print(pName);
      out.write("\">\n");
      out.write("                                                            <input type=\"hidden\" name=\"pEmail\" value=\"");
      out.print(pEmail);
      out.write("\">\n");
      out.write("                                                            <input type=\"hidden\" name=\"date\" value=\"");
      out.print(date);
      out.write("\">\n");
      out.write("                                                            <input type=\"submit\"  value=\"VIEW\" style=\"width: 50px; background-color: aliceblue; color: darkviolet;\"> \n");
      out.write("                                                        </form>\n");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </table></center>\n");
      out.write("                                    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"zerogrid\">\n");
      out.write("        <div class=\"wrap-footer\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-1-2\">\n");
      out.write("                    <div class=\"wrap-col\">\n");
      out.write("                        <div class=\"copy-right\">\n");
      out.write("                            <p>Copyright 2015 - <a href=\"http://www.zerotheme.com\" target=\"_blank\" rel=\"nofollow\">Free Html5 Templates</a> designed by ZEROTHEME</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-1-2\">\n");
      out.write("                    <div class=\"wrap-col\">\n");
      out.write("                        <div class=\"bottom-social t-right\">\n");
      out.write("                            <a href=\"#\"><img src=\"images/facebook.png\" title=\"facebook\"/></a>\n");
      out.write("                            <a href=\"#\"><img src=\"images/twitter.png\" title=\"twitter\"/></a>\n");
      out.write("                            <a href=\"#\"><img src=\"images/google.png\" title=\"google\"/></a>\n");
      out.write("                            <a href=\"#\"><img src=\"images/pinterest.png\" title=\"pinterest\"/></a>\n");
      out.write("                            <a href=\"#\"><img src=\"images/instagram.png\" title=\"instagram\"/></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(function() {\n");
      out.write("        if ($.browser.msie && $.browser.version.substr(0,1)<7)\n");
      out.write("        {\n");
      out.write("            $('li').has('ul').mouseover(function(){\n");
      out.write("                $(this).children('ul').css('visibility','visible');\n");
      out.write("            }).mouseout(function(){\n");
      out.write("                $(this).children('ul').css('visibility','hidden');\n");
      out.write("            })\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Mobile */\n");
      out.write("        $(\"#menu-trigger\").on(\"click\", function(){\n");
      out.write("            $(\"#menu\").slideToggle();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // iPad\n");
      out.write("        var isiPad = navigator.userAgent.match(/iPad/i) != null;\n");
      out.write("        if (isiPad) $('#menu ul').addClass('no-transition');      \n");
      out.write("    });          \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
