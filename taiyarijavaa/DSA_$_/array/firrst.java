import java.util.Scanner;

import static java.lang.System.out;

public class firrst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = { 2,4,6,8,7,9};
        out.println(arr[3]);

                //  updating the value of array 
                
                arr[4]= 40;
                out.println(arr[4]);
            out.println(java.util.Arrays.toString(arr));
            out.println(arr.length);
            for( int i=0; i<arr.length ; i++)
                out.println(arr[i] + " ");


           
        
    }
    
}
