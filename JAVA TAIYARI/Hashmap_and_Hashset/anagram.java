package taiyarijavaa.Hashmap_and_Hashset;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = "geeks";
        String s2 = "kseeg";
        if(areanagram(s1, s2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        System.out.println("anagram : ");
        System.out.print(areanagram(s1, s2));
    }
    public static boolean areanagram( String s1 , String s2 ){
        if(s1.length() != s2.length()){
            return false;

        }
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i< s1.length(); i++ ){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for(int i = 0 ; i<s2.length(); i++ ){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch))
                return false;
            int freq = map.get(ch);
            if( freq == 0 ) return false;
            map.put(ch, freq - 1 );

        }
        return true;

    }

}