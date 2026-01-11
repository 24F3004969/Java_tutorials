package org.java_tutorials.tuition.shahir.part_1.tutorials_2;



public class Rotate {
    public static void main(String[] args) {
        int [][] a=new int[2][4];
        int k=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=k;
                k++;
            }
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        a=rotate_left_90(a);
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        a=rotate_90(a);
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    private static int [][] rotate_90(int[][] a){
        var b=new int[a[0].length][a.length];
        for (int i = a.length-1; i >=0; i--) {
            var k=a[i];
            for (int j = 0; j <k.length; j++) {
                b[j][a.length-1-i]=k[j];
            }
        }
        return b;
    }
    private static int [][] rotate_left_90(int[][] a){
        var b=new int[a[0].length][a.length];
        int t=0;
        for (int i = a.length-1; i >=0; i--) {
            var k=a[i];
            int p=0;
            for (int j = k.length-1; j >=0; j--) {
                b[p][a.length-1-t]=k[j];
                p++;
            }
            t++;
        }
        return b;
    }
}
