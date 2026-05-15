//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {
                    perimeter += 4;

                    // Checking left side
                    if (j > 0 && (grid[i][j - 1] == 1)) perimeter--;

                    // Checking right side
                    if (j < grid[0].length - 1 && (grid[i][j + 1] == 1)) perimeter--;

                    // Checking top side
                    if (i > 0 && (grid[i - 1][j] == 1)) perimeter--;

                    // Checking bottom side
                    if (i < grid.length - 1 && (grid[i + 1][j] == 1)) perimeter--;

                }

            }
        }
        return perimeter;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};

        Solution sol = new Solution();

        System.out.println(sol.islandPerimeter(grid));
    }
}