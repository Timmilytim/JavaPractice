package com.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstSever {
    public static void main(String[] args)throws IOException {

        try(ServerSocket severSocket = new ServerSocket(5000)){

            while (true){
            Socket socket = severSocket.accept();
            System.out.println("Client Connected..");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                String echoString = input.readLine();
                if (echoString.equals("exit")){
                    break;
                }
                output.println("Echo from server: " + echoString);
            }
        }
    }
}
