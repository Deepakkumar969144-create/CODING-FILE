package LinkedListtwo;
import java.util.Scanner;
import java.util.*;

class findtheminandmaxcriticalp{
    node head;
    node tail;
    int size;

    void addathead(int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
        size ++ ;

    }
    void addattail( int val ){
        node temp = new node(val);
        if( head == null ) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;

        }
        size++;

    }
    void display(){
        node temp = head;
        while (temp != null ) {
            System.out.print( temp.val + " ");
            temp = temp.next;
            
        }
        System.out.println();

    }
    public int[] nodesbetweencriticalpoint(node head ){
        int [] ans = { -1 , -1 };
        int idx = 1;
        int firstidx = -1;
        int lastidx = -1;

        int mindist = Integer.MAX_VALUE;
        node a = head;
        node b = a.next;
        node c = b.next;
        if( c == null ) return ans; // 2 size ki linked list 

        while (c != null ) {
            // cheak for critical point 
        if((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)){ 
        if(firstidx == -1) firstidx = idx;
        if(lastidx != -1) {
            int dist = idx - lastidx;
            mindist = Math.min(dist, mindist);

        }
        lastidx = idx; 

        }

        idx ++;
        a = a.next;
        b = b.next;
        c = c.next;

        }
        int maxdist = lastidx - firstidx;
        if( maxdist == 0 ) maxdist = -1;
        if( mindist == Integer.MAX_VALUE ) mindist = -1;
        
        ans [ 0] = mindist ;
        ans [ 1] = maxdist;
        return ans;

    }
}

public class findtheminiandmaxnumofnodebwcriticalpoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        findtheminandmaxcriticalp ll = new findtheminandmaxcriticalp();
        ll.addathead(5);
        ll.addattail(3);
        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(5);
        ll.addattail(1);
        ll.addattail(2);
        System.out.println("original linkedlist : ");
        ll.display();

        int[] res = ll.nodesbetweencriticalpoint(ll.head);

        System.out.println("min distance: " + res[0]);
        System.out.println("max distance: " + res[1]);

    }
    
}
