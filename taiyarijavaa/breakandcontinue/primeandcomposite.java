// break & continue - is used to skip intration  
// break - code break ho jayega 
// matlav loop yek bar chalega 

import java.util.Scanner;
public class primeandcomposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input ");
        int n = sc.nextInt();
        boolean flag = true;  // true means prime 
        for(int i=2; i<=Math.sqrt(n); i++){  //  n ka square root dega
            if(n%i==0){  //  i to n ka ek factor nikla 
                flag = false; 
                break;

            }
        }

        if( n==1){
            System.out.println("neither prime nor composite");}
        else if(flag == false ){
            System.out.println("composite");}  //  jo dusre number se divide ho 
            else 
                System.out.println("prime");  //  jo khud ka factor ho 

        }
        }

//         //  continue - 
// import java.util.Scanner;
// public class primeandcomposite {
//        public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter input ");
//             int n = sc.nextInt();
//             for(int i=1; i<=20; i++){
//                 System.out.println(i);
//                 if(i== 13) continue ;   //  ignor - 13 par good morning nhi likha ayega 
//                System.out.println("good morning");
//             }
//         }
//     }
    
