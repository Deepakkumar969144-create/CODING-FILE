package taiyarijavaa.STACKS;
import java.util.*;

public class stockspanproblemnextgrea {

    static class pair {
        int val;
        int idx;

        pair(int val, int idx) {
            this.val = val;
            this.idx = idx;

        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 75, 85};
        for(int ele : arr ){
            System.out.print( ele + " ");

        }
        System.out.println();

        System.out.println("stockspan problem (next greater element wased:");
        stockspanproblemnextgrea obj = new stockspanproblemnextgrea();
        ArrayList<Integer> ans = obj.calculatespan(arr);

        System.out.println(ans);

    }

    public ArrayList<Integer> calculatespan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];

        span[0] = 1;

        Stack<pair> st = new Stack<>();
        st.push(new pair(arr[0], 0));

        for (int i = 1; i < n; i++) {

            while (st.size() > 0 && st.peek().val <= arr[i]) {
                st.pop();

            }

            if (st.size() == 0)
                span[i] = i -(-1);
            else
                span[i] = i - st.peek().idx;

            st.push(new pair(arr[i], i));

        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(span[i]);

        }
        return ans;

    }
}
