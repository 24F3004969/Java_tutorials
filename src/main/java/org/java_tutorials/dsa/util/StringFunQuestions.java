package org.java_tutorials.dsa.util;


import java.util.*;

import static org.java_tutorials.dsa.util.Util.println;

class StringFunQuestions {
    public static void main(String[] args) {
      var st=new StringFunQuestions();
      println("Number of words in your sentence are:");
      println(st.countWords("I love to code but not    3246587    .....  EVERYTIME"));
      println(st.charFrequency("Pineapple"));
    }
    long countWords(String str){
        return Arrays.
        stream(str.split("[\\s,.\\d\n]")).
        filter(StringFunQuestions::isNotEmpty).count();
    }
    static boolean isNotEmpty(String str){
        return !str.isEmpty();
    }
    String charFrequency(String str) {
        var a = str.toCharArray();
        Arrays.sort(a);
        int count = 0;
        char val = a[0];
        var va = new StringBuilder();
        for (char c : a) {
            if (val != c) {
                va.append(val).
                        append("=")
                        .append(count)
                        .append(" ,");
                val = c;
                count = 0;
            }
            count++;
        }
        va.append(a[a.length - 1]).
                append("=").append("1");
        return "{"+ va +"}";
    }
}
