import java.util.Scanner;
public class areacircle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the circle radius : ");
        double radius;
         radius= sc.nextDouble();
        double pi = 3.14;
        double area= radius*radius*pi;

        System.out.println("area of circle is : " +area);
            
    }
}
