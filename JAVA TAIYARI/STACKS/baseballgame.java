package taiyarijavaa.STACKS;
import java.util.Scanner;
import java.util.*;

public class baseballgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr = { "5", "2", "C", "D" , "+"};
        System.out.print("original intput :");
        System.out.println(Arrays.toString(arr));

        baseballgame obj = new baseballgame();
        int result = obj.calpoint(arr);
        System.out.println("total score : "+ result);


    }
    public int calpoint(String [] arr ){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for( int i = 0 ; i<n ; i++ ){
            String s = arr[i];
            if( s.equals("C" )) st.pop();
            else if ( s.equals("D" )) st.push(2*st.peek());
            else if( s.equals("+")) {
                int top = st.pop();
                int secendtop = st.peek();
                int sum = top + secendtop;
                st.push(top);
                st.push(sum);

            }
            else st. push(Integer.parseInt(s));

        }
        int sum = 0;
        while (st.size() > 0 ) {
            sum += st.pop();
            
        }
        return sum ; 

    }
}
