package taiyarijavaa.BINARY_TREES;
import java.util.Scanner;
import java.util.*;

public class roottoleafpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);

        a.left = b ; a.right = c ;
        b. left = d; b.right = e ;

        System.out.println("binary tree is : ");
        print(a);
        System.out.println();

        ArrayList<ArrayList<Integer>> result = paths(a);
        System.out.println("root to leaf path is : ");
        for(ArrayList<Integer> list : result){
            for( int x : list){
                System.out.print( x + " ");

            }
            System.out.println();
            
        }

    }
    private static void print(node root){
        if(root == null ) return;
        System.out.print( root.val + " ");
        print(root.left);
        print(root.right);

    }
    public static ArrayList<ArrayList<Integer>> paths( node root ){
        ArrayList < ArrayList < Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr , ans );
        return ans;

    }
    private static void dfs(node root , ArrayList<Integer> arr , ArrayList<ArrayList<Integer>> ans ){
        if(root == null) return ;
        arr.add(root.val);
        if(root.left == null && root.right == null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);

        }
            dfs(root.left, arr, ans);
            dfs(root.right, arr, ans);
            arr.remove(arr.size() - 1 ); 
           
    }
}
    

