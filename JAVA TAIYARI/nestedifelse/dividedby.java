
//  nested if else multiple conditions cheack karna 
//  aagar ik condition true ho tab uske andar ik aur condition cheack karta hai 

import java.util.Scanner;
public class dividedby {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        // nested if else 
        if( n%15!=0 && (n%5==0 || n%3== 0 )){
            System.out.println("number is divided by 3 and 5 , not by 15");

        }
        else {
            System.out.println(" number is not matched");

        }
    }
}
