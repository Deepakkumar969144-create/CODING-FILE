package taiyarijavaa.STACKS;
import java.util.*;

public class nextgreaterelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = {1,8,9,5,7,1,6, 4};
        System.out.println("original arr list : ");
        for (int ele : arr) { 
                    System.out.print(ele + " ");            // print result
        }
        System.out.println();

        nextgreaterelement obj = new nextgreaterelement();  // Java me non-static methods call karne ke liye object banana padta hai.
        ArrayList<Integer> result = obj.nextgreaterele(arr);  // . Method call kiya
        System.out.println("NGE result:");
        System.out.println(result);

    }

    public ArrayList < Integer > nextgreaterele(int [] arr ){
        int n = arr.length;
        int [] nge = new int[n];
        nge[n-1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);

        for(int i = n-2; i>=0 ; i-- ){
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();

            }
            if( st.size() == 0 ) nge [i] = -1;
            else nge [i] = st.peek();
            st.push(arr[i]);

        }
        ArrayList <Integer > ans = new ArrayList<>();
        for( int i = 0 ; i<n; i++ ){
            ans .add(nge[i]);

        }
        return ans;

    }
    
}
