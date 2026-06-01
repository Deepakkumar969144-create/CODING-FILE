package taiyarijavaa.QUEUES;
import java.util.*;

public class firstnegativeineverywindowofsize {
    List<Integer> firsrstnegative(int arr[] , int k ){
        List <Integer > ans = new ArrayList<>();
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0 ;  i<n; i++){
            if(arr[i] < 0 ) q.add(i);

        }
        for(int i=0 ; i<n-k+1 ; i++ ){
            // remove elements out of window
            while (q.size() > 0 && q.peek() < i) {
                q.remove();

            }
            if(q.size() > 0  && q.peek() <= i+k-1)
            ans.add(arr[q.peek()]);
            else ans.add(0);
        
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[] = { -1, 2, -3, 4, -5, 6 };
        int k = 3;
        System.out.println("original array list: ");
        for(int ele : arr){
            System.out.print( ele + " ");
        }
        System.out.println();
        System.out.println("window size : " + k);

        firstnegativeineverywindowofsize obj = new firstnegativeineverywindowofsize();
        List<Integer> result = obj.firsrstnegative(arr, k);

        System.out.println("Result: " + result);

    }
    
}
