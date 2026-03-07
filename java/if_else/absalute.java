import java.util.Scanner;
public class absalute{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any integer : ");
        int n = sc.nextInt();
        if(n<0){
            n= n*(-1);

        }
        System.out.println(" the avsolute value is : " +n);
        
    }
}

        //  int and double comparison (==)-value chack karta hai data type nhi 

        
// int n= 10;
// if(n==10.0){
//     System.out.println("true ");

// }
// else{
//     System.out.println("false:");

// }
//     }
// }