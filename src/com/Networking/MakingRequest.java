package com.Networking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class MakingRequest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://webhook.site/8adad395-5c05-452e-8f3a-fc357d43736d");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            String htmlContent = "I love chicken";

            try(BufferedWriter outputStream = new BufferedWriter(
                    new OutputStreamWriter(urlConnection.getOutputStream(), StandardCharsets.UTF_8))){
                outputStream.write(htmlContent);
            }

            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream())
            );

            String line;
            while ((line = inputStream.readLine()) != null){
                System.out.println(line);
            }

            inputStream.close();
            urlConnection.disconnect();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
