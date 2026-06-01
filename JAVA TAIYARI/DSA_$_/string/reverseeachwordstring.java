package string;
import java.util.Scanner;
import java.util.*;

public class reverseeachwordstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String res = reverseWords(str);
        System.out.println("Reversed string: " + res);
    }

    public static String reverseWords(String str) {
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            int start = i;
            while (i < str.length() && str.charAt(i) != ' ') {     // word end tak jao
                   // same character ko count karta hai
                i++;
            }
            for (int j = i - 1; j >= start; j--) {   // reverse print karo
                ans.append(str.charAt(j));
                // string ka j index ka character uthao
                // usko ans me add (append) kar do
            }
            if (i < str.length()) {      // space add karo
                ans.append(" ");
            }

            i++; // next word
        }
        return ans.toString();
    }
}
