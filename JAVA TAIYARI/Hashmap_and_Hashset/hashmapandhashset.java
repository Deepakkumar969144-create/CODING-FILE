package Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;

public class hashmapandhashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hashmap : ");
        HashMap < Integer , String > map = new HashMap<>();
        map.put(1, "deepak");
        map.put(2, "aman ");
        System.out.println(map  );
        map.remove(2);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map);

        System.out.println("hashset : ");
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
         
        System.out.println(set  );
        set.remove(10);
        System.out.println(set  );
        System.out.println(set.contains(30));
        System.out.println(set  );
        
    }
    
}
