package org.java_tutorials.tuition.shahir.loop;

public class Student {
    int g;
    String n;

    public Student(String name, int grade) {
        n = name;
        g = grade;
    }

    public boolean equals(Student s) {
        return g == s.g && n == s.n;

    }
}
