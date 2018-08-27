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
public class Login extends HttpServlet {

    String userName = "", pEmail = "", mobile = "", state = "", country = "", utypes = "", user_id = "";

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
        String email = request.getParameter("email");// 
        String password = request.getParameter("password");

        DBQuery dbq = new DBQuery();
        String utype = dbq.loginInfo(email, password);

        if (utype.equalsIgnoreCase("Admin")) {
            session.setAttribute("aid", email);
            session.setAttribute("login", "Wecome:: " + email);
            rd = request.getRequestDispatcher("AdminHome.jsp");
            rd.forward(request, response);

        } else if (utype.equalsIgnoreCase("Cloud")) {
            session.setAttribute("cid", email);
            session.setAttribute("login", "Wecome:: " + email);
            rd = request.getRequestDispatcher("CloudHome.jsp");
            rd.forward(request, response);

        } else if (utype.equalsIgnoreCase("Physician")) {
            ResultSet rs = dbq.userData(email, password);
            Thread.sleep(1000);
            System.out.println("p  h  y  s  i  c  i  a  n");
            while (rs.next()) {
                userName = rs.getString("userName");
                System.out.println("userName = " + userName);
                pEmail = rs.getString("pEmail");
                System.out.println("pEmail = " + pEmail);
                mobile = rs.getString("mobile");
                System.out.println("mobile = " + mobile);
                state = rs.getString("state");
                System.out.println("state = " + state);
                country = rs.getString("country");
                System.out.println("country = " + country);
                utypes = rs.getString("utype");
                System.out.println("utypes = " + utypes);
                user_id = rs.getString("user_id");
            }
            Thread.sleep(1000);
            session.setAttribute("userName", userName);
            session.setAttribute("pEmail", pEmail);
            session.setAttribute("mobile", mobile);
            session.setAttribute("state", state);
            session.setAttribute("country", country);
            session.setAttribute("utypes", utypes);
            session.setAttribute("user_id", user_id);


            session.setAttribute("login", "Wecome:: " + email);
            session.setAttribute("pids", email);

            rd = request.getRequestDispatcher("PhysicianHome.jsp");
            rd.forward(request, response);

        } else if (utype.equalsIgnoreCase("User")) {
            ResultSet rs = dbq.userData(email, password);
            while (rs.next()) {
                userName = rs.getString("userName");
                System.out.println("userName = " + userName);
                pEmail = rs.getString("pEmail");
                System.out.println("pEmail = " + pEmail);
                mobile = rs.getString("mobile");
                System.out.println("mobile = " + mobile);
                state = rs.getString("state");
                System.out.println("state = " + state);
                country = rs.getString("country");
                System.out.println("country = " + country);
                utypes = rs.getString("utype");
                System.out.println("utypes = " + utypes);
                user_id = rs.getString("user_id");
                System.out.println("utypes = " + user_id);
            }

            session.setAttribute("userName", userName);
            session.setAttribute("pEmail", pEmail);
            session.setAttribute("mobile", mobile);
            session.setAttribute("state", state);
            session.setAttribute("country", country);
            session.setAttribute("utypes", utypes);
            session.setAttribute("user_id", user_id);


            session.setAttribute("uid", email);
            session.setAttribute("login", "Wecome:: " + email);
            rd = request.getRequestDispatcher("UserHome.jsp");
            rd.forward(request, response);

        } else if (utype.equalsIgnoreCase("HospitalA")) {
            session.setAttribute("hida", email);
            session.setAttribute("login", "Wecome:: " + email);
            rd = request.getRequestDispatcher("HospitalAHome.jsp");
            rd.forward(request, response);

        } else if (utype.equalsIgnoreCase("HospitalB")) {
            session.setAttribute("hidb", email);
            session.setAttribute("login", "Wecome:: " + email);
            rd = request.getRequestDispatcher("HospitalBHome.jsp");
            rd.forward(request, response);

        } else {

            session.setAttribute("logins", "Sorry: Your Login Failed!!!");
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
            try {
                processRequest(request, response);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
