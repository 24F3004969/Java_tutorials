package org.java_tutorials.function;

public class Student {
    String name;
    int age;
    String gender;
    String grade;

    public Student(String n, int a, String g, String gr) {
        name = n;
        age = a;
        gender = g;
        grade = gr;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Nigar", 15, "F", "X");
        Student s2 = new Student("Faiz", 15, "M", "X");
        Student s3 = new Student("Hanifa", 15, "F", "X");
        Student s4 = new Student("Laraib", 15, "F", "X");
        Student s5 = new Student("Mary", 15, "F", "X");
        Student s6 = new Student("Aamish", 15, "M", "X");
        Student s7 = new Student("Sadiya", 15, "F", "X");
        Student s8 = new Student("Faisal", 15, "M", "X");
        Student []students={s1,s2,s3,s4,s5,s6,s7,s8};
        for(int i=0;i<students.length;i++) {
            Student s=students[i];
            if (s.gender.equals("F"))
                System.out.println(s.name);
        }
    }
}
