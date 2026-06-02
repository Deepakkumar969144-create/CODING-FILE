
import java.util.Scanner;
public class strainghtline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coordinates of three points (x1, y1, x2, y2, x3, y3): ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double a= y2-y1;
        double b= x2-x1;
        double c= y3-y2;
        double d= x3-x2;

       double m1=a/b;
       double m2=c/d;
       if(m1==m2){
        System.out.println("the three points lie on a single line ");
        
       }
       else{
        System.out.println("they do not lie on a single line ");

       }
    }
}



