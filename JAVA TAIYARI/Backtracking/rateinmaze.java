package Backtracking;
import java.util.Scanner;
import java.util.*;

public class rateinmaze {
    public static void main(String[] args) { // 4 direction 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your m valur : ");
        int m  = sc.nextInt();
        System.out.print("entter your n value : ");
        int n = sc.nextInt();
        System.out.print("rate in maze : ");
        boolean [][] visited = new boolean[m ][n ];
        System.out.println(paths(0, 0, m-1, n-1, visited, " "));

    }
    public static int paths( int r , int c , int er ,int ec , boolean [][] visit, String s ){
        if( r>er || c >ec || r<0 || c < 0 || visit[r][c]) return 0;
        visit[r][c] = true;
        if( r== er && c== ec ){
            System.out.println(s);
            visit[r][c] = false ;// backtracking 
            return 1;

        }
        int left = paths(r, c-1 , er, ec, visit, s+'L');
        int up = paths(r-1, c, er, ec, visit, s + 'U');
        int right = paths(r, c+1 , er, ec, visit, s+'R');
        int down = paths(r+1 , c, er, ec, visit, s + 'D');
        visit [r][c] = false ; // backtracking 
        return right + down + left + up;


    }
    
}
