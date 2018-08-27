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
            String PatientInfoB = "";
            if (session.getAttribute("PatientInfoB") != null) {
                PatientInfoB = session.getAttribute("PatientInfoB").toString();
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
                            <li><a href="HospitalBHome.jsp">Home</a></li>
                            <li><a href="ReportUploadB.jsp">Report Upload</a></li>
                            <li><a href="ViewReportB.jsp">View Report</a></li>
                            <li><a href="FileRequestB.jsp">File Request</a></li>
                            <li><a href="Logout.jsp">Logout</a></li>
                        </ul>
                    </nav>
                </div>
            </header>

            <section id="container">
                <div class="wrap-container">
                    <div class="zerogrid">
                        <center>  <h4><%=PatientInfoB%></h4><br/> <% session.removeAttribute("PatientInfoB");%></center>
                        <div class="col-2-3">
                            <div class="wrap-col">
                                <div class="contact">
                                    <center> <h3>Patient Information</h3>
                                        <div id="contact_form">
                                            <form name="form1" id="ff" method="post" action="PatientInfoB">
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="pid" id="name" placeholder="Patient-ID" required="required" />
                                                        </div>
                                                    </div>
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="pName" id="email" placeholder="Patient Name" required="required" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="Gender" id="name" placeholder="Gender" required="required" />
                                                        </div>
                                                    </div>
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="pAge" id="email" placeholder="Patient Age" required="required" />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="date" name="date" id="name" required="required" />
                                                        </div>
                                                    </div>
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            <input type="text" name="pEmail" id="email" placeholder="Email-ID" required="required" />
                                                        </div>
                                                    </div>
                                                </label>

                                                <center> <h3>Doctor Information</h3>
                                                    <label class="row">
                                                        <div class="col-1-2">
                                                            <div class="wrap-col">
                                                                <input type="text" name="did" id="name" placeholder="Doctor-ID" required="required" />
                                                            </div>
                                                        </div>
                                                        <div class="col-1-2">
                                                            <div class="wrap-col">
                                                                <input type="text" name="docName" id="email" placeholder="Doctor Name" required="required" />
                                                            </div>
                                                        </div>
                                                    </label>
                                                    <center> <h3>Clinical Information</h3>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Information" id="name" placeholder="patient Information" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Reason" id="email" placeholder="Reason For Visit" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Medications" id="name" placeholder="Medications" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="immunization" id="email" placeholder="Immunization" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>

                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Problem" id="name" placeholder="Problem" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="FamilyHistory" id="email" placeholder="Family History" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="SocialHistory" id="name" placeholder="Social History" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Allergies" id="email" placeholder="Allergies" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="MedicalEquipment" id="name" placeholder="Medical Equipment" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="VitalSigns" id="email" placeholder="Vital Signs" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Results" id="name" placeholder="Results" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Procedures" id="email" placeholder="Procedures" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Encounter" id="name" placeholder="Encounter" required="required" />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    <input type="text" name="Planofcare" id="email" placeholder="Plan Of Care" required="required" />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <input type="hidden" name="hospitalB" value="hospitalB"/>
                                                        <input type="hidden" name="emailB" value="rvcv1992@gmail.com"/>
                                                        <center><input class="sendButton" type="submit" name="Submit" value="Submit"></center>
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