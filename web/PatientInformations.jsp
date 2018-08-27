<%@page import="java.sql.ResultSet"%>
<%@page import="DataBase.DBQuery"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
    <head>

        <!-- Basic Page Needs
      ================================================== -->
        <meta charset="utf-8">
        <title>CDA Generation and Integration for Health Information</title>
        <meta name="description" content="Free Responsive Html5 Css3 Templates | zerotheme.com">
        <meta name="author" content="www.zerotheme.com">

        <!-- Mobile Specific Metas
      ================================================== -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <!-- CSS
      ================================================== -->
        <link rel="stylesheet" href="css/zerogrid.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/menu.css">
        <link rel="stylesheet" href="css/responsiveslides.css">
        <script src="js/jquery183.min.js"></script>
        <script src="js/responsiveslides.min.js"></script>
        <script>
            // You can also use "$(window).load(function() {"
            $(function () {
                // Slideshow 
                $("#slider").responsiveSlides({
                    auto: true,
                    pager: false,
                    nav: true,
                    speed: 500,
                    namespace: "callbacks",
                    before: function () {
                        $('.events').append("<li>before event fired.</li>");
                    },
                    after: function () {
                        $('.events').append("<li>after event fired.</li>");
                    }
                });
            });
        </script>

        <!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
        <!--[if lt IE 9]>
                    <script src="js/html5.js"></script>
                    <script src="js/css3-mediaqueries.js"></script>
            <![endif]-->

    </head>
    <body>
        <%
            String urFileRequest = "";
            if (session.getAttribute("urFileRequest") != null) {
                urFileRequest = session.getAttribute("urFileRequest").toString();
            }
            String pids = "";
            if (session.getAttribute("uid") != null) {
                pids = session.getAttribute("uid").toString();
            }
            String userName = "";
            if (session.getAttribute("userName") != null) {
                userName = session.getAttribute("userName").toString();
            }
            String user_id = "";
            if (session.getAttribute("user_id") != null) {
                user_id = session.getAttribute("user_id").toString();
            }

            String emails = "";
            if (session.getAttribute("pEmail") != null) {
                emails = session.getAttribute("pEmail").toString();
            }
            String mobile = "";
            if (session.getAttribute("mobile") != null) {
                mobile = session.getAttribute("mobile").toString();
            }
            String state = "";
            if (session.getAttribute("state") != null) {
                state = session.getAttribute("state").toString();
            }
            String country = "";
            if (session.getAttribute("country") != null) {
                country = session.getAttribute("country").toString();
            }
            String utypes = "";
            if (session.getAttribute("utypes") != null) {
                utypes = session.getAttribute("utypes").toString();
            }
        %>
        <div class="wrap-body">

            <!--////////////////////////////////////Header-->
            <header>
                <div class="zerogrid">
                    <div class="wrap-header">
                        <div class="row">

                            <div class="col-1-3">
                                <div class="wrap-col">
                                    <div class="logo"><a href="#"><img src="images/logo.png"/></a></div>	
                                </div>
                            </div>
                            <div class="col-1-3 offset-1-3">
                                <div class="wrap-col">
                                    <form method="get" action="/search" id="search" class="f-right">
                                        <input name="q" type="text" size="40" placeholder="Search..." />
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <nav id="menu-wrap"><div id="menu-trigger">Menu</div>    
                        <ul id="menu" style="display: none;">
                            <li><a href="UserHome.jsp">Home</a></li>
                            <li><a href="PatientInformations.jsp">Patient Information</a></li>
                            <li><a href="ViewInformationU.jsp">View Information</a></li>
                            <li><a href="Logout.jsp">Logout</a></li>
                        </ul>
                    </nav>
                </div>
            </header>

            <section id="container">
                <div class="wrap-container">
                    <div class="zerogrid">
                        <div>
                            <center>  <h2 style="color: blue;"><%=urFileRequest%></h2><% session.removeAttribute("urFileRequest");%></center>
                            <div class="wrap-col">
                                <div class="contact">
                                    <center> <h3>Patient Report</h3> 
                                        <div id="contact_form">
                                            <table style="width: 80%; border: 2px solid menutext; ">
                                                <tr style="border: 2px solid menutext; "><th style="border: 2px solid menutext; ">Patient-ID</th><th style="border: 2px solid menutext; ">Patient Name</th><th style="border: 2px solid menutext; ">Patient Email-ID</th><th style="border: 2px solid menutext;">Date Of Birth</th> <th style="border: 2px solid menutext; ">Request</th> </tr>

                                                <%
                                                    String hospitalB = "hospitalA";
                                                    DBQuery dbq = new DBQuery();
                                                    ResultSet rs = dbq.patientDetails(hospitalB);
                                                    while (rs.next()) {
                                                        String pid = rs.getString("pid");
                                                        String pName = rs.getString("pName");
                                                        String pEmail = rs.getString("pEmail");
                                                        String date = rs.getString("date");
                                                %>
                                                <tr style="border: 2px solid menutext; "><td style="border: 2px solid menutext; "><%=pid%></td><td style="border: 2px solid menutext; "><%=pName%></td><td><%=pEmail%></td><td style="border: 2px solid menutext; "><%=date%></td>
                                                    <td style="border: 2px solid menutext; ">
                                                        <form method="post" action="PhFileRequest">
                                                            <input type="hidden" name="user_id" value="<%=user_id%>">
                                                            <input type="hidden" name="userName" value="<%=userName%>">
                                                            <input type="hidden" name="pEmail" value="<%=emails%>">
                                                            <input type="hidden" name="mobile" value="<%=mobile%>">
                                                            <input type="hidden" name="state" value="<%=state%>">
                                                            <input type="hidden" name="country" value="<%=country%>">
                                                            <input type="hidden" name="pid" value="<%=pid%>">
                                                            <input type="hidden" name="pName" value="<%=pName%>">
                                                            <input type="hidden" name="pEmail" value="<%=pEmail%>">
                                                            <input type="hidden" name="date" value="<%=date%>">
                                                            <input type="hidden" name="pids" value="<%=pids%>">
                                                            <input type="hidden" name="utype" value="User">
                                                            <input type="submit"  value="Send" style="width: 50px; background-color: aliceblue; color: darkviolet;"> 
                                                        </form>

                                                    </td>

                                                </tr>
                                                <%}%>
                                            </table></center>
                                    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
    </div>
</section>

<footer>
    <div class="zerogrid">
        <div class="wrap-footer">
            <div class="row">
                <div class="col-1-2">
                    <div class="wrap-col">
                        <div class="copy-right">
                            <p>Copyright 2015 - <a href="http://www.zerotheme.com" target="_blank" rel="nofollow">Free Html5 Templates</a> designed by ZEROTHEME</p>
                        </div>
                    </div>
                </div>
                <div class="col-1-2">
                    <div class="wrap-col">
                        <div class="bottom-social t-right">
                            <a href="#"><img src="images/facebook.png" title="facebook"/></a>
                            <a href="#"><img src="images/twitter.png" title="twitter"/></a>
                            <a href="#"><img src="images/google.png" title="google"/></a>
                            <a href="#"><img src="images/pinterest.png" title="pinterest"/></a>
                            <a href="#"><img src="images/instagram.png" title="instagram"/></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>

<script type="text/javascript">
    $(function() {
        if ($.browser.msie && $.browser.version.substr(0,1)<7)
        {
            $('li').has('ul').mouseover(function(){
                $(this).children('ul').css('visibility','visible');
            }).mouseout(function(){
                $(this).children('ul').css('visibility','hidden');
            })
        }

        /* Mobile */
        $("#menu-trigger").on("click", function(){
            $("#menu").slideToggle();
        });

        // iPad
        var isiPad = navigator.userAgent.match(/iPad/i) != null;
        if (isiPad) $('#menu ul').addClass('no-transition');      
    });          
</script>

</div>
</body></html>