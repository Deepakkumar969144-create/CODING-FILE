package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class numbercount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        String str = "" + n; // int n ko string me convert karta hai output me deta hai
        System.out.println(str.length());

        System.out.print("enter a decimal number : ");
        double m = sc.nextDouble();
        //  sc = Scanner object (jo user se input leta hai)
        // nextDouble() = user se decimal number (double type) input lene ke liye use hota hai
        // double m = ek variable banaya jisme value store hogi

        // Matlab kya hua?

        // User jo bhi decimal number input karega (jaise 3.14, 10.5), wo m me store ho jayega. 

        String str2= "" + m; // double m ko string me convert karta hai output me deta hai

        System.out.println("DIGIT IN DECIMAL NUMBER : ");
        System.out.print(str2.length()); // string str ki length print karta hai output me deta hai
    }
    
}
