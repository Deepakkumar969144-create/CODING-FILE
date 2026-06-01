package twodarraylist;
import java.util.*;

public class pascalstriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
        System.out.println("original array : ");
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
            /// normal triangle 
        System.out.println(" normal triangle :");
        for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j <= i && j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
    }
        System.out.print("enter pascal triangle numver :");
        int n = sc.nextInt();
        
          // method call
        pascalstriangle obj = new pascalstriangle();
        List<List<Integer>> result = obj.generate(n);

        // print
        System.out.println("pascal triangle this enput : ");
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();

    }
    }
    public List<List < Integer>> generate(int n){
        List <List< Integer>> ans = new ArrayList<>();
        for( int i=0; i<n; i++){
            List <Integer> list = new ArrayList<>();
            for( int j=0; j<=i; j++){
                list.add(1);
            }
            ans.add(list);
        }
        for( int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if( j==0 || j==i){
                    ans.get(i).set(j, 1);  // arr[i][j] =1

                }
                else {
                    int val = ans.get(i-1).get(j) + ans.get(i -1).get(j-1);
                    ans.get(i).set(j, val);

                }
            }
        }
        return ans ;
     }
}
