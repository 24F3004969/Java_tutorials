package org.java_tutorials.tuition.shahir.part_1.tutorials_7;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InternetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostName()+"        "+ Arrays.
                toString(inetAddress.getAddress()) +
                space(10)+inetAddress.getCanonicalHostName());
        System.out.println(inetAddress.isMCGlobal());
    }
    public static String space(int n){
        return " ".repeat(n);
    }
}

