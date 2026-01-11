package org.java_tutorials.tuition.shahir.function;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindromeWord("ABBA"));
    }

    public static boolean isPalindromeWord(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
