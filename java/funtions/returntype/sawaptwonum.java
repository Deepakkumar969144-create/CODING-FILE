import java.util.Scanner;

public class sawaptwonum {
    public static void swap( int a , int b ) {
        int temp = a;
        a=b; 
        b=a;
        temp = a;             //   swap nhi ho raha es code me kuchh kami hai use sahi karo or update karo 
        b= temp ;
  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entern first num : ");
        int a = sc.nextInt();
        System.out.println("enter secend num : ");
        int b = sc.nextInt();

        System.out.println(( a+ " " +b ));
        swap( a , b );
        System.out.println( a+ " " +b );

    }
}
