package string;
import java.util.Scanner;
import java.util.*;

public class nonrepeatingcharactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        char ans = nonrepeatingchar(str);
        if(ans != '#'){
            System.out.println("the first non repeating charactor is : " + ans);
            
        }
        else {
            System.out.println("no non repeatin character found ");

        }

    }
    public static char nonrepeatingchar( String str){
        char ans = '#';
        int[] freq = new int[26];
        for( int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a'] ++;

        }
        for( int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);        //charAt(i) → character nikalta hai
            if( freq [ ch - 'a'] == 1){
                return ch;
        //ch - 'a' → index banata hai
       // freq[...] → count check karta hai
      // == 1 → non-repeating character

            }
        }
        return ans;     // if no non repeating charactor found then return #
    }
}
