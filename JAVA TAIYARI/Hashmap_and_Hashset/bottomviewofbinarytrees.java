package Hashmap_and_Hashset;
import java.util.*;

public class bottomviewofbinarytrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(60);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        System.out.println("binary trees : ");
        print(a);
        System.out.println();
        System.out.println("bottom view of binary trees : ");
        System.out.println(bottomview(a));

    }
    public static void print(node root ){
        if( root == null ) return ;
        System.out.print( root.data + " " );
        print(root.left);
        print(root.right);

    }
    public static ArrayList<Integer>bottomview(node root){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap < Integer , Integer > map = new HashMap<>();
        Queue<node > q = new LinkedList<>();
        q.add(root);
        root.hd = 0 ;
        int mindist = Integer.MAX_VALUE;
        int maxdist = Integer.MIN_VALUE;
        while (q.size() > 0 ) {
            node temp = q.remove();
            int dist = temp.hd;
            mindist = Math.min(dist, mindist);
            maxdist = Math.max(dist, maxdist);
            map.put(dist, temp.data);
            if(temp.left != null ){
                temp.left.hd = dist - 1;
                q.add(temp.left);

            }
            if(temp.right != null ){
                temp.right.hd = dist + 1;
                q.add(temp.right);

            }
        }
        for(int i = mindist ; i<= maxdist; i++){
            ans.add(map.get(i));

        }
        return ans;

    }
    
}
