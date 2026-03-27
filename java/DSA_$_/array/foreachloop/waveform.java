package foreachloop;
import java.util.Scanner;
public class waveform {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arrp = { 3, 2, 5, 6, 4, 7,1,9 };
        System.out.println("Original element in Array:");
        for (int ele : arrp) {
            System.out.print(ele + " ");
            
        }
        System.out.println();
        converttowave(arrp);
        System.out.println("\n wave form : ");
        for( int ele: arrp){
            System.out.print(ele + " ");
        }
    
}
static void converttowave( int [] arrp){
    for(int i=1 ; i< arrp.length; i += 2){
        int temp = arrp[i];
        arrp[i] = arrp[i- 1];
        arrp[i-1] = temp ; 
    }
}
}
