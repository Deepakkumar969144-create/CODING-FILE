import java.util.Scanner;

public class maxeleminarray {
    public static void main(String[] args) {
        int [] arr ={ 4, -5, 6, 7, -3, 9, -2 };
        int max = Integer.MIN_VALUE;  //  minimum value of integer is assigned to max variable in use for Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length; i++ ){
            if( arr[i] > max ){
                max = arr[i]; 

            }
           
        }
        System.out.println("max. array " + max);
    }       //  print max valur for array 
    
}
