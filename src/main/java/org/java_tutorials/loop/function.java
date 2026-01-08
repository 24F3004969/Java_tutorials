package org.java_tutorials.loop;

public class function {
    public static void main(String[] args) {
        IO.println("Inside main function");
        doSomething();
        Student s1 = new Student("Ankit", 10);
        Student s2 = new Student("Ankit", 10);
        System.out.println(s1.equals(s2));
    }

    public static void doSomething() {
        System.out.println("We are doing something very important");
    }
}
