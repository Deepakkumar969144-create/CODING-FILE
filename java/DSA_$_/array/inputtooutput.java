import java.util.Scanner;
public class inputtooutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] karan= new int[7];
        for(int i=0 ; i<karan.length; i++ ){
            karan[i] = sc.nextInt();     //  taking input from user
         }  
            

        for( int i=0; i< karan.length; i++){
            System.out.println(karan[i]+ " ");

        }
    }
}           //  user input and print output of array 




