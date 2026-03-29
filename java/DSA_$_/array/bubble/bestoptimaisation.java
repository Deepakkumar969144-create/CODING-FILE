package array.bubble;
import java.util.Scanner;

public class bestoptimaisation {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 4, 2};
        int n= arr.length;
        print(arr);
        for( int i=0; i< n-1; i++){
            int swaps = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break ;
        }
        System.out.print("array bubble ");
        print (arr);

    }

 public static void print(int[] arr) {
    System.out.println("array element : ");

    for(int x : arr){
    System.out.print(x + " ");
    
}
System.out.println();
 }    

}
