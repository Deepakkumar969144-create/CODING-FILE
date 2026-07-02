package Graphs;
import java.util.*;

public class distanceofnearestcellhabing1 {
    public static void main(String[] args) {
        int[][] arr = { {0,1,2}, {1,0,1}, {2,1,0} };
        System.out.println("array value of : ");
        for(int[] array : arr){
            for(int ele : array){
                System.out.print(ele + " ");

            }
            System.out.println();
        }
        System.out.println("distance of nearest cell having 1 is : ");
        System.out.println(nearest(arr));

    }
    static class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public static ArrayList<ArrayList<Integer>> nearest(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<pair> q = new LinkedList<>();
        // Sabhi 1 ko queue me daalo
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    q.add(new pair(i,j));
                    vis[i][j]=true;

                }
            }
        }
        // Multi Source BFS
        while(q.size()>0){
            pair front=q.remove();
            int row=front.row;
            int col=front.col;
            if(col-1>=0 && !vis[row][col-1]){
                vis[row][col-1]=true;
                ans[row][col-1]=ans[row][col]+1;
                q.add(new pair(row,col-1));

            }
            if(col+1<m && !vis[row][col+1]){
                vis[row][col+1]=true;
                ans[row][col+1]=ans[row][col]+1;
                q.add(new pair(row,col+1));

            }
            if(row-1>=0 && !vis[row-1][col]){
                vis[row-1][col]=true;
                ans[row-1][col]=ans[row][col]+1;
                q.add(new pair(row-1,col));

            }
            if(row+1<n && !vis[row+1][col]){
                vis[row+1][col]=true;
                ans[row+1][col]=ans[row][col]+1;
                q.add(new pair(row+1,col));

            }
        }
        ArrayList<ArrayList<Integer>> ans2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<m;j++){
                a.add(ans[i][j]);

            }
            ans2.add(a);

        }
        return ans2;

    }
    
}