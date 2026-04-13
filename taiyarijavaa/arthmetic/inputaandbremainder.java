

import java.util.Scanner;
public class inputaandbremainder {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("entr the divided: ");
    int a = sc.nextInt();
    System.out.println( " ENTER THE DIVISOR: ");
    int b= sc.nextInt();
    int c= a%b;
    // int r = a- (b*c);
    System.out.println(" THE REMAINDER WHEN " + a + " IS DIVIDED BY " + b + " = " + c);
   }
}
