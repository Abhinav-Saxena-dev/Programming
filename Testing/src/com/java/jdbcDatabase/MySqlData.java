package com.java.jdbcDatabase;

import java.sql.*;

public class MySqlData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myData",
                    "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from StudentDetails"); // sql coding syntax is used inside this string.
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2) + " " + rs.getInt(3)); // 1,2,3 refer to columns.
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
