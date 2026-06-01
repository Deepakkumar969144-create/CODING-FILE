
import java.util.Scanner;
public class dividebyfivethree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("the number is divided by 5 and 3:");

        }
        else{
            System.out.println(" the divide by not ");
            
        }
    }

}
