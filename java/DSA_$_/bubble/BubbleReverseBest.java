package bubble;
import java.util.Arrays;

public class BubbleReverseBest {
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 4, 2};
        System.out.println("original array element : ");

        for(int ele : arr){
            System.out.print(ele + " ");
                                    // print array
        }
        System.out.println();

        int n = arr.length;
        while(n > 0){
            int lastSwap = 0;

            for(int j = 0; j < n-1; j++){
                                     // Descending ke liye condition change
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    lastSwap = j + 1;       // track last swap
                }
            }

            n = lastSwap;               // optimization
        }

        // System.out.println(Arrays.toString(arr));            // print method 
        System.out.println(" reverse array element : ");
        for( int ele: arr){
            System.out.print(ele + " ");

        }
        System.out.println();
    }
}
