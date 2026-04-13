package recursion;
import java.util.Scanner;
import java.util.*;

public class standardrecursive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =1;
        print(n);
    }
    public static void print(int n){ // function 
        if(n==0) return ;   // base code 
        // work 
        print(n-1);         // call - calling ( function)
        System.out.print( n+ " "); // work 
    }
    
}
