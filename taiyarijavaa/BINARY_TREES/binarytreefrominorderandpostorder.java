package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class binarytreefrominorderandpostorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inorder[] = {4,8,2,5,1,6,3,7};
        int postorder[] = {8,4,5,2,6,7,3,1};

        System.out.println("inorder : ");
        for( int ele : inorder){
            System.out.print( ele + " ");

        }
        System.out.println();

        System.out.println("postorder : ");
        for(int ele : postorder){
            System.out.print( ele  + " ");

        }
        System.out.println();

        node root = buildtree(inorder , postorder);
        System.out.print("level order : ");
        levelorder(root);

    }
    public static node buildtree(int inorder[] , int postorder[]){
        int n = inorder.length;
        return build(0 , n-1 , 0 , n-1 , inorder , postorder);

    }
    public static node build(int inlo , int inhi , int postlo , int posthi , int inorder[] , int postorder[]){
        if(inlo > inhi || postlo > posthi){
            return null;

        }
        int val = postorder[posthi];
        node root = new node(val);
        int r = 0;

        // locating root in inorder
        for(int i = inlo ; i <= inhi ; i++){
            if(inorder[i] == val){
                r = i;
                break;

            }
        }
        int cnt = r - inlo; // number of elements in left subtree
        root.left = build(inlo , r - 1 , postlo , postlo + cnt - 1 , inorder , postorder);
        root.right = build(r + 1 , inhi , postlo + cnt , posthi - 1 , inorder , postorder);
        return root;

    }
    public static void levelorder(node root){
        Queue<node> q = new LinkedList<>();
        if(root != null){
            q.add(root);

        }
        while(q.size() > 0){
            node temp = q.poll();
            System.out.print(temp.val + " ");
            if(temp.left != null){
                q.add(temp.left);

            }
            if(temp.right != null){
                q.add(temp.right);

            }
        }

    }

}

