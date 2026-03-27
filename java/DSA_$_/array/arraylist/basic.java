package arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(34);
        arr.add(35);
        arr.add(56); // yese array bana sakte hai
        arr.add(78);
        arr.add(23);

        System.out.println("array index element : ");
        System.out.println(arr.get(3));
        System.out.println();

        // updating ; array index ke throw

        arr.set(4, 99);


        System.out.println("array print: ");

        System.out.println(arr); // print karna loop ke throw but syntax short but print loop ke thorw hi hoga
                                 // yek proper method nhi hai array print karaane ka
        // arraylist ki size hogi na ki length

        int n = arr.size();

        // array ko print karna
         System.out.println("array print: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr.get(i) + " ");

        // arrray ko print karna
         System.out.println("\narray print: ");
        for (int ele : arr) {
            System.out.print(ele + " ");

        }

        System.out.println("\narray updating: ");
        arr.add(78);
        arr.add(5, 100);    // array index ke thorw updating 
        System.out.println(arr);

        System.out.println("array last element remove : ");
        arr.remove(arr.size() - 1);         // array last element remove
        System.out.println(arr);

        System.out.println("array revese : ");
        Collections.reverse(arr);       // array reverse 
        for(int ele: arr){
            System.out.print(ele + " ");
        }

                // reverse normal method 

       int i=0 , j=arr.size() -1;
       while ( i<j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp );
        i++;
        j--;

       }  
       System.out.println();
       System.out.println("reverse array normal method : ");  
       System.out.println(arr);


    }

}
