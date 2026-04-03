package string;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String st = sc.nextLine();       // new khali box 
      System.out.println(st);         // print string 
      String t = sc.next();         // yah yek word ko leta hai but input gap aa haya to bah aage ki input nhi lega 
      System.out.println(t);

         //** */   // basic eeje for string - 
      String str = "chaitnaya and shruti";
      System.out.println(str.charAt(4));        // s[4] index 
      int n= str.length();  // STRING KI LENGTH 
    }
    
}
