package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class commonelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 3, 4, 2, 2, 4 };
        int[] b = { 3, 2, 2, 7, };
        System.out.println(" firt array element : ");
        for (int ele : a) {
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println(" secend array element : ");
        for (int ele : b) {
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println(" common element array : ");

        CommonElements(a, b);
        for(int ele: CommonElements(a, b)){     // ele : .... yaha name likhna hota hai. aagar call lagai to call bala name mtlab new functiion name 
            System.out.print(ele + " ");

        }
        System.out.println();
    }

    public static ArrayList<Integer> CommonElements(int a[], int b[]) {
        int i = 0, j = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
         // Ye ek dynamic array (resizable list) banata hai
         //Jisme tum multiple integers store kar sakte ho
        // ans Ye variable ka naam hai (tum kuch bhi rakh sakte ho)
        // Ek empty list banayi jisme numbers add kar sakte ho aur size automatically badhega”

        while ( i<a.length && j<b.length){
            if( a[i] == b[j]){
                ans.add ( a[i]);
                i++;
                j++;
            }
            else if( a[i] < b[j]){
                i++;
            }
            else j++;
                       
        }
        return ans;

    }

}
