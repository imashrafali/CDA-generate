/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import DataBase.DBQuery;
import aes.AESencrp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
public class CDAGenerat extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        DataEnc des = new DataEnc();
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;

        String fileA = request.getParameter("fileA");
        String fileB = request.getParameter("fileB");
//        String emailA = request.getParameter("rvcv1992@gmail.com");// put email-id
//        String emailB = request.getParameter("rvcv1992@gmail.com");// put email-id
        String file = fileA + "\n" + fileB;


        AESencrp ds = new AESencrp();
        String encData = des.encrypt(file);

        MailSend eu = new MailSend();
        eu.emailUtility("vinayasingh55@gmail.com", encData);
        eu.emailUtility("95lavanyanmurthy@gmail.com", encData);

        session.setAttribute("encription", "CDA Generation Successfull");
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
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CDAGenerat.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (Exception ex) {
            Logger.getLogger(CDAGenerat.class.getName()).log(Level.SEVERE, null, ex);
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
