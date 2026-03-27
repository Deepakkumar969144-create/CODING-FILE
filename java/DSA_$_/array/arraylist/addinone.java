package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class addinone {

    public static void main(String[] args) {

        int[] arrp = {9, 9, 9};

        System.out.println("Original Array:");
        for (int ele : arrp) {
            System.out.print(ele + " ");
        }

        ArrayList<Integer> result = addOne(arrp);

        System.out.println("\nAfter Adding One:");
        System.out.println(result);
    }

    public static ArrayList<Integer> addOne(int[] arrp) {

        int n = arrp.length;
        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {

            int sum = arrp[i] + carry;

            if (sum <= 9) {
                ans.add(sum);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }

        if (carry == 1) {
            ans.add(1);
        }

        Collections.reverse(ans);   // ✅ correct

        return ans;
    }
}