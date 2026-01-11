package org.java_tutorials.dsa.helal_anwar.Number;

public class Digits {
    public static String [][] zero(int size,String s)
    {
        String[][] a =new String[size][size*2];
        int k=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==size*2-1||i==0||i==size-1||j==k)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k=k+2;
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[0][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        return a;
    }
    public static String [][] one(int size,String s){
        String[][] a =new String[size][size*2];
        int k=size;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if ((i<size/2 && j==k)||j==size||i==size-1)
                a[i][j]= String.valueOf(s);
                else  a[i][j]=" ";
            }
            k--;
        }
        return a;
    }
    public static String [][] two(int size,String s){
        String[][] a =new String[size][size*2];
        int k=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if (i==0||j==k||i==size-1||(i<2&&j==0))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k=k-2;
        }
        a[0][2*size-1]=" ";
        a[0][2*size-2]=" ";
        a[0][2*size-3]=" ";
        a[size-1][0]=" ";
        a[0][0]=" ";
        return a;
    }
    public static String [][] three(int size,String s)
    {
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==size*2-1||i==0||i==(size-1)/2||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        a[(size-1)/2][2*size-1]=" ";
        return a;
    }
    public static String [][] four(int size,String s)
    {
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j==0 && i<=(size-1)/2)||j==size*2-1||i==(size-1)/2)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        return a;
    }
    public static String [][] five(int size,String s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j==0 && i<=(size-1)/2)||i==0||i==(size-1)/2||i==size-1||(i>=(size-1)/2 && j== 2*size-1))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[(size-1)/2][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        return a;
    }
    public static String [][] six(int size,String s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j==0 )||i==0||i==(size-1)/2||i==size-1||(i>=(size-1)/2 && j== 2*size-1))
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[(size-1)/2][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        return a;
    }
    public static String [][] seven(int size,String s){
        String[][] a =new String[size][size*2];
        int k=2*size-1;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size*2; j++)
            {
                if(i==0||j==k)
                a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
            k--;

        }
        return a;
    }
    public static String [][] eight(int size,String s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (j==0||j==size*2-1||i==0||i==(size-1)/2||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[0][2*size-1]=" ";
        a[size-1][2*size-1]=" ";
        a[(size-1)/2][2*size-1]=" ";
        a[(size-1)/2][0]=" ";
        return a;
    }
    public static String [][] nine(int size,String s){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j==0 && i<=(size-1)/2)||j==size*2-1||i==0||i==(size-1)/2||i==size-1)
                    a[i][j]= String.valueOf(s);
                else a[i][j]=" ";
            }
        }
        a[0][0]=" ";
        a[size-1][0]=" ";
        a[size-1][2*size-1]=" ";
        a[(size-1)/2][0]=" ";
        return a;
    }
    public static String[][] colon(int size){
        String[][] a =new String[size][size*2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
               a[i][j]=" ";
            }
        }
        a[1][size]=":";
        a[1][size-1]=":";
        a[size-2][size]=":";
        a[size-2][size-1]=":";
        return a;
    }
}
