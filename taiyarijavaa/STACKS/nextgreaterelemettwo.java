package taiyarijavaa.STACKS;
import java.util.*;

public class nextgreaterelemettwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = { 1 , 8, 9, 5, 7, 1, 6, 4 };
        System.out.println("original array list: ");
        for( int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();
        
        nextgreaterelemettwo obj = new nextgreaterelemettwo();
        int[] result = obj.nextgreaterele(arr);
        System.out.println("NGE result:");
        System.out.println(Arrays.toString(result));

    }
    public int[] nextgreaterele( int[] arr ){
        int  n = arr.length;
        int [] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for( int i= n-1; i>= 0 ; i-- ){
            while (st.size() > 0 && arr[i] >= st.peek() ) {
                st.pop();
                
            }
            if(st.size() == 0 ) nge [i] = -1;
            else nge [i] = st.peek();
            st.push(arr[i] );

        }
        return nge ;

    } 
}
