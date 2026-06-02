package BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class pathsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              node a = new node(5);
        node b = new node(4);
        node c = new node(-3);
        node d = new node(8);
        node e = new node(-2);
        node f = new node(1);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println("binary trees");
        print(a);
        System.out.println();

        int target = 17;
        
        System.out.println("Path sum exists: ");
        pathsumm(a, target);
        print(a);

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);

    }
    public static boolean pathsumm(node root , int targetsum ){
        if(root == null ){
            if(targetsum == 0 ) return true;
            else return false;

        }
        return pathsumm(root.left, targetsum - root.val ) || pathsumm(root.right , targetsum - root.val);
        
    }

}
