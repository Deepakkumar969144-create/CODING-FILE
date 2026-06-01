package taiyarijavaa.Hashmap_and_Hashset;
import java.util.*;

public class finddistinctelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 12, 1, 14, 3, 16 };
        System.out.println("array element : ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }   
    System.out.println();
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr ){
        set.add(ele);
        
    }
     System.out.print(set.size()+" ");
     
 }
    
}
