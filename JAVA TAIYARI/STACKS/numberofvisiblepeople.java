package taiyarijavaa.STACKS;
import java.util.Scanner;
import java.util.*;

public class numberofvisiblepeople {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] high = {10, 6, 8, 5, 11, 9};
        System.out.println("original array (hight) : ");
        for(int ele : high){
            System.out.print( ele + " ");

        }
        System.out.println();

        System.out.println("number of visible people in a line: ");
        numberofvisiblepeople obj = new numberofvisiblepeople();
        int [] result = obj.canseepersonscount(high); // call 
        System.out.println(Arrays.toString(result)); // print 

    }
    public int[] canseepersonscount(int []arr ){
        int n = arr.length;
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1] );
        ans[n-1] =0;
        for(int i= n-2; i>=0 ; i--){
            int count = 0;
            while (st.size()>0 && st.peek() <= arr[i] ) {
                count++;
                st.pop();
                
            }
            if(st.size() > 0 ) count++ ; // imp
            ans[i] = count;
            st.push(arr[i]);

        }
        return ans;

    }
}
