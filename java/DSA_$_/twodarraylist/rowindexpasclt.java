package twodarraylist;

import java.util.*;

public class rowindexpasclt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter array row index: ");
        int rowIndex = sc.nextInt();

        
        System.out.println("pascal triangle row element :\n " + getrow(rowIndex)); // function call

    }

    public static List<Integer> getrow(int rowIndex) {
        int n = rowIndex + 1;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    list.add(val);
                }
            }
            ans.add(list);
        }
        return ans.get(rowIndex);
    }
} // timecomplexity = O(n^2)