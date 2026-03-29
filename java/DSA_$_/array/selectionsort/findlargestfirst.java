package array.selectionsort;
import java.util.Arrays;
import java.util.Scanner;
public class findlargestfirst {
    public static void main(String[] args) {
        int [] arr = { 3, 5, 2,7,4,8, 7};
        int n= arr.length;
        System.out.println(" original array  element : ");
        for( int ele : arr){
            System.out.print(ele+ " ");

        }
        System.out.println();

        // System.out.println(Arrays.toString(arr));

        // Selection Sort (Largest First)

        for(int i = 0; i < n-1; i++){
            int maxindex = i;

            for(int j = i+1; j < n; j++){
                if(arr[j] > arr[maxindex]){         //find largest
                  maxindex = j;
                }
            }

                         // Swap
                          if(maxindex != i){            //unnecessary swap avoid (optimization)
                int temp = arr[i];
                arr[i] = arr[maxindex];
                arr[maxindex] = temp;
                          }  
        }

        System.out.println("Sorted (Descending):");
        for( int ele: arr){
            System.out.print( ele+ " ");
        }
        System.out.println();
    }
}

