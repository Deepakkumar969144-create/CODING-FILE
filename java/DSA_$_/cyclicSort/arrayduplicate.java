package cyclicSort;
import java.util.*;
public class arrayduplicate {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 2, 3, 1, 2, 3};
        System.out.println("original array : ");
        for( int ele : arr)
        System.out.print( ele + " ");
        System.out.println();
         ArrayList <Integer>result =  findduplicate(arr);
         System.out.println("array duplicate: " + result);

     }
     public static ArrayList<Integer> findduplicate(int[] arr) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = arr.length;
    int i = 0;
    //  Cyclic Sort
    while (i < n) {
        int rightidx = arr[i] - 1;
        if (arr[i] == i + 1 || arr[rightidx] == arr[i]) {
            i++;
        } else {
            swap(arr, i, rightidx);
        }
    }
    //  Check duplicates (ALAG loop)
    for (i = 0; i < n; i++) {
        if (arr[i] != i + 1) {
            if (!ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }
    }
    return ans;
}

     public static void swap( int [] arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;

     }
}