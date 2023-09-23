package com.Classwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class ClassWork {

    public static Scanner s = new Scanner(System.in);
    public static PrintStream printStream = System.out;
    public static String file = "Classwork.txt";

    public static void main(String[] args) {

      boolean quit = false;

      int choice = 0;
      printInstructions();
      while (!quit){
          printStream.println("Enter your choice");
          choice = s.nextInt();
          s.nextLine();

          switch (choice){case 0 -> printInstructions();
              case 1 -> writeToFile(false);
              case 2 -> writeToFile(true);
              case 3 -> readFile();
              case 4 -> quit = true;
          }
      }
    }


    private static void printInstructions(){
        printStream.println("\nPress");
        printStream.println("\t 0 - To print choice options.");
        printStream.println("\t 1 - To write a new text in your file.");
        printStream.println("\t 2 - To append texts in your file.");
        printStream.println("\t 3 - To read what is in your file.");
        printStream.println("\t 4 - To exit the application.");
    }

    private static void writeToFile(boolean override){
        printStream.println("What do you want to write");
        String text = s.nextLine();
        byte[] buf = text.getBytes();
        try(FileOutputStream fout = new FileOutputStream(file, override)){
            fout.write(buf);
            printStream.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readFile(){
        try{
            FileInputStream fin = new FileInputStream(file);
            int i = 0;
            while ((i=fin.read()) != -1){
                printStream.print((char)i);
            }
            printStream.println();
            fin.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
