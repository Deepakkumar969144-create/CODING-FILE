package foreachloop;
import java.util.Scanner;
public class segregate0sand1s {         //  2 pointer technique 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arrp = { 0, 1, 0,0, 1, 1, 0,1 };
        System.out.println("Original element in Array:");
        for (int ele : arrp) {
            System.out.print(ele + " ");
            
        }
        System.out.println();

        segregate0sto1s(arrp);                // 👈 function call

        System.out.println("\nAfter Segregation:");
        for (int ele : arrp) {                  // 👈 print result
            System.out.print(ele + " ");
        }
    }
    static void segregate0sto1s(int [] arrp){
        int n= arrp.length;
        int i=0 , j=n-  1;
        while ( i<j){
            if( arrp[i] == 0)
                i++;
        else if ( arrp[j] == 1)
                j--;
         else if ( arrp[i] == 1 && arrp[ j] == 0){   // swaping important 

                arrp[i] = 0;
                arrp[j] = 1;
                i++;
                j--;
         }
        
        }
    }
}
