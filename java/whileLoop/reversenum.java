import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
        while(n!=0){
            r*=10;
            r+=(n%10);
            n/=10;

        }
        System.out.println(r);
    }
    
}
