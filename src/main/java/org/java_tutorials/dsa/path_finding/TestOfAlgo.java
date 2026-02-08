package org.java_tutorials.dsa.path_finding;

public class TestOfAlgo {
    public static void main(String[] args) {
        int row = 50, col = 50;
        for (int i = 0; i < 20; i++) {

            int[][] grid = /*{{1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 0, 0, 1}}*/generate_grid(row, col);
            draw(grid);
            int x1 = Integer.parseInt(IO.readln("Enter the start x1\n"));
            int y1 = Integer.parseInt(IO.readln("Enter the start y1\n"));
            int x2 = Integer.parseInt(IO.readln("Enter the start x2\n"));
            int y2 = Integer.parseInt(IO.readln("Enter the start y1\n"));
            int[] src = {y1, x1};
            int[] dest = {y2, x2};
            draw(grid);
            AStarSearch search = new AStarSearch(row, col);
            search.aStarSearch(grid, src, dest);
        }
    }

    private static void draw(int[][] grid) {
        StringBuilder grid_pattern = new StringBuilder();
        for (int i = -1; i < grid.length + 1; i++) {
            for (int j = -1; j < grid[0].length + 1; j++) {
                if (i < 0 || j < 0 || i == grid.length || j == grid[0].length) {
                    grid_pattern.append("██");
                } else {
                    if (grid[i][j] == 1)
                        grid_pattern.append("  ");
                    else
                        grid_pattern.append("██");
                }
            }
            grid_pattern.append("\n");
        }
        IO.println(grid_pattern);
    }

    public static int[][] generate_grid(int row, int col) {
        int[][] grid = new int[row][col];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                var r = (int) ((Math.random() * (i + j))) % (3);
                grid[i][j] = r != 0 ? 1 : 0;
            }
        }
        return grid;
    }
}
