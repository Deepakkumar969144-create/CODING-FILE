package foreachloop;
import java.util.Scanner;
public class foreachloopp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array element ");
        int [] arr= { 4,5,2, 6,7,9};
        for ( int ele: arr){
            System.out.print(ele+ " ");
        }
    } 
}
            //  for each loop - used to travese data structures. " can not modify array element." 