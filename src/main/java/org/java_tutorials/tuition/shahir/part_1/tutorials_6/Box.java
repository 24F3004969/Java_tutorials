package org.java_tutorials.tuition.shahir.part_1.tutorials_6;

class Box extends EnterValue {
    void volume() {
        System.out.println("The volume is = " + (length * width * height));
    }

    void lateralSurfaceArea() {
        System.out.println("The lateral surface area = " + (length + width) * height);
    }

    void totalSurfaceArea() {
        System.out.println("The total surface area = " + 2 * (length * width + width * height + height * length));
    }
}
