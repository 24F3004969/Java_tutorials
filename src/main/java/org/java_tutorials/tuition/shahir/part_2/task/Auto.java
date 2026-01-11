package org.java_tutorials.tuition.shahir.part_2.task;

public class Auto {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.display("my mom wants to talk to her mom");
        a.display(1,2000);
    }

    void display(int m, int n) {
        for (int i = m; i <= n; i++) {
            int z = i;
            int sq = z * z;
            int c = 0;
            while (z > 0) {
                c++;
                z = z / 10;
            }
            int k = (int) Math.pow(10, c);
            if (sq % k == i)
                System.out.println(i);
        }
    }

    void display(String str) {
        String s = "";
        String s1 = "";
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                s = s + c;
                s1 = c + s1;
            } else {
                if (s.equals(s1))
                    System.out.println(s);
                s = "";
                s1 = "";
            }
        }
    }
}
