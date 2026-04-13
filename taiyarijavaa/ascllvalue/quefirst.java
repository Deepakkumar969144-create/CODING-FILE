import java.util.Scanner;

public class quefirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("given a= b , b= 6.6 , enter n value b/a+2*n: ");

        int n = sc.nextInt();
        
        double a;
        double b;
        double x;

        b= 6.6;
         a= b;
         x= b/a+2*n;
         System.out.println(x);

    }
}
