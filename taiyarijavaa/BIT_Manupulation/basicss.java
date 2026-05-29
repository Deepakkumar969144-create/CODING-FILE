package taiyarijavaa.BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class basicss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // and & , | or - 
        System.out.println(51 & 42);
        System.out.println(51 | 42 );
        System.out.println();

        // bitwise ^ xor -
        int n = 0;
        int m = 1;
        System.out.println( n ^ m );
        System.out.println();

        // swaping 2 number - 
        int a = 3 , b = 8 ;
        a = a^b;
        b = a^b;
        a = a ^ b ;
        System.out.println(a);
        System.out.println();

        // 1`s complement and 2`s complement 
            //1`s - flip all digit 
            // 2`s =  ~x + 1 or -x = -x 
        int x = 5;
        System.out.println(~x ); // 1`s complement 
        System.out.println( -x - 1 ); // 1`s complement 
        System.out.println( ~x + 1 ); // 2`s complement 
        System.out.println( -x); // 2`s complement 
        System.out.println();

        // nibble , byte , short , int , long  - 
            // 1 byte = 8 bits 
            // 1 nibble = 4 bits 
            // 1 int = 32 bits 
        byte y = 127 ;
        y += 3;
        System.out.println(x );
        int z = Integer.MAX_VALUE;
        z += 10;
        System.out.println(z);
        System.out.println();


    }
    // number ke binary bits ke sath directly operation karna ( 0 , 1 )

}
