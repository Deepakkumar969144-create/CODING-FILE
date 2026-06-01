package recursion.arraysRECURSION;
import java.util.Scanner;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 5 , 3, 7, 12, 76, 9, 34, 5};
        System.out.println("original array : ");
        for( int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // System.out.println("ulta array print:  ");
        // recprint(arr, 0);

        int target = 76;
        System.out.println("search in array elemetn : ");
        System.out.println( exists(arr , target , 0 ));
    }

    //         // reverse array -
    // public static void recprint( int [] arr, int idx){
    //     if( idx == arr.length) return ;
    //     recprint(arr, idx +1);
    //     System.out.print(arr[idx] + " ");

    // }

        // search in array element -
    public static boolean exists( int []arr, int target , int idx ){
        if( idx == arr.length) return false;
        if( arr[ idx ] == target) return true ;
        return exists(arr , target , idx +1);

    }
}
