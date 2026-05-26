package taiyarijavaa.Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;

public class missingelementinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = { 10 , 12, 11 , 15 } ;
        System.out.println("array element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        int low = 10 ; 
        int high = 15;

        System.out.println(" low : "+ low + " high : "+ high);
        System.out.println("missing element range : ");
        System.out.println(missingrange(arr, low, high) );

    }
    public static ArrayList < Integer > missingrange ( int arr [] , int low , int high ){
        ArrayList < Integer > ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for( int ele : arr ){
            set.add(ele );

        }
        for( int i = low ; i <= high ; i++ ){
            if( !set.contains(i) )  ans.add(i);

        }
        return ans;

    }
}