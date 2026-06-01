import java.util.Scanner;


class starplashsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input: "); // input odd number le to achha pattern print hoga 
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n/2+1) || j == (n/2+1))
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println(); // move to next line after each row
        }
    }
}