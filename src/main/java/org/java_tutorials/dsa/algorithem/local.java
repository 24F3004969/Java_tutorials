package org.java_tutorials.dsa.algorithem;

import java.util.ArrayList;

public class local {
   public static void main(String[] args) {
      String[][]a={{"*","*","*"},{"*","*","*"},{"*","*","*"}};
      String[][]b={{"*","*","*"},{"*","*","*"},{"*","*","*"}};
      ArrayList<String [][]> x=new ArrayList<>();
      x.add(a);x.add(b);
      int r=0,l=0;
      String [][]ab=new String[3][6];
      for (int i = 0; i < 3; i++)
      {
         for (int j = 0; j < 6; j++) {
               String [][]k=x.get(r);
               ab[i][j]=k[i][l];
               if ((j+1)%3==0){
                  l=0;
                  r++;
               }
               else l++;
         }
         r=0;
      }
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 6; j++) {
            System.out.print(ab[i][j]+" ");
         }
         System.out.println();
      }
   }
}
