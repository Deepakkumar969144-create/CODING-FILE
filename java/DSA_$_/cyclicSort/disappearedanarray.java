package cyclicSort;
import java.util.Scanner;
import java.util.*;

public class disappearedanarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("original array: ");
        for( int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();
        ArrayList< Integer> result = findedisappe(arr);
        System.out.println("all number disappeared in an array : " + result);
    }
    public static ArrayList < Integer> findedisappe( int [] arr){
    ArrayList < Integer> ans = new ArrayList<>();
    int n = arr.length;
    int i=0;
    while( i<n){
        int rightidx = arr[i] -1;
        if( arr[i] == i+1 || arr[rightidx] == arr[i] ) i++;
        else swap( arr, i  , rightidx);

    }
    for( i =0; i<n ; i++ ){
        if( arr[i] != i+1) ans.add(i+1);
    }
    return ans;

    }
    public static void swap( int[] arr , int i , int j){
        int temp = arr[i];
        arr [i] = arr[j];
        arr[j] = temp;

    
    }
}

