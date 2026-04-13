import java.util.Scanner;

public class parmationandcombination {
    public static int fact(int x) {
        int f=1; 
        for( int i=1; i<=x; i++ ){
            f *= i; 
        }
        return f;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num: ");
        int n = sc.nextInt();
        System.out.println("enter secend num: ");
        int r = sc.nextInt();

        int ncr= fact(n)/(fact(n-r));           // parmation 
        int npr = fact (n)/ fact(n-r);          // combination 
        
        System.out.println(" parmation and combination ");
        System.out.println(ncr + " & " + npr );
    }
    
}
