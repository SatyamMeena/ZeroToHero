package Java.BackTracking;

import java.util.*;

public class MazeProblem {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };

        int[][] path = new int[maze.length][maze[0].length];
        // allPath("", maze, 0, 0);
        allPathwithNumbers("", maze, 0, 0, path, 1);
    }

    static void maze(String p, int row, int col) {
        if (row == 1 && col == 1)
            System.out.println(p);
        if (row > 1) {
            maze(p + "D", row - 1, col);
        }
        if (col > 1) {
            maze(p + "R", row, col - 1);
        }
    }

    static void mazeDiag(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
        }
        if (row > 1) {
            mazeDiag(p + "D", row - 1, col);
        }
        if (col > 1) {
            mazeDiag(p + "R", row, col - 1);
        }
        if (col > 1 && row > 1) {
            mazeDiag(p + "L", row - 1, col - 1);
        }

    }

    static int mazeCount(int row, int col, int count) {
        if (row == 1 || col == 1)
            return 1;
        return mazeCount(row - 1, col, count) + mazeCount(row, col - 1, count);

    }

    static void mazeWithRestriction(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1)
            System.out.println(p);

        if (maze[row][col] == false) {
            return;
        }
        if (row < maze.length - 1) {
            mazeWithRestriction(p + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            mazeWithRestriction(p + "R", maze, row, col + 1);
        }
    }

    static void allPath(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[row][col] == false) {
            return;
        }

        maze[row][col] = false;
        if (row < maze.length - 1) {
            allPath(p + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            allPath(p + "R", maze, row, col + 1);
        }
        if (row > 0) {
            allPath(p + "U", maze, row - 1, col);
        }
        if (col > 0) {
            allPath(p + "L", maze, row, col - 1);
        }
        maze[row][col] = true;
    }

    static void allPathwithNumbers(String p, boolean[][] maze, int row, int col, int[][] path, int count) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = count;
            System.out.println(p);
            for (int[] is : path) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println();
            return;
        }

        if (maze[row][col] == false) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = count;
        if (row < maze.length - 1) {
            allPathwithNumbers(p + "D", maze, row + 1, col, path, count + 1);
        }
        if (col < maze[0].length - 1) {
            allPathwithNumbers(p + "R", maze, row, col + 1, path, count + 1);
        }
        if (row > 0) {
            allPathwithNumbers(p + "U", maze, row - 1, col, path, count + 1);
        }
        if (col > 0) {
            allPathwithNumbers(p + "L", maze, row, col - 1, path, count + 1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }

}
