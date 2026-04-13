import java.util.Scanner;

public class persentagee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the persantage :  ");
        int n = sc.nextInt();
        if(n>90){
            System.out.println("excellent");
        }
        else if(n>80){
            System.out.println("good");

        }
        else if (n>70){
            System.out.println("good:");

        }
        else if(n>60){
            System.out.println("can do batter ");

        }
        else if (n>50){
            System.out.println("need to improve");

        }
        
        else if (n>40 ){
            System.out.println(" average");

        }
        else if (n>=35){
            System.out.println("just passed");

        }
        else {
            System.out.println("faild");
       
        }
    }
}
