package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

import java.io.*;
import java.util.ArrayList;

public class swap {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ABC.ABC-PC\\IdeaProjects\\Zoya\\src\\h.txt"));
        ArrayList<String> Information=new ArrayList<>();
        String value;
        while (true)
        {
            value=bufferedReader.readLine();
            if (value==null)
                break;
            else
                Information.add(value);
        }
        System.out.println(Information);
        System.out.println(Information.size());
    }
}
