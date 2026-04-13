package recursion;
import java.util.Scanner;
import java.util.*;

public class uniquepaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter number first :  ");
        int a = sc.nextInt();
        System.out.print("entre secend number : ");
        int b = sc.nextInt();
        // int  result = uniquepaths(a, b);
        int result = uniquepaths(a, b);
        System.out.println(" unique paths : " + result);
        
   }

//     public static int uniquepaths( int a , int b ){
//         if( a == 1 || b ==1 ) return 1;
//         return uniquepaths(a - 1 , b) + uniquepaths(a , b-1);

//     }
// }

            //      method 2 - 
   public static int uniquepaths( int a , int b ){
    return paths( 0,0, a-1 , b -1 );
}
public static int paths( int cr , int cc , int lr , int lc){
    if( cr == lr && cc == lc ) return 1;
    if( cr> lr || cc> lc ) return 0; /// IMP.
    int right = paths(cr, cc+1, lr, lc);
    int down = paths(cr+1, cc, lr, lc);
    return right + down;
}

        // method 3 -
        public static int uniqurepaths( int a , int b){
            if( a == 1 && b == 1) return 1;
            if( a == 0 || b == 0 ) return 0 ; // IMP. 
             return uniquepaths(a, b-1) + uniquepaths(a-1, b);
        }
}
