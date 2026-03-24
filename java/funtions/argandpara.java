import java.util.Scanner;

public class argandpara {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        sum(n,m,o);                          // arguments

    }

public static void sum(int n , int m, int o ){   // parameters
    System.out.println(n+m+o);

}
}

          //  example of arguments and parameters in java functions.- 
  
//     public static void max( int a , int b, int c ){
//         if(a>=b&& a>=c){
//             System.out.println(a);
//         }
//         else if ( b>=a && b>=c){
//             System.out.println(b);
            
//     } 
//     else System.out.println(c);

// }     
// public static void main(String[] args) {
//     max(4,6,8);
// }
// }

         //  void vlaue return  nhi karnt  hai 