package taiyarijavaa.STACKS;
import java.util.*;

public class largestrectangleinhistogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = { 5, 3, 6, 2, 5, 4, 1 };
        System.out.print("original array : ");
        for(int ele : arr){
            System.out.print( ele + " ");

        }
        System.out.println();

        System.out.print("largest rectangle in histogram : ");
        largestrectangleinhistogram obj = new largestrectangleinhistogram();
        int result = obj.largestrectanglearea(arr);
        System.out.println(result);
        
    }
    public int largestrectanglearea(int [] arr ){
        int n = arr.length;
        int [] nse = new int[n];
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i = n-2 ; i>0; i-- ){
            while (st.size() > 0 && arr[st.peek()] >= arr[i] ) {
                st.pop();
                
            }
            if(st.size() ==0 ) nse[i] = n ;
            else nse[i] = st.peek();
            st.push(i);

        }
        while (st.size() > 0 ) {
            st.pop();
            
        }
        int [] pse = new int[n];
        pse [0] = -1;
        st.push(0);
        for( int i=1; i<n ; i++ ) {
            while (st.size()>0 && arr[st.peek()] >= arr[i] ) {
                st.pop();
                
            }
            if(st.size() == 0 ) pse[i] = -1 ;
            else pse [i] = st.peek();
            st.push(i);

        }
        int maxarea = 0 ;
        for( int i =0 ; i<n; i++ ) {
            int area = arr[i] * (nse [i] - pse [i] -1 ); 
            maxarea = Math.max(maxarea, area);

        }
        return maxarea;

    }
}