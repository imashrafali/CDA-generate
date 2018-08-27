/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Algorithm.KeyGeneration;
import Algorithm.MailSend;
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
public class ApproveRequest extends HttpServlet {

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

        String user_id = request.getParameter("user_id");
        String userName = request.getParameter("userName");
        String emails = request.getParameter("emails");
        String mobile = request.getParameter("mobile");

        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String pid = request.getParameter("pid");
        String pName = request.getParameter("pName");

        String pEmail = request.getParameter("pEmail");
        String date = request.getParameter("date");
        String utype = request.getParameter("utype");

        KeyGeneration kg = new KeyGeneration();
        String key = kg.keyGeneration();
        String keys = "Your File Secret key:: " + key;
        DBQuery bd = new DBQuery();
       
        MailSend ms = new MailSend();
        ms.emailUtility(emails, keys);

        int i = bd.keyRecover(pid, pName, pEmail, date, utype, key, emails, user_id);

        if (utype.equalsIgnoreCase("User")) {
            if (i != 0) {
                session.setAttribute("UserRequest", "Registration successfull!!!");
                rd = request.getRequestDispatcher("UserRequest.jsp");
                rd.forward(request, response);

            } else {
                session.setAttribute("UserRequest", "Registration Unsuccessfull!!!");
                rd = request.getRequestDispatcher("UserRequest.jsp");
                rd.forward(request, response);
            }

        } else if (utype.equalsIgnoreCase("Physician")) {
            if (i != 0) {
                session.setAttribute("phFileRequest", "Approve successfull!!!");
                rd = request.getRequestDispatcher("PhysicianRequest.jsp");
                rd.forward(request, response);

            } else {
                session.setAttribute("phFileRequest", "Approve Unsuccessfull!!!");
                rd = request.getRequestDispatcher("PhysicianRequest.jsp");
                rd.forward(request, response);
            }
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
            Logger.getLogger(ApproveRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ApproveRequest.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ApproveRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ApproveRequest.class.getName()).log(Level.SEVERE, null, ex);
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
