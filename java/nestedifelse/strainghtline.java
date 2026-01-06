
import java.util.Scanner;
public class strainghtline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double x1,x2, x3,  y1,y2,y3;
    
       double m1=(y2-y1)/(x2-x1);
       double m2=(y3-y2)/(x3-x2);
       if(m1==m2){
        System.out.println("the three points lie on a single line ");
        
       }
       else{
        System.out.println("they do not lie on a single line ");

       }
    }
}



