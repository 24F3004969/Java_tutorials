package org.java_tutorials.tuition.shahir.part_1.tutorials_4;
//pg 209 q17
public class Loop_b {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
