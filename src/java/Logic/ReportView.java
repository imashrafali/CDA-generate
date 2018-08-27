/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Algorithm.XmlAsStringInJava;
import Algorithm.XmlAsStringInJavaMain;
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
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class ReportView extends HttpServlet {

    public static String file = "";
    String pid = "", pName = "", Gender = "", pAge = "", date = "", pEmail = "", did = "", docName = "", Information = "", Resion = "", Medications = "", data = "", hospital = "", filess = "";

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
            throws ServletException, IOException, SQLException, ClassNotFoundException, SAXException, ParserConfigurationException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;

        pid = request.getParameter("pid");
        pName = request.getParameter("pName");
        pEmail = request.getParameter("pEmail");
        date = request.getParameter("date");

        System.out.println("pid+pEmail+date = " + pid + pEmail + date);
        XmlAsStringInJavaMain xfile = new XmlAsStringInJavaMain();
        filess = xfile.xmlAsStringInJava(pid);
        System.out.println("file = " + file);
        session.setAttribute("filess", filess);

        //  session.setAttribute("data", file);

//        session.setAttribute("pName", pName);
//        session.setAttribute("pEmail", pEmail);
//        session.setAttribute("date", date);
//        DBQuery bd = new DBQuery();

// session.setAttribute("data", data);
        rd = request.getRequestDispatcher("ViewPatientReportA.jsp");
        rd.forward(request, response);


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
            try {
                processRequest(request, response);
            } catch (SAXException ex) {
                Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
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
            try {
                processRequest(request, response);
            } catch (SAXException ex) {
                Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReportView.class.getName()).log(Level.SEVERE, null, ex);
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
