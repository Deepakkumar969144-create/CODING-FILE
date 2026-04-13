package string;
import java.util.Scanner;
import java.util.*;

public class stringcompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String result = compressing(str);
        System.out.println("Compressed string: " + result);
        
    }
    public static String compressing( String str){
        StringBuilder ans = new StringBuilder();
        int i=0;
        while ( i< str.length() ) {
            char ch = str.charAt(i);
            int count =0;
            while ( i< str.length() && str.charAt(i) == ch){
                count ++ ;
                i++;

            }
            ans.append(ch);
            if( count >1){
                ans.append(count);

            }
    }
    return ans.toString();

}
    
}
