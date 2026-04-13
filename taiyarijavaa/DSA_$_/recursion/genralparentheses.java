package recursion;
import java.util.*;

public class genralparentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter input number : ");
        int n = sc.nextInt();
        System.out.println("generate parentheses : ");
        List<String> result = generateparentheses(n);
        System.out.println(result);     // print call result 

        // for(String str : result){    // print string
        //     System.out.println(str);
        // }

    }
    public static void generate( int n , int l , int r , String s , List<String>ans){
          if ( r == n) {  // base case 
            ans.add(s);
            return;
        }
        if( l<n ) generate(n, l+1, r, s+ "(" , ans );
        if( r<l ) generate(n, l, r+1 , s+ ")" , ans);

    }
    public static List< String > generateparentheses( int n ){
        List<String> ans = new ArrayList<>();
         generate(n, 0, 0, "", ans);
        //  System.out.println(ans);    // print generateparentheses( output )
        return ans ;
       
    }
}
