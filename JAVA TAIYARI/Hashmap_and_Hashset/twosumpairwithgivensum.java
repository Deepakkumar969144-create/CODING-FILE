package taiyarijavaa.Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;

public class twosumpairwithgivensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr [] = { 0, -1, 2, -3 , 1 };
        System.out.println("array element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        int traget =-2;
        System.out.println("two pair with given sum : ");
        System.out.print(twosum(arr, traget));

    }
    private static boolean twosum( int arr [] , int target ){
        HashSet<Integer> set = new HashSet<>();
        for( int ele : arr ){
            int rem = target - ele ;
            if(set.contains(rem)) return true;
            set.add(ele);

        }
        return false;

    }
    
}
