
import java.util.Scanner; // corrected the import statement


public class sumoftwono {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); // corrected the Scanner initialization
       
        System.out.println("entere first number : ");
         int x = sc.nextInt();
         System.out.println(" enter second numver : ");
         int y = sc.nextInt();
         int sum = x+y;
         System.out.println(" the sum of two number is : " +sum );
  
    }
}
