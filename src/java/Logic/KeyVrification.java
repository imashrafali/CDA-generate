/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataBase.DBQuery;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class KeyVrification extends HttpServlet {

    String pid = "", pName = "", Gender = "", pAge = "", date = "", pEmail = "", did = "", docName = "";
    String Information = "", Resion = "", Medications = "", immunization = "", hospital = "", authKey = "";
    String Problem = "", FamilyHistory = "", SocialHistory = "", Allergies = "", MedicalEquipment = "", VitalSigns = "";
    String Results = "", Procedures = "", Encounter = "", Planofcare = "";

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException, InterruptedException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        String verificationKey = request.getParameter("verificationKey");// 
        System.out.println("verificationKey = " + verificationKey);
        String utype = request.getParameter("utype");
        DBQuery dbq = new DBQuery();
        String key = dbq.verificationKeys(verificationKey);

        if (key.equalsIgnoreCase(verificationKey)) {
            System.out.println("key+verificationKey = " + key + verificationKey);
            if (utype.equalsIgnoreCase("Physician")) {
                ResultSet rs = dbq.verificationKey(verificationKey);
                Thread.sleep(1000);
                System.out.println("p  h  y  s  i  c  i  a  n");
                while (rs.next()) {
                    pid = rs.getString("pid");
                    System.out.println("pid = " + pid);
                    pName = rs.getString("pName");
                    Gender = rs.getString("Gender");
                    pAge = rs.getString("pAge");
                    System.out.println("pAge = " + pAge);
                    date = rs.getString("date");
                    System.out.println("date = " + date);
                    pEmail = rs.getString("pEmail");
                    System.out.println("pEmail = " + pEmail);
                    did = rs.getString("did");
                    docName = rs.getString("docName");
                    System.out.println("userName = " + docName);
                    Information = rs.getString("Information");
                    System.out.println("pEmail = " + Gender);
                    Resion = rs.getString("Resion");
                    System.out.println("mobile = " + Gender);
                    Medications = rs.getString("Medications");
                    System.out.println("state = " + pAge);
                    immunization = rs.getString("immunization");
                    System.out.println("immunization = " + immunization);
                    Problem = rs.getString("Problem");
                    System.out.println("Problem = " + Problem);
                    FamilyHistory = rs.getString("FamilyHistory");
                    System.out.println("SocialHistory = " + FamilyHistory);
                    SocialHistory = rs.getString("SocialHistory");
                    System.out.println("SocialHistory = " + SocialHistory);
                    Allergies = rs.getString("Allergies");
                    System.out.println("Allergies = " + Allergies);
                    MedicalEquipment = rs.getString("MedicalEquipment");
                    System.out.println("MedicalEquipment = " + MedicalEquipment);
                    VitalSigns = rs.getString("VitalSigns");
                    System.out.println("VitalSigns = " + VitalSigns);
                    Results = rs.getString("Results");
                    System.out.println("Results = " + Results);
                    Procedures = rs.getString("Procedures");
                    System.out.println("Procedures = " + Procedures);
                    Encounter = rs.getString("Encounter");
                    System.out.println("Encounter = " + Encounter);
                    Planofcare = rs.getString("Planofcare");
                    System.out.println("Planofcare = " + Planofcare);
                    hospital = rs.getString("hospital");
                    System.out.println("utypes = " + hospital);
                    authKey = rs.getString("authKey");
                }
                Thread.sleep(1000);
                session.setAttribute("pid", pid);
                session.setAttribute("pName", pName);
                session.setAttribute("Gender", Gender);
                session.setAttribute("pAge", pAge);
                session.setAttribute("date", date);
                session.setAttribute("pEmail", pEmail);
                session.setAttribute("did", did);

                session.setAttribute("docName", docName);
                session.setAttribute("Information", Information);
                session.setAttribute("Resion", Resion);
                session.setAttribute("Medications", Medications);
                session.setAttribute("immunization", immunization);
                session.setAttribute("Problem", Problem);
                session.setAttribute("FamilyHistory", FamilyHistory);
                session.setAttribute("SocialHistory", SocialHistory);
                session.setAttribute("Allergies", Allergies);
                session.setAttribute("MedicalEquipment", MedicalEquipment);
                session.setAttribute("VitalSigns", VitalSigns);
                session.setAttribute("Results", Results);
                session.setAttribute("Procedures", Procedures);
                session.setAttribute("Encounter", Encounter);
                session.setAttribute("Planofcare", Planofcare);
                session.setAttribute("hospital", hospital);
                session.setAttribute("authKey", authKey);

                rd = request.getRequestDispatcher("VerifyKeyInformation.jsp");
                rd.forward(request, response);

            } else if (utype.equalsIgnoreCase("User")) {

                ResultSet rs = dbq.verificationKey(verificationKey);
                Thread.sleep(1000);
                System.out.println("p  h  y  s  i  c  i  a  n");
                while (rs.next()) {
                    pid = rs.getString("pid");
                    System.out.println("userName = " + pid);
                    pName = rs.getString("pName");
                    System.out.println("pEmail = " + Gender);
                    Gender = rs.getString("Gender");
                    System.out.println("mobile = " + Gender);
                    pAge = rs.getString("pAge");
                    System.out.println("state = " + pAge);
                    date = rs.getString("date");
                    System.out.println("country = " + date);
                    pEmail = rs.getString("pEmail");
                    System.out.println("utypes = " + pEmail);
                    did = rs.getString("did");

                    docName = rs.getString("docName");
                    System.out.println("userName = " + docName);
                    Information = rs.getString("Information");
                    System.out.println("pEmail = " + Gender);
                    Resion = rs.getString("Resion");
                    System.out.println("mobile = " + Gender);
                    Medications = rs.getString("Medications");
                    System.out.println("state = " + pAge);
                    immunization = rs.getString("immunization");
                    System.out.println("immunization = " + immunization);
                    Problem = rs.getString("Problem");
                    System.out.println("Problem = " + Problem);
                    FamilyHistory = rs.getString("FamilyHistory");
                    System.out.println("SocialHistory = " + FamilyHistory);
                    SocialHistory = rs.getString("SocialHistory");
                    System.out.println("SocialHistory = " + SocialHistory);
                    Allergies = rs.getString("Allergies");
                    System.out.println("Allergies = " + Allergies);
                    MedicalEquipment = rs.getString("MedicalEquipment");
                    System.out.println("MedicalEquipment = " + MedicalEquipment);
                    VitalSigns = rs.getString("VitalSigns");
                    System.out.println("VitalSigns = " + VitalSigns);
                    System.out.println("VitalSigns = " + VitalSigns);
                    Results = rs.getString("Results");
                    System.out.println("Results = " + Results);
                    Procedures = rs.getString("Procedures");
                    System.out.println("Procedures = " + Procedures);
                    Encounter = rs.getString("Encounter");
                    System.out.println("Encounter = " + Encounter);
                    Planofcare = rs.getString("Planofcare");
                    System.out.println("Planofcare = " + Planofcare);
                    hospital = rs.getString("hospital");
                    System.out.println("utypes = " + hospital);
                    authKey = rs.getString("authKey");
                }
                Thread.sleep(1000);
                session.setAttribute("pid", pid);
                session.setAttribute("pName", pName);
                session.setAttribute("Gender", Gender);
                session.setAttribute("pAge", pAge);
                session.setAttribute("date", date);
                session.setAttribute("pEmail", pEmail);
                session.setAttribute("did", did);
                session.setAttribute("docName", docName);
                session.setAttribute("Information", Information);
                session.setAttribute("Resion", Resion);
                session.setAttribute("Medications", Medications);
                session.setAttribute("immunization", immunization);
                session.setAttribute("Problem", Problem);
                session.setAttribute("FamilyHistory", FamilyHistory);
                session.setAttribute("SocialHistory", SocialHistory);
                session.setAttribute("Allergies", Allergies);
                session.setAttribute("MedicalEquipment", MedicalEquipment);
                session.setAttribute("VitalSigns", VitalSigns);
                session.setAttribute("Results", Results);
                session.setAttribute("Procedures", Procedures);
                session.setAttribute("Encounter", Encounter);
                session.setAttribute("Planofcare", Planofcare);
                session.setAttribute("hospital", hospital);
                session.setAttribute("authKey", authKey);

                rd = request.getRequestDispatcher("VerifyKeyInformationU.jsp");
                rd.forward(request, response);

            }
        } else {

            session.setAttribute("logins", "Sorry: Your Key verification Failed!!!");
            rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KeyVrification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KeyVrification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(KeyVrification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KeyVrification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KeyVrification.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(KeyVrification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
