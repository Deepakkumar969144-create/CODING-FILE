package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class uniquenumbertwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 1, 2, 3, 2, 1 , 4 };
        System.out.println("arrays element ; ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.print(" unique number is two : ");
        System.out.println(Arrays.toString(singlenum(arr)));

    }
    public static int[] singlenum( int [] arr ){
        int xor = 0 ;
        for( int ele : arr ){
            xor ^= ele ;

        }
        int mask = ( xor & ( xor-1 )) ^ xor ;
        int b1 = 0 , b2 = 0 ;
        for( int ele : arr ){
            if((ele & mask ) != 0 )
                b1 ^= ele;
            else
                b2 ^= ele ;

        }
        int [] ans = { b1, b2 };
        Arrays.sort(ans);
        return ans;

    }
    
}