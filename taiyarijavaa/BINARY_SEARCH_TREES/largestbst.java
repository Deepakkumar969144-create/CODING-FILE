package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;
import java.util.*;

public class largestbst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(20);
        node b = new node(8);
        node c = new node(22);
        node d = new node(4);
        node e = new node(12);
        node f = new node(10);
        node g = new node(14);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = f; e.right = g;

        node p = b;
        node q = g;

        System.out.println("binary search trees; ");
        print(a);
        System.out.println();

        tripletcheckbst obj = new tripletcheckbst();
        System.out.println("validate bst : ");
        System.out.println(obj.isbst(a) );

    }
    private static void print(node root ){
        if(root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    class triplet {
        int max ;
        int min;
        boolean isbst;
        triplet ( int max , int min , boolean isbst){
            this.max = max;
            this.min = min;
            this.isbst = isbst;

        }  
    }
    boolean isbst(node root){
        return maxmin(root).isbst;

    }
    triplet maxmin(node root){
        if(root == null ) return new triplet(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        triplet lst = maxmin(root.left);
        triplet rst = maxmin(root.right);
        int max = Math.max(root.data, Math.max(lst.max, rst.max));
        int min = Math.min(root.data, Math.min(lst.min, rst.min));
        boolean isbst = lst.isbst && rst.isbst && (lst.max < root.data ) && (rst.min > root.data);
        return new triplet(max, min, isbst);

    }

}
