package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class immuysbilitycompaire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = "Rghav"; // string str1  me a nhi hai esliye false aa raha hai 
        String str2 = "Raghav";
        System.out.println(str1 == str2); // string str1 aur str2 ke reference ko compare karta hai 
                // output false aayega kyuki dono alag alag reference hai
        
        String str3 = new String( " Raghav");
        String str4  = new String( " Raghav");
        System.out.println(str3.equals(str4)); // string str3 aur str4 ke value ko compare karta hai 
                // output true aayega kyuki dono string ke value same hai
     
    }
}
