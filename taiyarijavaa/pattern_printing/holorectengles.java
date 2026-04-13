
import java.util.Scanner;
public class holorectengles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter input: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n)
                System.out.print("*" );
                else 
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
              //       same code but thode thik se -


// import java.util.Scanner;

// public class holorectengles {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter rows and columns: ");

//         int m = sc.nextInt(); // rows
//         int n = sc.nextInt(); // columns

//         for(int i = 1; i <= m; i++){
//             for(int j = 1; j <= n; j++){

//                 if(i == 1 || i == m || j == 1 || j == n)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");

//             }
//             System.out.println();
//         }
//     }
// }