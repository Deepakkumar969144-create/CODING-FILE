package taiyarijavaa.QUEUES;
import java.util.*;

public class basicks {
    public static void main(String[] args) {

                 // add , remove , peek , size -
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q); // nakli printing 
        System.out.println( q + " " + q.peek());
        q.remove();
        System.out.println(q + " " + q.size());
        System.out.println(q.remove() + " " +q);
        
    }
}
