package taiyarijavaa.BIT_Manupulation;

import java.util.Scanner;
import java.util.*;

public class checkifKthbitissetornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number(ex - 10110111) : ");
        int n = sc.nextInt();

        System.out.print("enter Kth number(change number place ) : ");
        int k = sc.nextInt();

        boolean ans = checkkthbit(n, k);
        System.out.println("output : " + ans);

    }
    public static boolean checkkthbit(int n, int k) {
        return ((n >> k) % 2 == 1);

    }

}