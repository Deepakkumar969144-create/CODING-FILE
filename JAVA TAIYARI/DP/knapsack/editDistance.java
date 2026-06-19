package DP.knapsack;
import java.util.Scanner;
import java.util.*;

public class editDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string s1 : ");
        String s1  = sc.nextLine();
        System.out.print("enter string s2 : ");
        String s2  = sc.nextLine();
        System.out.print("edit distance : ");
        System.out.println(edit(s1, s2, s1.length() - 1 , s2.length() - 1  ));

    }
    public static int edit( String s1 , String s2 , int i , int j ){
        if( i < 0 ) return j + 1 ;
        if( j < 0 ) return i+ 1 ;
        if( s1.charAt( i ) == s2.charAt(j ) ){
            return edit(s1, s2, i-1 , j - 1 );

        }
        int inset = edit(s1, s2, i, j-1 );
        int delete = edit(s1, s2, i-1 , j);
        int replace = edit(s1, s2, i-1 , j-1 );
        return 1 + Math.min(inset , Math.min(delete , replace));

    }
    
}
