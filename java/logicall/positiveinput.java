import java.util.Scanner;
public class positiveinput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("ent first num. : ");
        int a = sc.nextInt();
    //    System.out.println("enter second num: ");
        int b = sc.nextInt();
    //    System.out.println("enter third num: ");
        int c = sc.nextInt();
        if( a>0 && b>0 && c>0){
            System.out.println(" all num are positive");

        }
      
        if( a<0 && b<0 && c<0){
            System.out.println("all num is negative");

        }
    }
}