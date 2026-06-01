package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class palindromestring {
    public static void main(String[] args) {
        String str = "\n mom , dad, racecar, malayalam, naman, nitin , abccba";
        System.out.println("original string : " + str);

        boolean palindrome = ispalindrome(str);
        System.out.println("palindrome found : " + palindrome);
    }
    public static boolean ispalindrome ( String str){
        int i= 0, j = str.length() - 1;
        while ( i<=j){
            if( str.charAt(i) != str.charAt(j)){
                return false;
            }
            else { 
                i++;
                j--;

            }
        }
        return true ;
    }

}
