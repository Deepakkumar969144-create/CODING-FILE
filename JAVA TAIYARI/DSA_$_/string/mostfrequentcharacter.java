package string;
import java.util.Scanner;
import java.util.*;

;
public class mostfrequentcharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "testsampleshiftlast";
        System.out.println("original string : " + str);

        char result = getmaxoccuningchar(str);
        System.out.println(" most frequent character : " + result );

    }
    public static char getmaxoccuningchar( String str){
        int n = str.length();
        int []freq = new int [26];
        for( int i=0 ; i<n; i++){
        char ch = str.charAt(i);
        int idx = ch - 'a';
        freq [idx]++ ;
        }
        int maxFreq = 0 ;
        char ans = str.charAt(0);
        for ( int i=0; i<26 ; i++){
            if ( freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char) (i+ 97);
            }
        }
        return ans ;

    }
    
}
