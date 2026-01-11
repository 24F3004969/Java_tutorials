package org.java_tutorials.tuition.shahir.part_1.tutorials_6;
/*
This  program allows you to play a game of name with computer so think a name
*/


import java.util.Scanner;

class NameZone {
    static char[][] letters_matrix =
            {{'A', 'B', 'C', 'D', 'E'},
                    {'F', 'G', 'H', 'I', 'J'},
                    {'K', 'L', 'M', 'N', 'O',},
                    {'P', 'Q', 'R', 'S', 'T'},
                    {'U', 'V', 'W', 'X', 'Y'},
                    {'Z', ' ', ' ', ' ', ' '}};

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int no_letters, choice = 1;
            System.out.println(space(28) + "Welcome to name to NameZone \n");
            while (choice == 1) {
                System.out.println("Think a name and ,enter the number words in your name");
                no_letters = in.nextInt();
                int[] a, b;
                if (no_letters > 0) {
                    a = reply(in, no_letters, 4, " Column");
                    b = reply(in, no_letters, 5, " Row");
                    if (a.length > 0 && b.length > 0) {
                        System.out.println("The name that you thought was \n");
                        for (int i = 0; i < no_letters; i++) {
                            System.out.print(letters_matrix[b[i]][a[i]]);
                        }
                    } else System.out.println("Don't try to fool me");
                } else
                    System.out.println("Sorry Please put size greater than 0");
                System.out.println("\nEnter 1 to continue or any other number to exit");
                choice = in.nextInt();
                if (choice != 1)
                    System.out.println("Thank you :)");
            }
        }
    }

    public static String space(int n) {
        return " ".repeat(Math.max(0, n));
    }

    public static String print_matrix() {
        StringBuilder s = new StringBuilder();
        int x = letters_matrix[0].length;
        s.append(space(36)).append("   ").append(add_number()).append('\n');
        for (int i = 0; i < letters_matrix.length; i++) {
            char[] lettersMatrix = letters_matrix[i];
            s.append(space(36));
            s.append((i + 1)).append("  ");
            for (int j = 0; j < x; j++) {
                s.append(lettersMatrix[j]).append(" ");
            }
            s.append('\n');
        }
        return s.toString();
    }

    private static String add_number() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            s.append(i).append(" ");
        }
        return s.toString();
    }

    public static int[] reply(Scanner in, int n, int num, String word) {
        int[] answer = new int[n];
        int reply;
        int counter = 0;
        System.out.println(space(28) + "Now answer " + word + "wise");
        System.out.println("Answer from the letter box");
        for (int i = 1; i <= n; i++) {
            System.out.println(print_matrix());
            for (int j = 0; j <= num; j++) {
                System.out.println("If your " + i + "th " +
                        "letter of the name present in " + (j + 1) + "th " + word +
                        " if,yes enter 1 other wise 0 ");
                reply = in.nextInt();
                if (reply == 1) {
                    answer[counter] = j;
                    counter += 1;
                    break;
                }
            }
        }
        return answer;
    }

}