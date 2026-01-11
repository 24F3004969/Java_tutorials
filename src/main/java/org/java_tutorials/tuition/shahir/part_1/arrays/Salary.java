package org.java_tutorials.tuition.shahir.part_1.arrays;

import java.util.*;

public class Salary {
    String name, address, pho_no, subject;
    double m_salary, i_tax;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter your address");
        address = sc.nextLine();

        System.out.println("Enter your pho_no");
        pho_no = sc.nextLine();
        System.out.println("Enter your subject");
        subject = sc.nextLine();
        System.out.println("Enter your salary");
        m_salary = sc.nextDouble();

    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("PhoNo: " + pho_no);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + m_salary);
    }

    void calculate() {
        if (m_salary * 12 > 275000) {
            i_tax = 6.5 / 100 * (m_salary * 12);
            System.out.println("income tax = " +i_tax);

        }
        else {
            System.out.println("no tax");
        }
    }

    public static void main(String[] args) {
        Salary salary = new Salary();
        salary.accept();
        salary.display();
        salary.calculate();
    }
}
