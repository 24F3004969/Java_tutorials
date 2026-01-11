
package org.java_tutorials.tuition.shahir.part_1.tutorials_13;

import java.util.Arrays;
import java.util.Scanner;

class dice {
    public static void main(String[] args) {
        String[][] dice = new String[9][9];
        init_dice(dice);
        String value;
        try (var scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Press enter to role dice or enter 'e' to exit");
                value = scanner.nextLine();
                if (value.equalsIgnoreCase("e"))
                    break;
                play(dice);
            }
        }
    }

    private static void play(String[][] dice) {
        int dice_no = (int) (Math.random() * 6 + 1);
        StringBuilder text = new StringBuilder();
        int half = dice.length / 2;
        int end = dice.length - 3;
        int start = 2;
        switch (dice_no) {
            case 1 -> dice[half][half] = "●";
            case 2 -> {
                dice[start][start] = "●";
                dice[end][end] = "●";
            }
            case 3 -> {
                dice[start][start] = "●";
                dice[half][half] = "●";
                dice[end][end] = "●";
            }
            case 4 -> {
                dice[start][start] = "●";
                dice[start][end] = "●";
                dice[end][start] = "●";
                dice[end][end] = "●";
            }
            case 5 -> {
                dice[start][start] = "●";
                dice[start][end] = "●";
                dice[half][half] = "●";
                dice[end][start] = "●";
                dice[end][end] = "●";
            }
            case 6 -> {
                dice[start][start] = "●";
                dice[start][end] = "●";
                dice[half][start] = "●";
                dice[half][end] = "●";
                dice[end][start] = "●";
                dice[end][end] = "●";
            }
            default -> throw new IllegalStateException("Unexpected value: " + dice_no);
        }
        System.out.print("\033[H\033[J");
        print_dice(dice, text, half, end, start);
    }

    private static void print_dice(String[][] dice, StringBuilder text, int half, int end, int start) {
        boolean c = true;
        for (String[] d : dice) {
            for (int j = 0; j < dice[0].length; j++) {
                if (d[j] != null && d[j].equals("●"))
                    text.append((c) ? d[j] + " " : " " + d[j]);
                else if (d[j] != null && d[j].equals("██"))
                    text.append(d[j]);
                else text.append("  ");
                c = !c;
            }
            text.append('\n');
        }
        System.out.println(text);
        reset_dice(dice, half, end, start);
    }

    private static void reset_dice(String[][] dice, int half, int end, int start) {
        dice[half][half] = null;
        dice[end][end] = null;
        dice[start][start] = null;
        dice[start][end] = null;
        dice[end][start] = null;
        dice[half][start] = null;
        dice[half][end] = null;
    }

    private static void init_dice(String[][] dice) {
        for (int i = 0; i < dice.length; i++) {
            if (i == 0 || i == dice.length - 1) {
                Arrays.fill(dice[i], "██");

            } else {
                dice[i][0] = "██";
                dice[i][dice[i].length - 1] = "██";
            }
        }
    }
}
