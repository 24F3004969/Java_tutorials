package org.java_tutorials.tuition.shahir.part_1.oop;

public class Polygons {
    public static void main(String[] args) {
        Shapes shapes = new Shapes() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getDiagonal() {
                return 0;
            }

            @Override
            public boolean isConcave() {
                return false;
            }
        };
        Shapes s1=new Rectangle();
        System.out.println(shapes);
    }
}
