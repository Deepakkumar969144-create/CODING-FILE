import java.util.Scanner;
public class diamand {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input  : ");
        int n = sc.nextInt();
        
                                                // Upper half of diamond
        for(int i=1; i<=n; i++){
                                            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
                                             // Print stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
                                         // Lower half of diamond
        for(int i=n-1; i>=1; i--){
                                        // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
                                             // Print stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

                //  pyramid pattern 


    //    Scanner sc=new Scanner(System.in);
    //     System.out.println("enter input  : ");
    //     int n = sc.nextInt();
//         int nsp = n-1; 
//         int nst = 1; 
        
//                                                 // Upper half of diamond
//         for(int i=1; i<=n; i++){
//                                             // Print spaces
//             for(int j=1; j<=nsp; j++){
//                 System.out.print("  ");
//             }
//                                              // Print stars
//             for(int j=1; j<=nst; j++){
//                 System.out.print("* ");
//             }
//             nsp--;nst +=2;

//             System.out.println();
//         }
//         nsp = 1;
//         nst = 2*n-3; 

//                                          // Lower half of diamond
//         for(int i=n; i<=n-1; i++){
//                                         // Print spaces
//             for(int j=1; j<=nsp; j++){
//                 System.out.print("  ");
//             }

//                                              // Print stars
//             for(int j=1; j<=nst; j++){
//                 System.out.print("* ");
//             }
//             nsp++; 
//             nst -=2; 
//             System.out.println();
//         }
//     }
// }
