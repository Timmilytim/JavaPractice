package com.Networking;

import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            while (true){
                new Echoer(serverSocket.accept()).start();
            }
        }
    }
}
