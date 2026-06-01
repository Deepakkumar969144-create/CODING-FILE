            //  linear search in array

import java.util.Scanner;
public class searchinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] arr= {12, 34, 56, 67, 78, 89, 45, 67, 35, 21 };
        for(int ele: arr){

            System.out.print(ele + " ");
            
        }
      
       System.out.println();
        
        System.out.print("searching for element :  ");   //  target ka mtlab hai jid number ko dhoondh rahe ho 
         int n = sc.nextInt();
        int target = n  ; 
        int found =-1 ;

        for (int i=0; i<arr.length; i++){
            if ( arr[i] == target){
                found = i;
                break; 
            
            }
        }

        if( found != -1){
            System.out.println(" target erist in array at index " + found );
           }
        else
             System.out.println(" targe missing in arrray" );
      }
    }
        
     

