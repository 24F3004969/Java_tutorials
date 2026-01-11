package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GridLayout {
    public static void main(String[] args) {
        String[][] grid = new String[20][20];
        randomObstacle(fillGrid(grid));
        grid[(int) (Math.random() * grid.length)][(int) (Math.random() * grid.length)]  = "p  ";
        grid[(int) (Math.random() * grid.length)][(int) (Math.random() * grid.length)] = "t  ";
        draw(grid);

    }

    private static String[][] randomObstacle(String[][] fillGrid) {
        IntStream.range(0, 200).forEachOrdered(i -> fillGrid[(int) (Math.random() * fillGrid.length)][(int) (Math.random() * fillGrid.length)] = "∎  ");
        return fillGrid;
    }

    private static void draw(String[][] grid) {
        Arrays.stream(grid).forEachOrdered(strings -> {
            Arrays.stream(strings, 0, grid[0].length).forEachOrdered(System.out::print);
            System.out.println();
        });
    }

    private static String[][] fillGrid(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = ".  ";
            }
        }
        return grid;
    }
}
