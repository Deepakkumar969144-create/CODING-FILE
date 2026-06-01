import java.util.Scanner;

public class apsecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter imput");
        int n = sc.nextInt();
        int a=4, d=6; 
        for(int i=1; i<=n; i++){
            System.out.println(a+" ");
            a=a+d;  // a+=d;
        }
        
    }
    
}
