package com.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread{
    private Socket socket;

    public Echoer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoes = input.readLine();
                System.out.println("Client input was: " + echoes);
                if (echoes.equals("exit")) {
                    break;
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                output.println("Echo from server: "+ echoes);
            }

        }catch (IOException e){
            System.out.println("Oops: " + e.getMessage());
        }finally {
            try{
                socket.close();
            }catch (IOException e){
        }
    }
}
}
