package com.Excercises;

import java.io.PrintStream;
import java.util.Scanner;

public class TodoMain {
    private static final PrintStream p = System.out;
    private static final Scanner sc = new Scanner(System.in);

    private static final TodoMain todoMain = new TodoMain();

    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit){
            todoMain.options();
            p.print("\n Enter a choice: ");
            int choice = sc.nextInt();

            switch (choice){
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
            System.out.println("Add to the list: ");
            String add = sc.nextLine();
            todoList.adding(add);
            p.println("Added Successfully..\n\n");
        }

        public static void removeList(){
            System.out.println("Input the number of the list: ");
            int remove = sc.nextInt();
            todoList.removing(remove);
            p.println("Removed Successfully..\n\n");
        }
        public static void printList(){
            todoList.printing();
        }

        public static void modifyList(){
            System.out.println("Input the number of the list: ");
            int modNum = sc.nextInt();

            System.out.println("Modify the list: ");
            String modString = sc.next();

            todoList.modifying(modNum, modString);
            p.println("Modification Successful..\n\n");
        }

    }

