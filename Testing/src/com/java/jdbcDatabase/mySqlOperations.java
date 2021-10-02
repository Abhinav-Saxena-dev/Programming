package com.java.jdbcDatabase;

import java.sql.*;
import java.util.Scanner;

public class mySqlOperations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myData",
                "root", "root");
        PreparedStatement stmt;
        int i;
        System.out.printf("Press 1 to View Table %nPress 2 to insert a new record %nPress 3 to update an existing record %n");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                stmt = con.prepareStatement("select * from StudentDetails");
                ResultSet rs = stmt.executeQuery();
                while(rs.next())
                    System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +"  "+ rs.getInt(3));
                con.close();
                break;
            case 2:
                stmt = con.prepareStatement("insert into StudentDetails values(?,?,?)");
                System.out.println("Type in values for ID, NAME, and AGE");
                stmt.setInt(1,sc.nextInt());
                stmt.setString(2,sc.next());
                stmt.setInt(3,sc.nextInt());
                i = stmt.executeUpdate();
                System.out.println("Successfully updated, please run program again to view the result.");
                con.close();
                break;
            case 3:
                System.out.println("What do you wish to update? name or Age?");
                String s = sc.next();
                if(s.equals("name")){
                stmt = con.prepareStatement("update StudentDetails set name=? where id=?");
                System.out.println("Type the new name followed by desired id");
                stmt.setString(1, sc.next() );
                stmt.setInt(2, sc.nextInt() );
                i = stmt.executeUpdate();
                }
                System.out.println("Successfully updated, please run program again to view the result.");
                con.close();
                break;
            default:
                System.out.println("Wrong value");
                con.close();
                break;
        }
    }
}
