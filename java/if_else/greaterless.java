import java.util.Scanner;
public class greaterless {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b = sc.nextInt();
        System.out.println(" enter the third number : ");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("is the first number is greater" +a);

        }
        if(b>a && b>c){
            System.out.println(" is the second number is greater" +b);

        }
        if (c>a && c>b){
            System.out.println(" is the third number is greater " +c);
            
        }
        
    }
}