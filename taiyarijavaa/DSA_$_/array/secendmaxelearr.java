import java.util.Scanner;
public class secendmaxelearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 4, 6, 30, 35, 2,6};
        int max = Integer.MIN_VALUE;
        int secendmax = Integer.MIN_VALUE;

           // calculate max value 

           for ( int i=0;  i<arr.length; i++){
            if (arr[i] > max ){
                max = arr[i]; 

            }

           }
           System.out.println("max value is " + max);
           System.out.println();

                 // calculate second max value

           for ( int i=0; i<arr.length; i++){
            if ( arr[i] > secendmax && arr[i] != max){
                secendmax = arr[i]; 

            }
           }

           System.out.println("secend max value is " + secendmax );
           System.out.println();

    }
    
}

