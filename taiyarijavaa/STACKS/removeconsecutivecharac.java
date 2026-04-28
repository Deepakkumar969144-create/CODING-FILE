package taiyarijavaa.STACKS;
import java.util.Scanner;
import java.util.*;


public class removeconsecutivecharac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "aaaabbcccdaa";
        System.out.print("original string : ");
        System.out.println(s);
        System.out.println();
        
        Stack<Character> st = new Stack<>();
        for( int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( st.size() == 0 || st.peek() != ch){
                st.push(ch);

            }
        }
        
        StringBuilder sb  = new StringBuilder();
        for ( char ch : st ) {
            sb.append(ch);

        }
        System.out.println("remove consecutive characters : " + sb.toString());

    }    
}
