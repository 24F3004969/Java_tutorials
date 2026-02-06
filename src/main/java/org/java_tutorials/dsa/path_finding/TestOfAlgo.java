package org.java_tutorials.dsa.path_finding;

public class TestOfAlgo {
    public static void main(String[] args) {
        // Description of the Grid-
        // 1--> The cell is not blocked
        // 0--> The cell is blocked
        int[][] grid = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 0, 0, 1}};

        // Source is the left-most bottom-most corner
        int[] src = {8, 0};

        // Destination is the left-most top-most corner
        int[] dest = {0, 0};
        AStarSearch search = new AStarSearch(9,10);
        search.aStarSearch(grid, src, dest);
    }
}
