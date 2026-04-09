package recursion;

import java.util.Scanner;
import java.util.*;

public class LCMoftwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print(" enter secend number :");
        int b = sc.nextInt();
        int result = lcm(a, b);
        System.out.println("final LCM ans : " + result);

    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);

    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }
}
