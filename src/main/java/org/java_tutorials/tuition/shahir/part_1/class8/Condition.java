package org.java_tutorials.tuition.shahir.part_1.class8;

class Faizan {
    public static void main(String[] args) {
        String s="India is my country";
        s=s+" ";
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c!=' '){
                s1=c+s1;
            }
            else {
                System.out.print(s1.trim()+" ");
                s1="";
            }
        }
    }
}
