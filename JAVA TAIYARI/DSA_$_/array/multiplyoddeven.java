import java.util.Scanner;
public class multiplyoddeven {
    public static void main(String[] args) {
        int[] arr = { 4 , 5, 7, 2 , };
        print (arr);        // call kar raha print function ko 
        for ( int i=0 ; i<arr.length; i++){
            if(i%2 ==1){
                arr[i] *= 2; 
            } else {
                arr[i] +=10;
            }

        }
        print(arr);

    }

    public static void print ( int [] arr){
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " " );


        }
        System.out.println();

        }
    }
    
        // odd index vale element ko 2 se multiply krna hai
        // aur even index vale element ko 10 se add krna hai.
