package org.java_tutorials.tuition.shahir.part_1.classX;

public class CountFrequency {
    public static void main(String[] args) {
        String s = "Javaaaaa";
        for (int i = 0; i < s.length();) {
            int count = 0;
            char c = s.charAt(0);
            for (int j = 0; j < s.length(); j++) {
                char k = s.charAt(j);
                if (k == c)
                    count++;
            }
            System.out.println("The character " + c + "is present " + count + " times");
            s = s.replace("" + c, "");
        }
    }
}
