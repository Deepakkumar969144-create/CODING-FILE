package taiyarijavaa.STACKS;
import java.util.*;

public class parentheseschecker {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression in [{()}] : "); // user se input lena 
        String s = sc.nextLine();

        boolean result = isbalanced(s); // call karna 

        if(result) System.out.println("Balanced"); //outptu
        else System.out.println("Not Balanced");

    }

    static boolean isbalanced( String s ){
        Stack<Character> st = new Stack<>();

        for( int i =0 ; i<s.length(); i++ ){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{' ) st.push(ch);
            else{ // ch closing bracket hua to 
                if( st.size() == 0 ) return false;
                char top = st.peek();
                
                if(samestyle(top , ch )) st.pop();
                else return false;

            }
        }
        return ( st.size()==0 );

    }
    static boolean samestyle( char a , char b ){
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if( a== '{' && b == '}') return true;
        return false ;

    }
    
}
