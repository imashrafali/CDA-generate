/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Algorithm.WriteXMLFile;
import Algorithm.WriteXMLHospitalA;
import DataBase.DBQuery;
import java.io.IOException;
import java.io.PrintWriter;
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
public class PatientInfoA extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;

        String pid = request.getParameter("pid");
        String pName = request.getParameter("pName");
        String Gender = request.getParameter("Gender");
        String pAge = request.getParameter("pAge");

        String date = request.getParameter("date");
        String pEmail = request.getParameter("pEmail");
        String did = request.getParameter("did");
        String docName = request.getParameter("docName");

        String Information = request.getParameter("Information");
        String Resion = request.getParameter("Resion");
        String Medications = request.getParameter("Medications");
        String immunization = request.getParameter("immunization");
        String hospitalA = request.getParameter("hospitalA");
        String emailA = request.getParameter("emailA");

        String Problem = request.getParameter("Problem");
        String FamilyHistory = request.getParameter("FamilyHistory");
        String SocialHistory = request.getParameter("SocialHistory");
        String Allergies = request.getParameter("Allergies");
        String MedicalEquipment = request.getParameter("MedicalEquipment");
        String VitalSigns = request.getParameter("VitalSigns");
        String Results = request.getParameter("Results");
        String Procedures = request.getParameter("Procedures");
        String Encounter = request.getParameter("Encounter");
        String Planofcare = request.getParameter("Planofcare");

        WriteXMLFile wx1 = new WriteXMLFile();
        wx1.create(pid, pName, Gender, pAge, date, pEmail, did, docName, Information, Resion, Medications, immunization, Problem, FamilyHistory, SocialHistory, Allergies, MedicalEquipment, VitalSigns, Results, Procedures, Encounter, Planofcare, hospitalA);
     
        DBQuery bd = new DBQuery();

        int i = bd.patientInfo(pid, pName, Gender, pAge, date, pEmail, did, docName, Information, Resion, Medications, immunization, Problem, FamilyHistory, SocialHistory, Allergies, MedicalEquipment, VitalSigns, Results, Procedures, Encounter, Planofcare, hospitalA, emailA);

        if (i != 0) {
            session.setAttribute("PatientInfoA", "Upload successfull!!!");
            rd = request.getRequestDispatcher("ReportUploadA.jsp");
            rd.forward(request, response);

        } else {
            session.setAttribute("PatientInfoA", "Upload Unsuccessfull!!!");
            rd = request.getRequestDispatcher("ReportUploadA.jsp");
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
            Logger.getLogger(PatientInfoA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PatientInfoA.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PatientInfoA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PatientInfoA.class.getName()).log(Level.SEVERE, null, ex);
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
