import java.util.Scanner;
public class divisiblebyfive {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numver : ");
        int n = sc.nextInt();
        if (n%5 == 0 )
        {
            System.out.println(" th number is divisible by 5:");
        
        }
        else {
            System.out.println(" the numver is not divisoble by five");

        }
    }
}
