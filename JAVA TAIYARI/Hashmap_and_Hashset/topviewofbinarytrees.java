package Hashmap_and_Hashset;
import java.util.*;

public class topviewofbinarytrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(40);
        node b = new node(20);
        node c = new node(100);
        node d = new node(10);
        node e = new node(30);
        a.left= b; a.right = c;
        b.left = d; b.right = e;
        System.out.println("binary trees : ");
        print(a);
        System.out.println();
        System.out.println("top view of binary tree : ");
        System.out.println(topview(a));

    }
    public static void print (node root ){
        if(root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    static class node {
        int data ;
        node left ;
        node right;
        node ( int data ){
            this.data = data;

        }
    }
    static class  pair {
        node node;
        int dist;
        pair(node node , int dist){
            this.node = node;
            this.dist = dist;

        }
    }
    public static ArrayList<Integer> topview(node root ){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap < Integer , Integer > map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        int mindist = Integer.MAX_VALUE;
        int maxdist = Integer.MIN_VALUE;
        while (q.size() > 0 ) {
            pair front = q.remove();
            node temp = front.node;
            int dist = front.dist;
            mindist = Math.min(dist, mindist);
            maxdist = Math.max(dist, maxdist);
            if(!map.containsKey(dist)  ){
                map.put(dist, temp.data);

            }
            if(temp.left != null ){
                q.add(new pair(temp.left, dist - 1 ));

            }
            if(temp.right != null ){
                q.add(new pair(temp.right, dist + 1 ));

            }
        }
        for(int i = mindist; i<= maxdist ; i++ ){
            ans.add(map.get(i));

        }
        return ans;

    }
    
}
