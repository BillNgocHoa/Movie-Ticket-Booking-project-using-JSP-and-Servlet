/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.techtutorial.ctb.admin.dao;

// Data Access Object = DAO (dao)
import cn.techtutorial.ctb.admin.model.Admin;
import cn.techtutorial.ctb.admin.services.AdminService;
import java.sql.*;

// Data Access Object class
public class AdminDao implements AdminService {

    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public AdminDao(Connection con) {
        this.con = con;
    }

    // Create a method to write our sql Query and Retrieve data from DB
    @Override
    public Admin logAdmin(String email, String password) {

        Admin admin = null;
        try {
            //create a sql query    
            query = "select * from admin where email=? and password=?";   // Must be select ALL
            // prepare the statement
            pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            // execute the statement
            rs = pst.executeQuery();

            //use ResultSet to get data, store data
            if (rs.next()) {
                // after getting data, we set test data to Admin Model class
                admin = new Admin();
                admin.setId(rs.getInt("aid"));
                admin.setName(rs.getString("name"));
                admin.setEmail(rs.getString("email"));
                admin.setDob(rs.getString("dob"));
                admin.setRole(rs.getString("role"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return admin;
    }
}
