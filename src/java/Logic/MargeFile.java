/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Algorithm.XmlAsStringInJavaMain;
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
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class MargeFile extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, SAXException, ParserConfigurationException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        XmlAsStringInJavaMain xfile = new XmlAsStringInJavaMain();
        String pid = request.getParameter("pid");
        String pName = request.getParameter("pName");
        String pEmail = request.getParameter("pEmail");
        String date = request.getParameter("date");
        String hospitalA = "hospitalA";
        String hospitalB = "hospitalB";
        String pidA = "";
        String pidB = "";

        DBQuery bd = new DBQuery();
        ResultSet rs = bd.hospitalA(pEmail, hospitalA);
        while (rs.next()) {
            pidA = rs.getString("pid");
        }
        String fileA = xfile.xmlAsStringInJava(pidA);
        rs = bd.hospitalB(pEmail, hospitalB);
        while (rs.next()) {
            pidB = rs.getString("pid");
        }
        String fileB = xfile.xmlAsStringInJava(pidB);
        
        session.setAttribute("fileA", fileA);
        session.setAttribute("fileB", fileB);

        rd = request.getRequestDispatcher("CDAGenerator.jsp");
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
                Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MargeFile.class.getName()).log(Level.SEVERE, null, ex);
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
