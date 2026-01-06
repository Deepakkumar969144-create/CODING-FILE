
import java.util.Scanner;
public class sidetriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side: ");
        int a = sc.nextInt();
        System.out.println("enter second side : ");
        int b = sc.nextInt();
        System.out.println("entr third side: ");
        int c = sc.nextInt();
        if( a+b>c&& b+c>a&& c+a>b){
            System.out.println("triangle is valid");

        }
        else{
            System.out.println("triangle is not valid");
            
        }
    }
}
