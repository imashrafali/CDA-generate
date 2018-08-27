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
            String fileA = "";
            if (session.getAttribute("fileA") != null) {
                fileA = session.getAttribute("fileA").toString();
            }
            String fileB = "";
            if (session.getAttribute("fileB") != null) {
                fileB = session.getAttribute("fileB").toString();
            }
            String encription = "";
            if (session.getAttribute("encription") != null) {
                encription = session.getAttribute("encription").toString();
            }
            String emailA = "";
            if (session.getAttribute("emailA") != null) {
                emailA = session.getAttribute("emailA").toString();
            }
            String emailB = "";
            if (session.getAttribute("emailB") != null) {
                emailB = session.getAttribute("emailB").toString();
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
                            <li><a href="CloudHome.jsp">Cloud Home</a></li>
                            <li><a href="CDAGenerator.jsp">CDA Generator</a></li>
                            <li><a href="HospitalRequest.jsp">Hospital Request</a></li>
                            <li><a href="Logout.jsp">Logout</a></li>
                        </ul>
                    </nav>
                </div>
            </header>

            <section id="container">
                <div class="wrap-container">
                    <div class="zerogrid">
                        <center>  <h4 style="color: blue;"><%=encription%></h4><% session.removeAttribute("encription");%></center>
                        <div class="col-2-3">
                            <div class="wrap-col">
                                <div class="contact">
                                    <h3>CDA Generator</h3>
                                    <div id="contact_form">
                                        <h4>Hospital-A</h4>
                                        <form name="form1" id="ff" method="post" action="CDAGenerat">
                                            <label class="row">
                                                <div class="col-1-2">
                                                    <div class="wrap-col" style="overflow-x:auto;">
                                                        <textarea rows="8" cols="50" name="fileA" value="<%=fileA%>"><%=fileA%></textarea>
                                                        <input type="hidden" name="emailA" value="<%=emailA%>">
                                                    </div>
                                                </div>
                                            </label>

                                            <h4>Hospital-B</h4>
                                            <label class="row"> 
                                                <div class="col-1-2">
                                                    <div class="wrap-col" style="overflow-x:auto;">
                                                        <textarea rows="8" cols="50"  name="fileB" value="<%=fileB%>"><%=fileB%></textarea>
                                                        <input type="hidden" name="emailB" value="<%=emailB%>">
                                                    </div>
                                                </div>
                                            </label></center>
                                            <input class="sendButton" type="submit" name="Submit" value="CDA Integrator">
                                        </form>
                                        </center>
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