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
            String pid = "";
            if (session.getAttribute("pid") != null) {
                pid = session.getAttribute("pid").toString();
            }
            String pName = "";
            if (session.getAttribute("pName") != null) {
                pName = session.getAttribute("pName").toString();
            }
            String Gender = "";
            if (session.getAttribute("Gender") != null) {
                Gender = session.getAttribute("Gender").toString();
            }
            String pAge = "";
            if (session.getAttribute("pAge") != null) {
                pAge = session.getAttribute("pAge").toString();
            }
            String date = "";
            if (session.getAttribute("date") != null) {
                date = session.getAttribute("date").toString();
            }
            String pEmail = "";
            if (session.getAttribute("pEmail") != null) {
                pEmail = session.getAttribute("pEmail").toString();
            }
            String did = "";
            if (session.getAttribute("did") != null) {
                did = session.getAttribute("did").toString();
            }
            String docName = "";
            if (session.getAttribute("docName") != null) {
                docName = session.getAttribute("docName").toString();
            }
            String Information = "";
            if (session.getAttribute("Information") != null) {
                Information = session.getAttribute("Information").toString();
            }
            String Resion = "";
            if (session.getAttribute("Resion") != null) {
                Resion = session.getAttribute("Resion").toString();
            }
            String Medications = "";
            if (session.getAttribute("Medications") != null) {
                Medications = session.getAttribute("Medications").toString();
            }
            String immunization = "";
            if (session.getAttribute("immunization") != null) {
                immunization = session.getAttribute("immunization").toString();
            }
            String Problem = "";
            if (session.getAttribute("Problem") != null) {
                Problem = session.getAttribute("Problem").toString();
            }
            String FamilyHistory = "";
            if (session.getAttribute("FamilyHistory") != null) {
                FamilyHistory = session.getAttribute("FamilyHistory").toString();
            }
            String SocialHistory = "";
            if (session.getAttribute("SocialHistory") != null) {
                SocialHistory = session.getAttribute("SocialHistory").toString();
            }
            String Allergies = "";
            if (session.getAttribute("Allergies") != null) {
                Allergies = session.getAttribute("Allergies").toString();
            }
            String MedicalEquipment = "";
            if (session.getAttribute("MedicalEquipment") != null) {
                MedicalEquipment = session.getAttribute("MedicalEquipment").toString();
            }
            String VitalSigns = "";
            if (session.getAttribute("VitalSigns") != null) {
                VitalSigns = session.getAttribute("VitalSigns").toString();
            }
            String Results = "";
            if (session.getAttribute("Results") != null) {
                Results = session.getAttribute("Results").toString();
            }
            String Procedures = "";
            if (session.getAttribute("Procedures") != null) {
                Procedures = session.getAttribute("Procedures").toString();
            }
            String Encounter = "";
            if (session.getAttribute("Encounter") != null) {
                Encounter = session.getAttribute("Encounter").toString();
            }
            String Planofcare = "";
            if (session.getAttribute("Planofcare") != null) {
                Planofcare = session.getAttribute("Planofcare").toString();
            }
            String hospital = "";
            if (session.getAttribute("hospital") != null) {
                hospital = session.getAttribute("hospital").toString();
            }
            String authKeys = "";
            if (session.getAttribute("authKey") != null) {
                authKeys = session.getAttribute("authKey").toString();
            }
        %>
        <div class="wrap-body">


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
                                        <input name="q" type="text" size="40" value="Search..." />
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <nav id="menu-wrap"><div id="menu-trigger">Menu</div>    
                        <nav id="menu-wrap"><div id="menu-trigger">Menu</div>    
                            <ul id="menu" style="display: none;">
                                <li><a href="UserHome.jsp">Home</a></li>
                                <li><a href="PatientInformations.jsp">Patient Information</a></li>
                                <li><a href="ViewInformationU.jsp">View Information</a></li>
                                <li><a href="Logout.jsp">Logout</a></li>
                            </ul>
                        </nav>
                    </nav>
                </div>
            </header>
            <section id="container">
                <div class="wrap-container">
                    <div class="zerogrid">

                        <div class="col-2-3">
                            <div class="wrap-col">
                                <div class="contact">
                                    <center> <h3>Patient Information</h3>
                                        <div id="contact_form">
                                            <form name="form1" id="ff" method="post" action="PatientInfoA">
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                           patient id: <input type="text" name="pid" value="<%=pid%>"  />
                                                        </div>
                                                    </div>
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                          patient Name: <input type="text" name="pName" id="email" value="<%=pName%>"  />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                          Gender: <input type="text" name="Gender" id="name" value="<%=Gender%>"  />
                                                        </div>
                                                    </div>
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                           patient age: <input type="text" name="pAge" id="email" value="<%=pAge%>"  />
                                                        </div>
                                                    </div>
                                                </label>
                                                <label class="row">
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                          DOB: <input type="text" name="date" value="<%=date%>"  />
                                                        </div>
                                                    </div>
                                                    <div class="col-1-2">
                                                        <div class="wrap-col">
                                                            Email: <input type="text" name="pEmail" id="email" value="<%=pEmail%>"  />
                                                        </div>
                                                    </div>
                                                </label>

                                                <center> <h3>Doctor Information</h3>
                                                    <label class="row">
                                                        <div class="col-1-2">
                                                            <div class="wrap-col">
                                                               Doctor id: <input type="text" name="did" id="name" value="<%=did%>"  />
                                                            </div>
                                                        </div>
                                                        <div class="col-1-2">
                                                            <div class="wrap-col">
                                                               Doctor Name: <input type="text" name="docName" id="email" value="<%=docName%>"  />
                                                            </div>
                                                        </div>
                                                    </label>
                                                    <center> <h3>Clinical Information</h3>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                   Information: <input type="text" name="Information" id="name" value="<%=Information%>"  />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                  Reason: <input type="text" name="Resion" id="email" value="<%=Resion%>"  />
                                                                </div>
                                                            </div>
                                                        </label>
                                                        <label class="row">
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                Medications: <input type="text" name="Medications" id="name" value="<%=Medications%>"  />
                                                                </div>
                                                            </div>
                                                            <div class="col-1-2">
                                                                <div class="wrap-col">
                                                                    Immunization: <input type="text" name="immunization" id="email" value="<%=immunization%>"  />
                                                                </div>
                                                            </div>
                                                            <label class="row">
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                       Problems: <input type="text" name="Problem" id="Problem" value="<%=Problem%>"  />
                                                                    </div>
                                                                </div>
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                  Family History: <input type="text" name="FamilyHistory" id="FamilyHistory" value="<%=FamilyHistory%>"  />
                                                                    </div>
                                                                </div>
                                                            </label>
                                                            <label class="row">
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                           Social History: <input type="text" name="SocialHistory" id="SocialHistory" value="<%=SocialHistory%>"  />
                                                                    </div>
                                                                </div>
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                              Allergies: <input type="text" name="Allergies" id="Allergies" value="<%=Allergies%>"  />
                                                                    </div>
                                                                </div>
                                                            </label>
                                                            <label class="row">
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                           Medical Equipment: <input type="text" name="MedicalEquipment" id="MedicalEquipment" value="<%=MedicalEquipment%>"  />
                                                                    </div>
                                                                </div>
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                  Vital Signs: <input type="text" name="VitalSigns" id="VitalSigns" value="<%=VitalSigns%>"  />
                                                                    </div>
                                                                </div>
                                                            </label>
                                                            <label class="row">
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                 Results: <input type="text" name="Results" id="Results" value="<%=Results%>"  />
                                                                    </div>
                                                                </div>
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                       Procedures: <input type="text" name="Procedures" id="Procedures" value="<%=Procedures%>"  />
                                                                    </div>
                                                                </div>
                                                            </label>
                                                            <label class="row">
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                       Encounter: <input type="text" name="Encounter" id="Encounter" value="<%=Encounter%>"  />
                                                                    </div>
                                                                </div>
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                      Plan of care:  <input type="text" name="Planofcare" id="Planofcare" value="<%=Planofcare%>"  />
                                                                    </div>
                                                                </div>
                                                            </label>

                                                            <label class="row">
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                      Hospital Name:  <input type="text" name="hospital" id="name" value="<%=hospital%>"  />
                                                                    </div>
                                                                </div>
                                                                <div class="col-1-2">
                                                                    <div class="wrap-col">
                                                                    Auth. Keys:    <input type="text" name="authKeys" id="email" value="<%=authKeys%>"  />
                                                                    </div>
                                                                </div>
                                                            </label>
                                                           
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