package org.java_tutorials.part_1.util;

import java.io.*;

class BufferLearn {
    public static void main(String[] args) throws IOException {
        InputStreamReader ra = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ra);
        System.out.println((char) (-1));
        int x = 1;
        while (x > 0) {
            x = br.read();
            System.out.print((char) x + ""+x+"   ");
        }
    }
}
