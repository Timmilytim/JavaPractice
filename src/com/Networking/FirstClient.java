package com.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class FirstClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",5000)){
            BufferedReader echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;
            System.out.println("Enter name");
            String name = scanner.nextLine();
            do{
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();

                stringToEcho.println(name + " : " +echoString);
                if(!echoString.equals("exit")){
                    response = echoes.readLine();
                    System.out.println(response);
                }
            }while (!echoString.equals("exit"));
        }catch (SocketTimeoutException e){
            System.out.println("Timeout Please");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
