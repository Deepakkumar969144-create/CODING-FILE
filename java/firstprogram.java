

import java.util.Scanner;

public class firstprogram {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter radius: ");
        double r= sc.nextDouble();
        double a = 3.14 * r*r ;
        System.out.println("area is : ");
        System.out.println(a );

    }
}