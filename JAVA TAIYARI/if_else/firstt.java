import java.util.Scanner;
public class firstt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        if (n%2 == 0 )
        {
            System.out.println("number is even");

        }
       // if( n%2 !=0){
           // System.out.println("number is odd ");

        //}
        else{
            System.out.println("number is odd");
    
        }
    }
} 
//  if if ki 2 ya 2 se jada bhi condition laga sakte hai 
//  if else bhi laga sakte hai 
// if ke sath else yek se java bar bhi laga sakte hai 
// if ko yek yua yek java bar bhi laga sakte hai 
// if me condition rakhte hai and else me wo rakhte hai jo if me condition nhi lagti to else la jat hai 
// aagar if ki condition true hoti hai to if ka code chalta hai
// aagar if ki condition false hoti hai to else ka code chalta hai

