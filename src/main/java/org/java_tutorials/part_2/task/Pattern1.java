package org.java_tutorials.part_2.task;

/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

1 1 1 1 1     5 4 3 2 1
2 2 2 2       5 4 3 2
3 3 3         5 4 3
2 2           5 4
1             5



 */
public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
