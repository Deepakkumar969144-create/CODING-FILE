package taiyarijavaa.Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;

public class hashsett {
    // unique value store karta hai 
    // duplicate allowed nhi hai 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
        set.remove(30);
        System.out.println(set  );
        set.size();
        System.out.println(set.size());
        System.out.println(set.contains(10));
        System.out.println(set  );
        
    }
    
}
