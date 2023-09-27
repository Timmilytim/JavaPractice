package com.Networking.URI;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try{
            URI uri = new URI("https//username:oluwapelumi@gmail.com:5000");

            URI path = new URI("/catalogue/phone?os=ios#iphone");

            URI path2 = new URI("/catalogue/Laptops?os=windows#Windows");

            URI absolute = uri.resolve(path);
            URI absolute2 = uri.resolve(path2);

            URL url = absolute.toURL();
            URL url2 = absolute2.toURL();
            System.out.println("url = " + url);
            System.out.println("url = " + url2);


//            URL url = uri.toURL();
//            System.out.println(" URL "+ url);
//
//            System.out.println("Scheme = "+ uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority "+ uri.getAuthority());
//            System.out.println("User info "+ uri.getUserInfo());
//            System.out.println("Host "+ uri.getHost());
//            System.out.println("Port "+ uri.getPort());
//            System.out.println("Path " + uri.getPath());
//            System.out.println("Query "+ uri.getQuery());
//            System.out.println("Fragment " + uri.getFragment());

        }catch (Exception e){
            System.out.println("URI AND SYNTAX: "+ e.getMessage());
        }
    }
}
