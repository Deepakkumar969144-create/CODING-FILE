package Binary_Search_On_Ans;
import java.util.Scanner;
import java.util.*;

public class kokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] =  { 5,10,3};
        System.out.print("value of arr ele : ");
        for( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        int k = 4;
        System.out.println("k value of k : "+ k);
        System.out.print("koko earing banans : ");
        System.out.println(kokoeat(arr, k));

    }
    public static int kokoeat(int [] arr, int k ){
        int max = Integer.MIN_VALUE;
        for(int ele : arr ){
            max = Math.max(max, ele );

        }
        int lo = 1 , hi = max , speed = max;
        while (lo <= hi ) {
            int mid = lo + ( hi - lo )/2;
            if(hours(mid , arr ) <= k ){
                hi = mid -1 ;
                speed = mid ;

            }
            else lo = mid +1 ;

        }
        return speed ;

    }
    public static int hours(int speed , int [] arr ){
        int h = 0 ;
        for(int ele : arr ){
            if(ele % speed == 0 )
            h += ele / speed ;
            else
            h += (ele / speed +1 );

        }
        return h;

    }
    
}
