package foreachloop;
import java.util.Scanner;
public class partofreversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" element array ");
        int [] arr = { 4, 6, 8, 2, 3, 5};
        for( int ele: arr){
            System.out.print(ele + " ");

        }
        System.out.println();
        
        int n= arr.length;
        int i=2, j=4;
        while ( i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        
    }
    System.out.println(" reverse part of array");

    for ( int ele : arr){
        System.out.print(ele + " ");

    }
}
}

