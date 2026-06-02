package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class rightviewofbinarytree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);

        a.left = b; a.right = c ;
        b.left = d; b.right = e;

        System.out.println("binary tree is : ");
        print(a);
        System.out.println();

        System.out.println("right view of binary tree is :");
        rightviewofbinarytree obj = new rightviewofbinarytree();
        ArrayList<Integer> ans = obj.rightview(a);

        for(int x : ans ){
            System.out.print( x + "  ");

        }

    }
    private static void print(node root){
        if( root == null ) return;
        System.out.print(root.val + " " );
        print(root.left);
        print(root.right);

    }
    ArrayList < Integer> rightview(node root ) {
        ArrayList < Integer> ans = new ArrayList<>();
        view(root , 0 , ans);
        return ans ;

    }
    private static void view ( node root , int level , ArrayList<Integer> ans){
        if(root == null) return;
        if(level == ans.size()) ans.add(root.val );
        else ans.set(level, root.val );
        view(root.left, level + 1 , ans);
        view(root.right, level +1 , ans);

    }
    
}
