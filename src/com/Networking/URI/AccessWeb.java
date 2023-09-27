package com.Networking.URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class AccessWeb {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://en.wikipedia.org/wiki/wikipedia");
            BufferedReader inputStream = new BufferedReader(
                    new  InputStreamReader(url.openStream())
            );

            String line = "";
            while (line != null){
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();
        }catch (IOException e){

        }
    }
}
