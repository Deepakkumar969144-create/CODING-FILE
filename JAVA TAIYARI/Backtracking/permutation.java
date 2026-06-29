package Backtracking;
import java.util.*;
public class permutation {
    public static void main(String[] args) {
        System.out.println("value of arrays : ");
        int[] arr = {1, 2, 3};
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println("value of permutation : ");
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);

    }
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        boolean[] check = new boolean[arr.length];
        permutations(arr, check, a, ans);
        return ans;

    }
    public static void permutations(int[] arr, boolean[] check, List<Integer> a, List<List<Integer>> ans) {
        if (a.size() == arr.length) {
            ans.add(new ArrayList<>(a));   // Deep Copy
            return;

        }
        for (int i = 0; i < arr.length; i++) {
            if (!check[i]) {
                check[i] = true;
                a.add(arr[i]);
                permutations(arr, check, a, ans);
                a.remove(a.size() - 1);
                check[i] = false;

            }
        }
    }
    
}