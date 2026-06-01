package recursion;
import java.util.Scanner;
import java.util.*;

public class towerOFhanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print( "enter disk quenty : ");
        int n = sc.nextInt();
        System.out.println("total step arrange disk : ");
        hanoi(n , 'A', 'B', 'C' );
        
    }
public static void hanoi ( int n , char a , char b, char c){
    if ( n == 0 ) return;
    hanoi(n-1 , a, c, b);   // n-1 disk from a to b via c 
    System.out.println(a+ " -> " +c);   // largest from a to c 
    hanoi(n-1, b, a, c);    // n-1 disk from b to c via a 
    return;

}

}
