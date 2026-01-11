package org.java_tutorials.tuition.shahir.function;

public class Words {
    public static void main(String[] args) {
        String sentence = "abca bbvfb uktiutugt";
        sentence = sentence + " ";
        String word = "";
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c != ' ')
                word += c;
            else {
                if (word.charAt(0)==word.charAt(word.length()-1))
                    System.out.println(word);
                word = "";
            }
        }
        System.out.println("Number of words: " + counter);
    }
}
