package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class allsubstringprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str = "gopi";

for(int i = 0; i < str.length(); i++){
    for(int j = i; j < str.length(); j++){
        System.out.println(str.substring(i, j+1));
    }

}
System.out.println();
str = str.substring(0,3) + 'm' + str.substring(4); 
System.out.println(str);
// // string str ke index 0 se 3 tak ka substring deta hai aur uske baad m add karta hai
// aur uske baad string str ke index 4 se end tak ka substring deta hai output gopm aayegi

    }
    
}
