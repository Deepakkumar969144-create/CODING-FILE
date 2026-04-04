package string;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "gitanjali";
        String str2 = "priya ";

        String a = str1.concat(str2); // string a aur b ko jodta hai output me deta hai
        // two string ko add karnta hai
        System.out.println(a);

        // esi ka ulternate shortcut
        String str = "bhakti ";
        str = str + " hi sakati hai ";
        System.out.println(str);
        // two word and sentence ko add karta hao concat ka shortcut hai but most
        // poweful hai

        String str3 = str1 + str2; // string str1 aur str2 ko jodta hai output me deta hai
        System.out.println(str3);

        String str4 = 10 + str1; // string str1 ke aage 10 add karta hai output me deta hai
        // agar number ko string ke aage add karte hai to number string me convert ho
        // jata hai aur dono ko jodta hai
        System.out.println(str4);
        System.out.println(10 + 20 + "rahgab "); // number ko string ke aage add karte hai to number string me convert
                                                 // ho jata hai aur dono ko jodta hai
        System.out.println(10 + "raghav " + 49); // number ko string ke aage add karte hai to number string me convert
                                                 // ho jata hai aur dono ko jodta hai

        // ** */ // int to string -
                // shortcut hai int ko string me convert karne ka
        int n = sc.nextInt();
        String str5 = Integer.toString(n); // int n ko string me convert karta hai output me deta hai
        System.out.println(str5);

        // ** */ // string to int -
         
        String str6 = "47563892";
        int m = Integer.parseInt(str6); // string str6 ko int me convert karta hai output me deta hai
        System.out.println(m);
        System.out.println(m+3);  // string str6 ko int me convert karta hai output me deta hai aur 3 add karta hai

        

    }

}
