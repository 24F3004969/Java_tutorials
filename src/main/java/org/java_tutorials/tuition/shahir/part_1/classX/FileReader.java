package org.java_tutorials.tuition.shahir.part_1.classX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new FileInputStream("C:/Users/hilal/pattern32.java"));
        while (in.hasNext())
            System.out.println(in.nextLine());
    }
}
