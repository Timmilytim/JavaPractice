package com.Database;

import com.Excercises.TodoList;

import java.io.PrintStream;
import java.sql.*;
import java.util.Scanner;

public class todolistdbMain {
    private static final PrintStream p = System.out;
    private static final Scanner sc = new Scanner(System.in);

    private static final todolistdbMain todolistmain = new todolistdbMain();

    private static final todolistdb todolistdb = new todolistdb("jdbc:mysql: //localhost:3306/Javatest","root","" );

    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            todolistmain.options();
            p.print("\n Enter a choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addList();
                case 2 -> removeList();
                case 3 -> printList();
                case 4 -> modifyList();
                case 5 -> exit = true;
            }
        }
    }

    //        METHODS HERE
    public void options(){
        p.println("Input your Choice...");
        p.println("\t1. To Add" );
        p.println("\t2. To Remove");
        p.println("\t3. To Print");
        p.println("\t4. To Modify");
        p.println("\t5. To Exit");
    }

    public static void addList(){
        try (Connection conn = DriverManager.getConnection(todolistdb.url, todolistdb.username, todolistdb.password)) {
            {
                Statement state = conn.createStatement();
                try{
                    PreparedStatement stat = conn.prepareStatement("INSERT INTO jdbcTest (id, name,phone, email) VALUES (?,?,?,?)");

                System.out.println("Enter ID: ");
                stat.setInt(1,sc.nextInt());

                System.out.println("Add Name: ");
                stat.setString(2,sc.next() );

                System.out.println("Add Phone Number: ");
                stat.setString(3,sc.next() );

                System.out.println("Add Email: ");
                stat.setString(4,sc.next());

                stat.execute();

                p.println("Added Successfully..\n");
                state.close();
                }catch (SQLIntegrityConstraintViolationException e){
                    System.out.println(" ID Exists: " + e.getMessage());
                }

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void removeList(){
        try (Connection conn = DriverManager.getConnection(todolistdb.url, todolistdb.username, todolistdb.password)) {
            {
                Statement state = conn.createStatement();
                System.out.println("Enter ID: ");
                int id = sc.nextInt();
                PreparedStatement stat = conn.prepareStatement("DELETE FROM jdbcTest WHERE id = " + id);
                stat.execute();

                p.println("Removed Successfully..\n\n");
                state.close();
                System.out.println("Done..");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printList(){
        try (Connection conn = DriverManager.getConnection(todolistdb.url, todolistdb.username, todolistdb.password)) {
            {
                Statement state = conn.createStatement();
                String getResult = "SELECT * FROM jdbcTest";
                state.execute(getResult);
                ResultSet resultSet = state.getResultSet();
                while (resultSet.next()){
                    String id = resultSet.getString("id");
                    String name = resultSet.getString("name");
                    String phone = resultSet.getString("phone");
                    String email = resultSet.getString("email");
                    System.out.println( id + ", " + name + ", "+ phone + ", " + email);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void modifyList(){
        try (Connection conn = DriverManager.getConnection(todolistdb.url, todolistdb.username, todolistdb.password)) {
            {
                System.out.println("What column do you want to update ");
                todolistmain.columns();

                 int column = sc.nextInt();

                 String update = null;
                if (column == 1){
                    update = "name";
                }
                else if (column == 2) {
                    update = "phone";
                }else if (column == 3) {
                    update = "email";
                }else {
                    System.out.println("Invalid Column Name....");
                }

                Statement state = conn.createStatement();
                System.out.println("Enter id");
                int id = sc.nextInt();
                PreparedStatement stat = conn.prepareStatement("UPDATE jdbcTest SET "+ update + " = ? WHERE id = " + id);
                System.out.println("SET: ");
                stat.setString(1,sc.next() );

                stat.executeUpdate();
                p.println("Modified Successfully..\n\n");
                state.close();


                System.out.println("Done..");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        p.println("Modification Successful..\n\n");
    }

    public void columns(){
        p.println("\t1. for Name" );
        p.println("\t2. for Phone Number");
        p.println("\t3. for Email");
    }

}

