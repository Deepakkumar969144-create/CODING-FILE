package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class constructtreefromInorderandpreorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int preorder[] = {1,2,4,5,8,9,3,6,7};
        int inorder[] = {4,2,8,5,9,1,6,3,7};

        node root = buildtree(inorder , preorder);

        System.out.print("inorder : ");
        inorderdisplay(root);

        System.out.println();

        System.out.print("preorder : ");
        preorderdisplay(root);

    }
    public static node buildtree(int inorder[] , int preorder[] ){
        int n = inorder.length;
        return build(0 , n-1 , 0 , n-1 , inorder , preorder);

    }
    public static node build(int prelo , int prehi , int inlo , int inhi ,int inorder[] , int preorder[] ){
        if(prelo > prehi || inlo > inhi){
            return null;

        }
        int val = preorder[prelo];

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

        root.left = build(prelo + 1 , prelo + cnt , inlo , r - 1 , inorder , preorder);

        root.right = build(prelo + cnt + 1 , prehi , r + 1 , inhi , inorder , preorder);

        return root;

    }
    public static void inorderdisplay(node root){
        if(root == null){
            return;

        }
        inorderdisplay(root.left);

        System.out.print(root.val + " ");

        inorderdisplay(root.right);

    }
    public static void preorderdisplay(node root){
        if(root == null){
            return;

        }
        System.out.print(root.val + " ");

        preorderdisplay(root.left);

        preorderdisplay(root.right);

    }

}