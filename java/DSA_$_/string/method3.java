package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class method3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         // ** */   // substring to string - 

        String str = "jaishankar";
        System.out.println(str.substring(0)); // string str ke index 0 se end tak ka substring deta hai output puri string aayegi
        System.out.println(str.substring(4)); // string str ke index 4 se end tak ka substring deta hai output shankar aayegi
        System.out.println(str.substring(1,5)); // string str ke index 1 se 5 tak ka substring deta hai output aish aayegi
    }
    
}
