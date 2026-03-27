package foreachloop;
import java.util.Scanner;
public class misingarray {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arrp = { 3, 2, 5, 6, 4, 7,1,9 };
        System.out.println("Original element in Array:");
        for (int ele : arrp) {
            System.out.print(ele + " ");
            
        }
        System.out.println();
      int missing = missingnub(arrp);
      System.out.print("missing elemnent ");
      System.out.println(missing);
    
}
static int missingnub (int arrp[] ) {
    long n = arrp.length+1;
    long sum = n *(n+1)/2;
    long arraysum =0;
    for( int ele: arrp){
        arraysum += ele; 
    }
    return (int ) ( sum - arraysum);

}
}
