package com.Database.Account;

import com.Database.todolistdb;

import java.io.PrintStream;
import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final PrintStream p = System.out;
    private static final Scanner sc = new Scanner(System.in);
    public static final AuthUser authUser = new AuthUser("jdbc:mysql: //localhost:3306/account","root","" );
    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            options();
            p.print("\n Enter a choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> signUp();
                case 2 -> logIn();
                case 3-> exit = true;
            }
        }


    }
//    option methods
    public static void options(){
        p.println("Input your Choice...");
        p.println("\t1. SIGN UP" );
        p.println("\t2. LOG IN");
        p.println("\t3. To Exit");
    }

//    LogIN method
    public static void signUp(){
        try (Connection conn = DriverManager.getConnection(authUser.url, authUser.username, authUser.password)) {
            {
                Statement state = conn.createStatement();
                try{
                    PreparedStatement stat = conn.prepareStatement("INSERT INTO user (id, name, email ,password) VALUES (?,?,?,?)");

                    System.out.println("Enter ID: ");
                    stat.setInt(1,sc.nextInt());

                    System.out.println("Enter Your Name: ");
                    stat.setString(2,sc.next() );

                    System.out.println("Enter Your Email: ");
                    stat.setString(3,sc.next() );

                    System.out.println("Enter Your Password: ");
                    stat.setString(4,sc.next());

                    stat.execute();

                    p.println("Account Created Successfully..\n\n");
                    state.close();
                }catch (SQLIntegrityConstraintViolationException e){
                    System.out.println(" ID Exists: " + e.getMessage());
                }

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logIn(){
        try (Connection conn = DriverManager.getConnection(authUser.url, authUser.username, authUser.password)) {
            {
                p.println("Enter your Email");
                String chkEmail = sc.next();

                p.println("Enter your Password");
                String chkPass = sc.next();

                Statement state = conn.createStatement();
                String getResult = "SELECT * FROM user";
                state.execute(getResult);
                ResultSet resultSet = state.getResultSet();
                while (resultSet.next()){;
                    String email = resultSet.getString("email");
                    String password = resultSet.getString("password");
                    if(email.equals(chkEmail) && password.equals(chkPass)  ){
                        System.out.println("...Welcome to the Dashboard...\n\n");
                    }else {
                        System.out.println("Account Does Not Exit...\n\n");
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
