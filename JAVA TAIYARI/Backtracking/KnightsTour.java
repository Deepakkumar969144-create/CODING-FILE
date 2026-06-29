package Backtracking;
import java.util.*;
public class KnightsTour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], -1);

        }
        int row = 0;
        int col = 0;
        board[row][col] = 0;
        if (knight(board, row, col, 1, n)) {
            print(board, n);

        }
        else {
            System.out.println("Solution does not exist");

        }
    }
    public static boolean knight(int[][] board, int row, int col, int move, int n) {
        if (move == n * n) {
            return true;

        }
        int[] dr = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dc = {-1, 1, -2, 2, -2, 2, -1, 1};
        for (int i = 0; i < 8; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];
            if (isSafe(board, nr, nc, n)) {
                board[nr][nc] = move;
                if (knight(board, nr, nc, move + 1, n)) {
                    return true;

                }
                board[nr][nc] = -1;

            }
        }
        return false;

    }
    public static boolean isSafe(int[][] board, int row, int col, int n) {
        if (row >= 0 && row < n &&
            col >= 0 && col < n &&
            board[row][col] == -1) {
            return true;

        }
        return false;

    }
    public static void print(int[][] board, int n) {
        System.out.println("\nKnight Tour : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", board[i][j]);
                
            }
            System.out.println();

        }
    }
    
}