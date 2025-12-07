import java.util.Scanner;
public class lossprofit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price : ");
        int cp = sc.nextInt();
        System.out.println(" enter selling price : ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("you gained a profit ");
            System.out.println(" amoutn of profit is: " +(sp-cp));

        }
        if (cp>sp){
            System.out.println("you loss ");
            System.out.println(" amount of loss : " +(cp-sp ));

        }
        if(cp==sp) {
            System.out.println("no profit no loss ");
        } 
    }
}
