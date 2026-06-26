package Binary_Search_On_Ans;
import java.util.Scanner;
import java.util.*;

public class basix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // tamplate code with binary search - 
        int lo = minimumAnswer;
        int hi = maximumAnswer;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid)){
                ans = mid;
                hi = mid-1;

            }
            else{
                lo = mid+1;

            }
        }
        return ans;
    }
    // hum element nahi , ans dhoondhte hai 
    // example - max speed ? 
    // max distence ? 
    // min pages ? 
}
