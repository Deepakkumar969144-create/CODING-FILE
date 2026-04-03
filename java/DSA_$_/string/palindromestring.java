package string;

import java.util.ArrayList;

public class palindromestring {
    public static void main(String[] args) {
        String str = "mom , dad, racecar, malayalam, naman, nitin , abccba";
        System.out.println("original string : " + str);

        int palindromes = findPalindrome(str);
        System.out.println("palindromes found : " + palindromes);
    }
    

}
