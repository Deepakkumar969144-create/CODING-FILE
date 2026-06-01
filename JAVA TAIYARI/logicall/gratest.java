
import java.util.Scanner;
public class gratest {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first num");
    int a = sc.nextInt();
    System.out.println(" enter second num");
    int b = sc.nextInt();
    System.out.println("enter third num");
    int c = sc.nextInt();
    if(a>=b && a>=c){
        System.out.println(a+" is greatest ");

    }
    else if(b>=a && b>=c){
        System.out.println(b+" is greatest ");
    }
    else{
        System.out.println(c+" is greatest ");
    }
}
    
}

// else if chain में एक बार matched condition के बाद बाकी skip हो जाते हैं
