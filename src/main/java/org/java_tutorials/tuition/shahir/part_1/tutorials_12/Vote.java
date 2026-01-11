package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vote
{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your age");
        int age;
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(reader);
        age=Integer.parseInt(in.readLine());
        if (age>=60)
            System.out.println("You are senior citizen");
        else
            System.out.println("You are not senior citizen");

    }
}
