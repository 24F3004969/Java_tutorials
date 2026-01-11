package org.java_tutorials.tuition.shahir.function;

public class WordPatter {
    static void main() {
        String str = IO.readln("Enter a name: ");
        /*
        H
        H a n
        H a n i f
         */
       /* for (int i = 1; i <= str.length(); i++) {
            String sub = str.substring(0, i);
            for (int j = 0; j < sub.length(); j++) {
                IO.print(sub.charAt(j) + " ");
            }
            IO.println();
        }*/
        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(0, str.length() - i);
            for (int j = 1; j <= str.length() - sub.length(); j++) {
                IO.print("  ");
            }
            for (int j = 0; j < sub.length(); j++) {
                IO.print(sub.charAt(j) + " ");
            }
            IO.println();
        }
    }
}
/*
B L U E J
  B L U E
    B L U
      B U
        B

 */
