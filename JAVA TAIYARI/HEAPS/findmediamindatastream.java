package HEAPS;
import java.util.*;
public class findmediamindatastream {
  
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 4, 3, 8, 6, 4, 2, 7, 6 };
        System.out.println("array element : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
            
        }
        System.out.println();

        findmediamindatastream outer = new findmediamindatastream();
        mediamfinder obj = outer.new mediamfinder();
        System.out.println();

        System.out.println("median in data stream : ");
        for (int ele : arr) {
            obj.addnum(ele);
            System.out.println("after adding " + ele + " -> median = " + obj.findmediam());

        }

    }
    class mediamfinder{
        // we are creating a data stream 
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    public void addnum(int num ){
        if(maxheap.size() == 0 ) maxheap.add(num);
        else{
            if(num < maxheap .peek() ) maxheap.add(num);
            else minheap .add(num);
        
        }
        if(maxheap.size() == minheap.size() + 2 )
        minheap.add(maxheap.remove());
        if(minheap.size() == maxheap.size() + 2) 
        maxheap.add(minheap.remove());

    }
    public double findmediam(){
        if(maxheap.size() == minheap.size() + 1 ) 
        return maxheap.peek();
        else if( minheap.size() == maxheap.size() + 1 )
        return minheap.peek();
        else{
            return ( maxheap.peek() + minheap.peek() ) / 2.0;

        }
    }
}

}
