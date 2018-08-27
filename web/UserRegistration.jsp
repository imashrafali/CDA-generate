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
            String UserRegistration = "";
            if (session.getAttribute("UserRegistration") != null) {
                UserRegistration = session.getAttribute("UserRegistration").toString();
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
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="HospitalA.jsp">Hospital A</a></li>
                            <li><a href="HospitalB.jsp">Hospital B</a></li>
                            <li>
                                <a href="#">physician</a>
                                <ul>
                                    <li>
                                        <a href="PhRegistration.jsp">Registration</a>
                                    </li>
                                    <li>
                                        <a href="PhLogin.jsp">Login</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">User Section</a>
                                <ul>
                                    <li>
                                        <a href="UserRegistration.jsp">Registration</a>
                                    </li>
                                    <li>
                                        <a href="UserLogin.jsp">Login</a>
                                    </li>
                                </ul>
                            </li>
                            <li><a href="Cloud.jsp">Cloud</a></li>
                            <li><a href="Admin.jsp">Admin</a></li>
                             <li><a href="DataDecryption.jsp">Data Decryption</a></li>
                        </ul>
                    </nav>
                </div>
            </header>

            <section id="container">
                <div class="wrap-container">
                    <div class="zerogrid">
                        <center>  <h4 style="color: blue;"><%=UserRegistration%></h4><% session.removeAttribute("UserRegistration");%></center>
                        <div class="col-2-3">
                            <div class="wrap-col">
                                <div class="contact">
                                    <center> <h3>Patient Registration</h3>
                                        <div id="contact_form">
                                            <form name="form1" id="ff" method="post" action="PhysicianRegistration">
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="phyId" id="name" placeholder="Patient-ID" required="required" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="userName" id="name" placeholder="User Name" required="required" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="password" name="password" id="name" placeholder="Password" required="required" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="pEmail" id="email" placeholder="Email-ID" required="required" />
                                                        </div>
                                                    </div>
                                                </label>


                                                <label class="row">

                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="mobile" id="email" placeholder="Mobile" required="required" />
                                                        </div>
                                                    </div>
                                                </label>

                                                <label class="row">

                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="state" id="email" placeholder="State" required="required" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="country" id="name" placeholder="Country" required="required" />
                                                        </div>
                                                    </div>

                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="hidden" name="utype" value="User" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <center>
                                                    <input class="sendButton" type="submit" name="Submit" value="Submit">
                                                </center>
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