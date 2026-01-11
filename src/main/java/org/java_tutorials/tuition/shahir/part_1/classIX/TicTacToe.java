package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name;
    String[] courses;

    //***** Define constructor(s) here
    public Student(String name, String[] courses) {
        this.name = name;
        this.courses = courses;
    }

    public Student(Student s) {
        this(s.name, Arrays.copyOf(s.courses, s.courses.length));
    }

    public void setName(String n) {
        name = n;
    }

    public void setCourses(int indx, String c) {
        courses[indx] = c;
    }

    public String getName() {
        return name;
    }

    public String getCourses(int indx) {
        System.out.println(Arrays.toString(courses));
        return courses[indx];
    }
}

class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"Maths", "DL", "DSA", "DC"};
        Student s1 = new Student("Nandu", courses);
        Student s2 = new Student(s1);
        s2.setName(sc.next());
        s2.setCourses(1, sc.next());
        System.out.println(s1.getName() + ": " + s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}