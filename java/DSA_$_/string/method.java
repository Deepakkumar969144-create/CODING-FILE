package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //** */   // bulting in method  -
        String str = "Raghav garg ";
        System.out.println(str.indexOf('R'));   // index of first occurrence of r
        System.out.println(str.lastIndexOf('r'));   // index of last occurrence of r
        System.out.println(str.lastIndexOf('Y'));  // index of last occurrence of y but
                // aagar nhi hota to -1 return karta hai
        System.out.println(str.toUpperCase());      // string ko upper case me convert karta hai
                // mtlab capital letter me convert karta hai
        System.out.println(str.toLowerCase());      // string ko lower case me convert karta hai
                // mtlab small letter me convert karta hai

        //** */   // return true or false -

     String s = "harshita ";
     System.out.println(s.contains("harsh"));   // string me harsh word hai ya nhi output true or false me deta hai
     if(s.contains("arsh")){  // string me arsh word hai ya nhi output true or false me deta hai
        System.out.println("happy ");    

        System.out.println(s.startsWith("arsh"));     // string arsh se start ho rahi hai ya nhi output false 

     }
String a = "raghav";
String b = "pareet";
System.out.println(a.compareTo(b));  // string a aur b ko compare karta hai output positive negative ya zero deta hai
                // agar a b se bada hai to positive deta hai
                // agar a b se chota hai to negative deta hai
                // agar a b ke barabar hai to zero deta hai
                // lexicographical order me compare karta hai(shabdo ke hisab se)

    //** */   // change the string -
    
}
}
