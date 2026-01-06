import java.util.Scanner;

public class threepositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr first num: ");
        int a = sc.nextInt();
        System.out.println("enter second num: ");
        int b = sc.nextInt();
        System.out.println("enter third num : ");
        int c = sc.nextInt();
        // nested if else
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest ");
            }
            else{
                System.out.println(c+" is greatest");

            }
        }
        // nested else if 
        else{
            if(b>c){
              System.out.println(b+" is greatest ");

            }
            else{
                System.out.println(c+" is greatest ");
            }
        }
    }
}