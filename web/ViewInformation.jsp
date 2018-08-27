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
            String admit = "";
            if (session.getAttribute("admit") != null) {
                admit = session.getAttribute("admit").toString();
            }

        %>
        <div class="wrap-body">

            <!--////////////////////////////////////Header-->
            <header>
                <div class="zerogrid">
                    <div class="wrap-header">
                        <div class="row">
                            <center>  <h4 style="color: blue;"><%=admit%></h4><% session.removeAttribute("admit");%></center>
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
                            <li><a href="PhysicianHome.jsp">Home</a></li>
                            <li><a href="PatientInformation.jsp">Patient Information</a></li>
                            <li><a href="ViewInformation.jsp">View Information</a></li>
                            <li><a href="Logout.jsp">Logout</a></li>
                        </ul>
                    </nav>
                </div>
            </header>

            <section id="container">
                <div class="wrap-container">
                    <div class="zerogrid">
                        <div>
                            <div class="wrap-col">
                                <div class="contact">
                                    <center> <h3>Key Verification:</h3> 
                                        <div>
                                            <form action="KeyVrification" method="post">
                                                <table>
                                                    <tr><td>Verify Key:</td><td><input type="text" name="verificationKey" placeholder="Verify Key:" required="required" style="border: 1px solid #1c7791;"></td></tr>
                                                    <input type="hidden" name="utype" value="Physician">
                                                    <tr><td></td><td><br/><input type="submit" value="Submit" style=" background-color: #1c7791; color: #ffffff;"></td></tr>

                                                </table>
                                            </form>

                                    </center>
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