
import java.util.Scanner;
public class Digitnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 100 && n <= 999) {
            System.out.println("This is a 3-digit number.");
        } else {
            System.out.println("This is NOT a 3-digit number.");
        }

        sc.close();
    }
}
