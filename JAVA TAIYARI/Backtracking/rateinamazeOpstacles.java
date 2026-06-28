package Backtracking;
import java.util.*;
public class rateinamazeOpstacles {
    public static void main(String[] args) {
        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        System.out.println("Maze :");
        for (int[] row : maze) {
            for (int element : row) {
                System.out.print(element + " ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Possible Paths :");
        System.out.println(ratINmaze(maze));

    }
    public static ArrayList<String> ratINmaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        paths(0, 0, n - 1, n - 1, visited, "", maze, ans);
        Collections.sort(ans);
        return ans;

    }
    public static void paths(int r, int c,
                             int er, int ec,
                             boolean[][] visited,
                             String s,
                             int[][] maze,
                             ArrayList<String> ans) {

        // Boundary + obstacle + visited
        if (r < 0 || c < 0 || r > er || c > ec ||
                maze[r][c] == 0 || visited[r][c]) {
            return;

        }

        // Destination reached
        if (r == er && c == ec) {
            ans.add(s);
            return;

        }
        visited[r][c] = true;

        // Left
        paths(r, c - 1, er, ec, visited, s + "L", maze, ans);

        // Up
        paths(r - 1, c, er, ec, visited, s + "U", maze, ans);

        // Right
        paths(r, c + 1, er, ec, visited, s + "R", maze, ans);

        // Down
        paths(r + 1, c, er, ec, visited, s + "D", maze, ans);
        visited[r][c] = false;

    }
    
}