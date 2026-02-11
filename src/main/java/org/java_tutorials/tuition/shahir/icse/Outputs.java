package org.java_tutorials.tuition.shahir.icse;

public class Outputs {
    static void main() {


        String[][] s = {
                {"ab", "A"},
                {"", "abA"}
        };
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j].toLowerCase().contains("a")) count += s[i][j].length();
            }
        }
        System.out.println(count);


    }
}
