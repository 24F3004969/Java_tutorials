package org.java_tutorials.tuition.shahir.part_1.tutorials_7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionDemo {
    public static void main(String[] args) throws IOException {
        HttpURLConnection httpURLConnection= (HttpURLConnection)
                new URL("https://open.er-api.com/v6/latest/USD").openConnection();
        System.out.println(httpURLConnection.getPermission());
        try (var inputStreams = httpURLConnection.getInputStream()) {
            int value;
            while ((value = inputStreams.read()) != -1)
                System.out.print((char) value);
        }
    }
}
