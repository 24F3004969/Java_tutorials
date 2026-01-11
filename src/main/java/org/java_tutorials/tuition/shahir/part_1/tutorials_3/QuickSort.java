package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int[][] x =randomArray1(50000);
        //System.out.println(Arrays.toString(x[0]));
        int len=0;
        while (x.length>len)
        {
            len=x.length;
            int[][] tem =null;
            for (int[] ints : x) {
                if (ints.length > 1)
                    tem = add_Array(tem, sort_and_split(ints));
                else tem = add_Array(tem, new int[][]{ints});
            }
            x=tem;
        }
        System.out.println("Sorted");
       /* for (int[] ints : x) {
            System.out.print(Arrays.toString(ints) + ",");
        }*/

    }
    private static int[][] randomArray1(int n) {
        int [][]a=new int[n][];
        for (int j = 0; j <n; j++) {
            a[j]=new int[]{(int)(Math.random()*n+35)};
        }
        System.out.println("Array is filled");
        return a;
    }
    private static int[][] randomArray(int n) {
        int []a=new int[n];
        for (int j = 0; j <n; j++) {
            a[j]=(int)(Math.random()*(n-j)+2);
        }
        System.out.println("Array is filled");
        return new int[][]{a};
    }
    private static int[][] add_Array(int[][] tem, int[][] nu) {
        int c[][];
        if (tem==null){
            tem=new int[nu.length][];
            c=new int[nu.length][];
            Arrays.setAll(c, i -> nu[i]);
        }
        else {
            c=new int[tem.length+nu.length][];
            int x=0;
            for (int[] ints : tem) {
                c[x] = ints;
                x++;
            }
            for (int[] ints : nu) {
                c[x] = ints;
                x++;
            }
        }
        return c;
    }

    public static int [][] sort_and_split(int []n){
        int pivot=n.length-1;
        //sorting
        for (int i = 0; i < pivot;) {
            if (n[pivot]<n[i]){
                int temp1=n[pivot];
                int temp2=n[pivot-1];
                n[pivot]=n[i];
                n[i]=temp2;
                n[pivot-1]=temp1;
                pivot--;
            }
            else i++;
        }
       //splitting
        if (n.length>2)
         return splitting(n,pivot,((n.length-1==pivot||pivot==0)?2:3));
        return new int[][]{n};
    }
    private static int [][] splitting(int []a,int pivot,int size){
        int[][] c =new int[size][];
       if (pivot==0){
           c[0]=new int[]{a[pivot]};
           c[1]=split(pivot+1,a.length,a);
       }
       else if(pivot==a.length-1){
           c[1]=new int[]{a[pivot]};
           c[0]=split(0,pivot,a);
       }
       if (pivot>0 && pivot<a.length-1){
           c[0]=split(0,pivot,a);
           c[1]=new int[]{a[pivot]};
           c[2]=split(pivot+1,a.length,a);
       }
        return c;
    }
    private static  int[] split(int start ,int end,int a[]){
        int []k=new int[end-start];
        int t=0;
        for (int i = start; i < start+k.length; i++) {
            k[t]=a[i];
            t++;
        }
        return k;
    }
}
