package binarysearch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class maxcountofositiveandnegativint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr = {-4, -3, -2, -1, 0, 0, 1, 2, };
        System.out.println(" original array element : ");
        for( int ele: arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        maxcount(arr);
        for( int ele: arr){
            System.out.print( ele + " ");

        }
        System.out.println();
    //     System.out.println(" output "+ result );   // jo jada hao wo output hoga mtlab negative or positive me se 
    }

    public static void maxcount(int []arr){     // max count karna short cut 
        int n= arr.length;
        int lastNeg = lastnegative(arr);
        int firstPos = firstpostive(arr);

        int negCount = (lastNeg == -1) ? 0 : lastNeg + 1;
        int posCount = (firstPos == -1) ? 0 : n - firstPos;
        if(negCount < posCount){
            System.out.println(" max count = " + negCount + "[negative number ] ");
        }
         if(negCount > posCount){
            System.out.println("max count = " + negCount + " [negative number]");
        }
         else if(posCount > negCount){
            System.out.println("max count = " + posCount + " [positive number]");
        }
         else { 
            System.out.println("both are equal : " + negCount); // genarlly negative use karte  hai 
        }
    }
                 // last negative 

     public static int lastnegative( int [] arr){
        int low = 0, high =arr.length-1;
        int idx = -1;
        while( low <= high ){
            int mid = ( low+  high)/2;

          if( arr[mid]<0){

        idx = mid;        // mil gaya negative to save karo 
        low = mid+1;         // aur aage check karo 
     }
     else{
        high = mid -1;

     }
    }
    return idx; 
}
        // first positive 

        public static int firstpostive( int [] arr){
            int low = 0, high = arr.length-1 , idx =-1;
            while ( low <= high ){
                int mid = (low + high )/2 ;
                if(arr[mid] >0){
                    idx = mid ;       // mil gaya to positive save 
                    high = mid-1;    // lift me aur pehle check karo 
            
                }
                else {
                    low = mid + 1; 

                }
            }
            return idx; 
        }
}
