package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

public class Merge_sort
{
    public static void main(String[] args) {
      int [][]arr=randomArray(100);
      long start=System.currentTimeMillis();
      int x= ((arr.length%2==0)?arr.length/2:(arr.length+1)/2);
      for(int k=1;k<x;k++)
      {
          int[][] tem_arr =new int[((arr.length%2==0)?arr.length/2:(arr.length+1)/2)][];
          int cu=0;
          for (int i = 0; i < arr.length-1; i=i+2) {
               tem_arr[cu]=merge_sort(arr[i],arr[i+1]);
               cu++;
          }
          if(arr.length %2!=0)
              tem_arr[cu]=arr[arr.length-1];
          arr=tem_arr;
      }
      System.out.println(System.currentTimeMillis()-start);
      //System.out.println(Arrays.toString(arr[0]));
    }
    private static int[][] randomArray(int n) {
        int [][]a=new int[n][];
        for (int j = 0; j <n; j++) {
            a[j]=new int[]{(int)(Math.random()*n+35)};
        }
        System.out.println("Array is filled");
        return a;
    }

    private static int[] merge_sort(int[] arr1, int[] arr2) {
        int []c=new int [arr1.length+ arr2.length];
        int arr1_itr =0, arr2_itr =0;
        for (int i = 0; i < c.length; i++) {
            if (arr1_itr >= arr1.length|| arr2_itr >= arr2.length)
            {
                if (arr1_itr >= arr1.length){
                    c[i]= arr2[arr2_itr];
                    arr2_itr++;
                }
               else {
                   c[i]= arr1[arr1_itr];
                   arr1_itr++;
                }
            }
            else {
                if (arr1[arr1_itr]<= arr2[arr2_itr]){
                    c[i]= arr1[arr1_itr];
                    arr1_itr++;
                }
                else {
                    c[i]= arr2[arr2_itr];
                    arr2_itr++;
                }
            }
        }
        return c;
    }

}
