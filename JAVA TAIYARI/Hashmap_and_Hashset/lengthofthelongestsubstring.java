package Hashmap_and_Hashset;
import java.util.Scanner;
import java.util.*;

public class lengthofthelongestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "geeksforgeeks";
        System.out.println("string : " + s);
        System.out.println("lengh of the longest substring : " + longestunique(s));
        
    }
    public static int longestunique( String s ){
        HashSet<Character> set = new HashSet<>();
        int i =0 , j =0 , maxlen = 1;
        while (j<s.length()) {
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;

            }
            else {
                int len = j-i;
                maxlen = Math.max(maxlen, len);
                while (s.charAt(i) != s.charAt(j)) {
                    set.remove(s.charAt(i));
                    i++;

                }
                i++;
                j++;

            }
        }
        int len = j-i ;
        maxlen = Math.max(maxlen, len);
        return maxlen;

    }
}
