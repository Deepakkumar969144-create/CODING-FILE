package taiyarijavaa.Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;

public class countnumberofequalpairsinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= "air";
        System.out.println("string is : " + s);
        System.out.println("count number of equal pairs in string : " + equalpair(s)    );
        String s2 = "aa";
        System.out.println("string s2 : " + s2);
        System.out.println("count number of equal pairs in string : " + equalpair(s2));

    }
    public static long equalpair(String s ){
        HashMap < Character, Integer > map = new HashMap<>();
        for( int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch , 0) + 1 ); 

        }
        long pairs = 0 ;
        for( char ch : map.keySet()){
            long freq = map.get(ch);
            pairs += freq * freq;

        }
        return pairs;

    }
    
}
