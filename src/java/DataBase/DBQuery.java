/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQuery {

    Connection con = null;
    ResultSet rs = null;
    Statement st = null;

    public int patientInfo(String pid, String pName, String Gender, String pAge, String date, String pEmail, String did, String docName, String Information, String Resion, String Medications, String immunization, String Problem, String FamilyHistory, String SocialHistory, String Allergies, String MedicalEquipment, String VitalSigns, String Results, String Procedures, String Encounter, String Planofcare, String hospital, String email) throws ClassNotFoundException, SQLException {
        int i = 0;
        String authKey = "Not Required";
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "insert into patient_info values('" + pid + "','" + pName + "','" + Gender + "','" + pAge + "', '" + date + "','" + pEmail + "','" + did + "','" + docName + "', '" + Information + "','" + Resion + "','" + Medications + "','" + immunization + "','" + Problem + "','" + FamilyHistory + "','" + SocialHistory + "','" + Allergies + "','" + MedicalEquipment + "','" + VitalSigns + "','" + Results + "','" + Procedures + "','" + Encounter + "','" + Planofcare + "','" + hospital + "','" + authKey + "','" + email + "')";
        i = st.executeUpdate(s);

        return i;
    }

    public int phFileRequest(String user_id, String userName, String emails, String mobile, String state, String country, String pid, String pName, String pEmail, String date, String utype, String pids) throws ClassNotFoundException, SQLException {
        int i = 0;
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "insert into file_request values('" + user_id + "','" + userName + "','" + emails + "','" + mobile + "','" + state + "','" + country + "','" + pid + "','" + pName + "','" + pEmail + "','" + date + "','" + utype + "','" + pids + "')";
        i = st.executeUpdate(s);

        return i;
    }

    public int fileRequest(String pid, String pName, String pEmail, String date) throws ClassNotFoundException, SQLException {
        int i = 0;
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "insert into cda_file_generation values('" + pid + "','" + pName + "','" + pEmail + "','" + date + "')";
        i = st.executeUpdate(s);

        return i;
    }

    public int keyRecover(String pid, String pName, String pEmail, String date, String utype, String key, String emails, String user_id) throws ClassNotFoundException, SQLException {
        int i = 0;
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "UPDATE patient_info SET authKey='" + key + "' where pid='" + pid + "'";
        System.out.println("s = " + s);
        i = st.executeUpdate(s);
        st = con.createStatement();
        String a = "DELETE FROM  file_request where pid='" + pid + "' and pName='" + pName + "' and date='" + date + "' and utype='" + utype + "' and emails='" + emails + "' and user_id='" + user_id + "'";
        System.out.println("s = " + a);
        i = st.executeUpdate(a);

        return i;
    }

    public int registration(String phyId, String userName, String password, String pEmail, String mobile, String state, String country, String utype) throws ClassNotFoundException, SQLException {
        int i = 0;
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "insert into registration_details values('" + phyId + "','" + userName + "','" + password + "','" + pEmail + "','" + mobile + "', '" + state + "','" + country + "', '" + utype + "')";

        st = con.createStatement();
        String l = "insert into login_details values('" + pEmail + "','" + password + "','" + utype + "')";

        st.executeUpdate(l);


        i = st.executeUpdate(s);

        return i;
    }

    public ResultSet patientDetails(String hospital) throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
       // String s = "select * from patient_info where hospital='" + hospital + "'";
        String s = "select * from patient_info";
        rs = st.executeQuery(s);
        return rs;
    }

    public ResultSet patientDetail(String hospital) throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from patient_info where hospital='" + hospital + "'";
        rs = st.executeQuery(s);
        return rs;
    }

    public ResultSet fileDetails() throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from hosp_file_request";
        rs = st.executeQuery(s);
        return rs;
    }

    public ResultSet physicianRequest(String utype) throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from file_request where utype='" + utype + "'";
        rs = st.executeQuery(s);
        return rs;
    }

    public ResultSet verificationKey(String verificationKey) throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from patient_info where authKey='" + verificationKey + "'";
        rs = st.executeQuery(s);
        return rs;
    }

    public String verificationKeys(String verificationKey) throws SQLException, ClassNotFoundException {
        String key = "";
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from patient_info where authKey='" + verificationKey + "'";
        rs = st.executeQuery(s);
        while (rs.next()) {
            key = rs.getString("authKey");

        }
        return key;
    }

    public ResultSet userDetails() throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from registration_details";
        rs = st.executeQuery(s);
        return rs;
    }

    public ResultSet reportView(String pid, String pName, String pEmail, String date) throws SQLException, ClassNotFoundException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "select * from patient_info where pid='" + pid + "' and pName='" + pName + "' and pEmail='" + pEmail + "' and date='" + date + "'";
        rs = st.executeQuery(s);
        return rs;// 
    }

    public int fileRequestHos(String pid, String pName, String pEmail, String date, String hospital) throws ClassNotFoundException, SQLException {
        int i = 0;
        con = DBConnection.getConnection();
        st = con.createStatement();
        String s = "insert into hosp_file_request values('" + pid + "','" + pName + "','" + pEmail + "','" + date + "','" + hospital + "')";
        i = st.executeUpdate(s);

        return i;
    }

    public String loginInfo(String email, String password) throws ClassNotFoundException, SQLException {
        String utype = "";
        con = DBConnection.getConnection();
        st = con.createStatement();
        String q = "select * from login_details where pEmail='" + email + "' and password='" + password + "'";
        System.out.println("q" + q);
        rs = st.executeQuery(q);

        if (rs.next()) {

            utype = rs.getString("utype");
        }

        return utype;
    }

    public ResultSet userData(String email, String password) throws ClassNotFoundException, SQLException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String q = "select * from registration_details where pEmail='" + email + "' and password='" + password + "'";
        System.out.println("q>>>>>>>>>>>>>>>>>  " + q);
        rs = st.executeQuery(q);
        return rs;
    }

    public ResultSet hospitalB(String pEmail, String hospitalB) throws ClassNotFoundException, SQLException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String q = "select * from patient_info where pEmail='" + pEmail + "' and hospital='" + hospitalB + "'";
        System.out.println("q>>>>>>>>>>>>>>>>>  " + q);
        rs = st.executeQuery(q);
        return rs;
    }
    

    public ResultSet hospitalA(String pEmail, String hospitalA) throws ClassNotFoundException, SQLException {
        con = DBConnection.getConnection();
        st = con.createStatement();
        String q = "select * from patient_info where pEmail='" + pEmail + "' and hospital='" + hospitalA + "'";
        System.out.println("q>>>>>>>>>>>>>>>>>  " + q);
        rs = st.executeQuery(q);
        return rs;
    }

    public ResultSet checkStudentData() throws ClassNotFoundException, SQLException {

        con = DBConnection.getConnection();
        st = con.createStatement();
        String q = "select * from reg";

        rs = st.executeQuery(q);
        return rs;


    }
}
