import java.util.Scanner;

public class passvalueandreference {
    public static void change(int x ) {
        x= 10;

    }
    public static void main(String[] args) {
        int x = 5; 
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
    
}
