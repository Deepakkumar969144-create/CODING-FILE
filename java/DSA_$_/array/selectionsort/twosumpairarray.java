package array.selectionsort;

import java.util.Scanner;
import java.util.Arrays;

public class twosumpairarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, -2, 6, 7, 2, 0, 7, 2 };
        int n = arr.length;

        System.out.println(" enter target : ");
        int target = sc.nextInt();   // user se input lena 
             // yaha se code samjho 

        boolean result = twosum(arr, target);
        
        if(result) {
            System.out.println("Pair found ");
        }
         else {
            System.out.println("No pair found ");
        }
    }

    static boolean twosum(int[] arr, int target) {          // new function
        Arrays.sort(arr);           // array ko sort karna short me 
        int i=0 ;
        int j=arr.length-1;
        while( i<j ){
            if( arr[i] + arr[j] == target){
                return true;

            }
            else if( arr[i] + arr[j] < target){
                i++;

            }
            else if ( arr[i] + arr[j] > target ) { 
                j-- ;

            }
           
        }
        return false;
       
    }

}
                                                //  best code 

//     public static void main(String[] args) {

//         int[] arr = { 5, -2, 6, 7, 2, 0, 7, 2 };
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter target: ");
//         int target = sc.nextInt();

//         boolean result = twosum(arr, target);

//         if(result){
//             System.out.println("Pair found ");
//         } else {
//             System.out.println("No pair found ");
//         }
//     }

//     static boolean twosum(int[] arr, int target) {
//         Arrays.sort(arr);

//         int i = 0;
//         int j = arr.length - 1;

//         while(i < j){
//             int sum = arr[i] + arr[j];

//             if(sum == target){
//                 System.out.println("Pair: " + arr[i] + " + " + arr[j]);
//                 return true;
//             }
//             else if(sum < target){
//                 i++;         // move left forward
//             }
//             else{
//                 j--;         // move right backward
//             }
//         }

//         return false;        // loop ke baad
//     }
// }
