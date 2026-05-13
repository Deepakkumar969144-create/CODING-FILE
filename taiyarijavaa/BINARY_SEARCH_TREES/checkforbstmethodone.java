package taiyarijavaa.BINARY_SEARCH_TREES;
import java.util.Scanner;

import java.util.*;

public class checkforbstmethodone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(2);
        node b = new node(1);
        node c = new node(3);
        node d = new node(5);

        a.left = b;
        a.right = c;
        c.right = d;

        System.out.println("binary search trees ; ");
        print(a);
        System.out.println();

        System.out.println(isbst(a));

    }
    private static void print( node root ){
        if( root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    public static class twin{
        int max;
        int min;
        twin (int max , int min ){
            this.max = max;
            this.min = min;

        }
    }
    static boolean flag;
    private static boolean isbst(node root ){
        flag = true;
        maxmin(root);
        return flag;

    }
    private static twin maxmin(node root ){
        if(root == null ) return new twin(Integer.MIN_VALUE, Integer.MAX_VALUE);
        twin left = maxmin(root.left);
        twin righ = maxmin(root.right);
        int max = Math.max(root.data, Math.max(left.max, righ.max));
        int min = Math.min(root.data , Math.min(left.min, righ.min));
        if(root .data < left.max ) flag = false;
        if(root.data > righ.min) flag = flag;
        return new twin(max, min);

    }
    
}
