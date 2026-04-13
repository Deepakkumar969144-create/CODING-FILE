package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class numberofvaluecount {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = "dsuklfkdgenfdgjindnvsdgdgj";
    int count = 0;
    for( int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u' ){
            count ++;
            
        }
    }
     System.out.print("total count vowels count: " + count );
}
}
 
    

