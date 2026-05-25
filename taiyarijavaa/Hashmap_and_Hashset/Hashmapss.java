package taiyarijavaa.Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;
public class Hashmapss {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    HashMap < Integer , String > map = new HashMap<>();
    map.put(101, "deepak");
    map.put(102, "reverse");
    System.out.println(map);
    System.out.println(map.get(101));
    map.remove(102);
    map.containsKey(101); // search karna 
    map.size();
    System.out.println(map);

}

}
