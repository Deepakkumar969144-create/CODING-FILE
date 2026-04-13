import java.util.Scanner;

public class gpfirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input");
        int n = sc.nextInt();
        int a=1,r=2;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a*=r;

        }
    }
    
}
//   gp 1, 2, 4, 8, 16, 32.... 