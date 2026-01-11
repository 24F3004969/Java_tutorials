package org.java_tutorials.tuition.shahir.part_1.tutorials_7;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlDemo {
    public static void main(String [] args) throws IOException {
        URL url=new URL("https://open.er-api.com/v6/latest/USD");
        System.out.println("Host name "+url.getHost());
        System.out.println("Authority "+url.getAuthority());
        System.out.println("Files "+url.getFile());
        System.out.println("Port "+url.getPort());
        System.out.println("Protocol "+url.getProtocol());
        System.out.println("Query "+url.getQuery());
        URLConnection urlConnection=url.openConnection();
        System.out.println(urlConnection.getHeaderFields());
        try(InputStream inputStream=urlConnection.getInputStream()) {
           byte[] x =inputStream.readAllBytes();
            for (byte b : x) {
                System.out.print((char) b);
            }
        }
    }
}
