package recursion.STRINGrecursion;
import java.util.*;

public class subsetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 2, 3 , 1} ;
        System.out.print("original array : ");
        for( int ele : arr){
            System.out.print( ele + " ");
        }
        System.out.println();
        
        List<Integer> result = new ArrayList<>();
        subsetsum(0, arr, 0, result);
        Collections.sort(result);
        System.out.println("subset sums : " + result);

    }
    public static void subsetsum( int idx , int []arr , int sum , List<Integer> list){
        if( idx == arr.length){  // base case 
            list.add(sum);
            return;
        }
        subsetsum(idx +1, arr, sum+arr[idx] , list); // pick 
        subsetsum(idx+1, arr, sum, list); // skip
    }
}
