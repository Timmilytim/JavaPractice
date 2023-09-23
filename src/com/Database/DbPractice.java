package com.Database;

import java.sql.*;

public class DbPractice {
    public static void main(String[] args) {
        String url = "jdbc:mysql: //localhost:3306/Javatest";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            {
                Statement state = conn.createStatement();

////                TO CREATE A DATABASE
//                String sql = " CREATE DATABASE IF NOT EXISTS Javatest";
//                state.execute(sql);

//                TO CREATE A TABLE
//                String sql2 = "CREATE TABLE IF NOT EXISTS jdbcTest( id INTEGER, name TEXT, phone TEXT, email TEXT)";
//                state.execute(sql2);

//                 TO INSERT VALUES INTO THE TABLE
//                String sql3 = "INSERT INTO contacts VALUES('coman','07075783241','comaan@gmail.com')," +
//                        "('Victoria','07089057680','victe@gmail.com')" ;
//                state.execute(sql3);
//                System.out.println("Inserted Successfully...");
//
////                TO SHOW THE DATA IN THE TABLE
//                String getResult = "SELECT * FROM contacts";
//                state.execute(getResult);
//                ResultSet resultSet = state.getResultSet();
//                while (resultSet.next()){
//                    String name = resultSet.getString("name");
//                    String phone = resultSet.getString("phone");
//                    String email = resultSet.getString("email");
//                    System.out.println(name + " "+ phone + " " + email);
//                }
//
////                TO UPDATE THE VALUES IN THE TABLE
//                String update = "UPDATE contacts SET name = 'Timmily' WHERE name = 'coman'";
//                state.execute(update);
//                System.out.println("Updated Successfully");
//
////                 TO DELETE FROM DATABASE
//                String delete = "DELETE FROM contacts where name = 'saman'";
//                state.execute(delete);
//                System.out.println("Deleted Successfully...");

                state.close();
                System.out.println("Done..");
            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}