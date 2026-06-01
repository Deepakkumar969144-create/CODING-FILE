package recursion;
import java.util.Scanner;
import java.util.*;

public class lookandsaypatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1
        // 11        (one 1)
        // 21        (two 1s)
        // 1211      (one 2, one 1)
        // 111221    (one 1, one 2, two 1s)
        System.out.print(" entr index number : ");
        int n = sc.nextInt();
        String result  = countandsay(n);
        System.out.println("final look and say patter : " + result);

    }
    public static String countandsay( int n ){
        if( n == 1 ) return "1" ;
        String s = countandsay(n-1 ); // fix 1 
        String ans = "" ;
        int i = 0 , j = 0 ;
        while ( j< s.length()){
            if( s.charAt(i) == s.charAt(j))  j++ ;
            else{
                int freq = j-i;
                ans += freq ;
                ans += s.charAt(i);
                i = j ;

            }
        }
         // FIX 2 (last group)
        int freq = j-i;
        ans += freq;
        ans += s.charAt(i);
        return ans ; 
    }
}
