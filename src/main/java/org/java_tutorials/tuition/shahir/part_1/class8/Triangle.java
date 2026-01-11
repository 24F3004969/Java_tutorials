package org.java_tutorials.tuition.shahir.part_1.class8;

public class Triangle {
    double a,b,c;
    Triangle(double s1,double s2,double s3){
        a=s1;
        b=s2;
        c=s3;
    }
    double perimeter() {
        return a + b + c;
    }

    double area() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public static void main(String[] args) {
        Triangle t=new Triangle(5,6,7);
        Triangle t1=new Triangle(15,16,17);
        System.out.println(t.area());
    }
}
