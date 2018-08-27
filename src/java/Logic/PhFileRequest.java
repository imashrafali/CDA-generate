/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

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
public class PhFileRequest extends HttpServlet {

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

        String userName = request.getParameter("userName");
        String emails = request.getParameter("pEmail");
        String mobile = request.getParameter("mobile");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String user_id = request.getParameter("user_id");
        String pid = request.getParameter("pid");
        String pName = request.getParameter("pName");
        String pEmail = request.getParameter("pEmail");
        String date = request.getParameter("date");
        String utype = request.getParameter("utype");
        String pids = request.getParameter("pids");

        DBQuery bd = new DBQuery();

        int i = bd.phFileRequest(user_id, userName, emails, mobile, state, country, pid, pName, pEmail, date, utype, pids);// Physician
        System.out.println("i = " + i);
        if (utype.equalsIgnoreCase("User")) {
            if (i != 0) {
                session.setAttribute("urFileRequest", "Send successfull!!!");
                rd = request.getRequestDispatcher("PatientInformations.jsp");
                rd.forward(request, response);

            } else {
                session.setAttribute("urFileRequest", "Send Unsuccessfull!!!");
                rd = request.getRequestDispatcher("PatientInformations.jsp");
                rd.forward(request, response);
            }

        } else if (utype.equalsIgnoreCase("Physician")) {
            if (i != 0) {
                session.setAttribute("phFileRequest", "Send successfull!!!");
                rd = request.getRequestDispatcher("PatientInformation.jsp");
                rd.forward(request, response);

            } else {
                session.setAttribute("phFileRequest", "Send Unsuccessfull!!!");
                rd = request.getRequestDispatcher("PatientInformation.jsp");
                rd.forward(request, response);
            }
        } else {
            session.setAttribute("fileRequest", "Registration Unsuccessfull!!!");
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
            Logger.getLogger(PhFileRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PhFileRequest.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PhFileRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PhFileRequest.class.getName()).log(Level.SEVERE, null, ex);
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
