package taiyarijavaa.Hashmap_and_Hashset;

import java.util.Scanner;
import java.util.*;
public class mostfrequentcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "testsample";
        System.out.print("intput : ");
        System.out.println(s);
        System.out.print("most frequent character : ");
        System.out.println(mostfreqentchar(s));

    }
    public static char mostfreqentchar(String s ){
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch , freq + 1);

            }
            else{
                map.put(ch , 1);

            }
        }
        int maxfreq = 0;
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(freq > maxfreq){
                maxfreq = freq;

            }
        }
        char ans = 'z';
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(freq == maxfreq && ch <= ans){
                ans = ch;

            }
        }
        return ans;

    }

}