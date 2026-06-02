package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class singlenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr [] = { 1,0, 0, 1, 1, 1, 0 };
        System.out.println(getsingle(arr)  );

    }
    public static int getsingle ( int arr [] ){
        int xor = 0;
        for( int ele : arr ){
            xor = xor ^ ele ; 

        }
        return xor ;

    }
    
}
