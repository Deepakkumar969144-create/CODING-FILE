package taiyarijavaa.QUEUES;
import java.util.*;

public class traversingaqueues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50); 
        System.out.println(q);

            // traversing queue - 
        int n = q.size();
        for( int i =1; i<= n; i++ ){
            System.out.println(q.peek());
            q.add(q.remove());

        } 
        System.out.println(q);
    }
    
}
