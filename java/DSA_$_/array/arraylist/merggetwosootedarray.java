package arraylist;
import java.util.Scanner;

import java.util.ArrayList;
public class merggetwosootedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a= { 2, 5,6,9, 20};
        int[] b= { 1, 3, 4, 5, 7, 8,90};
        int [] c= new int[a.length + b.length];

        // for(int ele : c)
        // System.out.print(ele + " ");

        marge(c, a, b);         // call lagai

        System.out.println();
        System.out.println(" merge two sooted arrays in a single big array: ");
        for(int ele : c)
        System.out.print(ele + " ");
        System.out.println();

        
    }                           //  3 pointer technique

    public static void marge(int [] c, int [] a, int [] b) {

        int i=0 , j=0 ,k=0;

        while (i<a.length && j<b.length ){
            if(a[i]<b[j])
            c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (i<a.length)
        c[k++] = a[i++];
        while(j<b.length) 
        c[k++] = b[j++];
        
    }
}
