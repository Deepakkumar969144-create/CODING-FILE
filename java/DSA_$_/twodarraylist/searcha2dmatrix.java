package twodarraylist;
import java.util.*;

public class searcha2dmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = {{ 1,4,7,11,15} , { 2,5,8,12,19} , { 3, 6, 9, 16, 22} , { 10, 13, 14, 17, 24} , { 18, 21, 23, 26, 30}};
        System.out.println("original 2d array : ");
         for (int[] list : arr) {
            for (int ele : list) {
                System.out.print(ele + " ");

            }
            System.out.println();
     }
     System.out.print("enter target :");
     int target = sc.nextInt();
     boolean result = seachmatrix(arr, target);
     System.out.println("output in array :" + result);
     }
    
    public static boolean seachmatrix(int [][] arr , int target ){
        int m= arr.length , n= arr[0].length ;
        int i=0;
        int j=n-1;
        while ( i<m && j>=0){
            if( arr[i][j] > target)  j--;
            else { 
                if( arr[i][j] < target )  i++;
                else  return true;

            }
        }
          return false ; 
    }
}
