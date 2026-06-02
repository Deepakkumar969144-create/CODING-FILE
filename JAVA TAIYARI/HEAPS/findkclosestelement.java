package HEAPS;
import java.util.*;

public class findkclosestelement {
    public static class pair implements Comparable<pair>{
        int diff;
        int val;
        pair(int diff , int val){
            this.diff = diff;
            this.val = val;

        }
        public int compareTo(pair p){
            return p.diff - this.diff;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,1,4,3,2,8,6,7};
        int ele = 5;
        int k = 5;
        System.out.println("array element : ");
        for(int e : arr){
            System.out.print(e + " ");

        }
        System.out.println();
        System.out.println("element : " + ele);
        System.out.println("k = " + k);
        System.out.println("k closest element : ");
        findkclosestelement obj = new findkclosestelement();
        ArrayList<Integer> ans = obj.kclosest(arr , ele , k);
        for(int e : ans){
            System.out.print(e + " ");

        }

    }
    public ArrayList<Integer> kclosest(int [] arr , int ele , int k){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int val : arr){
            int diff = Math.abs(val - ele);
            pq.add(new pair(diff , val));
            if(pq.size() > k){
                pq.remove();

            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size() > 0){
            ans.add(pq.remove().val);

        }
        Collections.sort(ans);
        return ans;

    }

}