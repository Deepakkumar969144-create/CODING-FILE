package string;
import java.util.Scanner;
import java.util.*;

public class reversestringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Devesh";
        StringBuilder sb = new StringBuilder(str1);
         // string str ko stringbuilder me convert karta hai output me deta hai
             // sb.reverse(); 
        int i= 0 , j= sb.length()-1;
        while( i<= j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);  
            sb.setCharAt(j, temp2);
            sb.setCharAt(i, temp1);
                //charAt() → character read karta hai
               // setCharAt() → character replace karta hai
            // Dono milke → swapping / modifying string easily
            
            i++;
            j--; 
        }         
        System.out.println(sb);   

        sb.deleteCharAt(1);      // stringbuilder sb ke index 1 par jo character hai 
                            //usko delete karta hai output me deta hai
        sb.insert(1, 'e' );  // stringbuilder sb ke index 1 par character 'e' insert karta hai 
        sb.delete(3, 6);    // stringbuilder sb ke index 3 se index 6 tak jo character hai
                            // usko delete karta hai output me deta hai
        System.out.println(sb);       

        String str2 = "Aditya ";
        StringBuilder sb1 = new StringBuilder(str2);     // string str2 ko stringbuilder sb1 me convert karta hai 
        sb1.reverse();                                   // stringbuilder sb1 ko reverse karta hai output me deta hai                        
        String str3 = sb1.toString();                   // stringbuilder sb1 ko string str3 me convert karta hai output me deta hai
        System.out.println(str3);

    }
   
}
    // StringBuilder = fast + editable string - mtlab striing ko modify karta hai taki string thik  se edit ho sake 
    