package taiyarijavaa.STACKS;
import java.util.*;

public class removealladjacentduplicatesastring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "aaabbcbdcceef";
        System.out.print("original string : ");
        System.out.println(str);
        System.out.println();

        Stack<Character> st = new Stack<>();

        for( int i =0; i<str.length(); i++ ){
            char ch = str.charAt(i);

            if(st.size() ==0 || st.peek() != ch){
                st.push(ch);

            }
            else{
                st.pop(); // REMOVE KARNA 

            }
        }

    StringBuilder sb = new StringBuilder(); // STACK TO STRING CONVERT
    for( char ch : st){
        sb.append(ch)   ;
        
    }
    System.out.println("remove all adjacent duplicate in a string : " + sb.toString());
    System.out.println();

    }
}