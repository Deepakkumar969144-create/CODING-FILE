package taiyarijavaa.HEAPS;
import java.util.*;

public class topkfrequentelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        System.out.println("array element : ");
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println();
        int k = 4;
        System.out.println("k = " + k);

        topkfrequentelement obj = new topkfrequentelement();
        ArrayList<Integer> ans = obj.topkfrequentele(arr, k);

        System.out.println("top k frequent element : ");
        System.out.println(ans);

    }
    static class pair implements Comparable<pair> {
        int ele;
        int freq;
        pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;

        }
        public int compareTo(pair p) {
            if (this.freq == p.freq)
                return this.ele - p.ele;
            return this.freq - p.freq;

        }
    }
    public ArrayList<Integer> topkfrequentele(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);

        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);
            pq.add(new pair(ele, freq));
            if (pq.size() > k)
                pq.remove();

        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (pq.size() > 0) {
            pair top = pq.remove();
            ans.add(top.ele);

        }
        Collections.reverse(ans);
        return ans;

    }
    
}