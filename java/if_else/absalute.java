import java.util.Scanner;
public class absalute{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any integer : ");
        int n = sc.nextInt();
        if(n<0){
            n= n*(-1);

        }
        System.out.println(" the avsolute value is : " +n);
        
    }
}
