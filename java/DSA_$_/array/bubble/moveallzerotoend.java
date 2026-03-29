package array.bubble;
import java.util.Scanner;

public class moveallzerotoend {
    public static void main(String[] args) {
    
    int [] arr = { 5,3, 0, 6, 2, 9, 0, 8, 5};
    System.out.println(" array element : ");
   for(int ele : arr){
    System.out.print( ele + " ");

   }
   System.out.println();
   pushzerostoend(arr);
   System.out.println("move all zero to end array : ");
   for( int ele : arr){
    System.out.print( ele + " ");

   }
   System.out.println();

}
public static void pushzerostoend(int [] arr){
    int n = arr.length ;
    int j=0;
    for (int i=0; i<n; i++){
        if( arr[i] != 0 ){
            if(i != j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;

            }
            j++;

        }
    }
}
}
