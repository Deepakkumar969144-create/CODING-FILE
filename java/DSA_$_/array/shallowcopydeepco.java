import java.util.Scanner;
public class shallowcopydeepco {
    public static void main(String[] args) {
        int [] arr= { 30, 4, 54, 30 };
        int [] x = arr;                 //  x is shallow copy of array //  "Ek hi ghar ke do raste."
        x[0] = 100;                 
        System.out.println(arr[0]);

    }
    
}
                //  Jab aapne likha int[] x = arr;, toh aapne naya array nahi banaya,
                // balki purane array ko hi ek naya naam de diya. Isse hi Shallow Copy kehte hain.