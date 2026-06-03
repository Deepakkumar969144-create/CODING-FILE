package BIT_Manupulation;
import java.util.Scanner;
import java.util.*;

public class subsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 1,2,3,};
        System.out.println("arrays element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        System.out.println("all the subsets of the given array is : "+subset(arr));

    }
    public static List<List<Integer>> subset( int [] arr ){
        int n = arr.length;
        int m = ( 1 << n );
        List < List < Integer >> ans = new ArrayList<>();
        for( int i = 0 ; i<m ; i++ ){
            List<Integer> a = new ArrayList<>();
            for(int j = 0 ; j< n ; j++){
                if((i >> j ) % 2 == 1 ) 
                a.add(arr[j]);

            }
            ans.add(a);

        }
        return ans;

    }
    
}
