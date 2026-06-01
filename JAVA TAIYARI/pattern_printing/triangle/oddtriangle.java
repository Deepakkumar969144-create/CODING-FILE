import java.util.Scanner;

public class oddtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input: ");
        int n = sc.nextInt();
        
        for(int i=1; i<n+2; i++){
            int a=1;

            for(int j=1; j<i; j++){
                System.out.print(a+" ");
                a+=2;
            }

            System.out.println();

        }
    }
    
}
