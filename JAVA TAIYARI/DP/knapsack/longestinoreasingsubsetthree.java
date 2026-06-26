import java.util.*;

public class longestinoreasingsubsetthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter arrays size  : ");
        int  n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for(int i = 0 ; i<n; i++ ){
            arr[i] = sc.nextInt();

        }
        System.out.println("array element : ");
        for( int i = 0 ; i<n; i++ ){
            System.out.print( arr[i] + " ");

        
        }
        System.out.print( "longest increasing subsequence : ");
        System.out.println(lis(arr) );

    }
    public static int lis(int arr[] ){
        ArrayList < Integer > ans = new ArrayList<>();
        for( int ele : arr ){
            if(ans.size() == 0  || ele>ans.get(ans.size() - 1 ))
            ans.add(ele);
            else replace(ele , ans );

        }
        return ans.size();

    }
    public static void replace(int ele , ArrayList<Integer> ans){
        int lo = 0;
        int hi = ans.size()-1;
        int lb = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ans.get(mid)>=ele){
                lb = mid;
                hi = mid-1;

            }
            else{
                lo = mid+1;

            }
        }
        ans.set(lb,ele);

    }
}
