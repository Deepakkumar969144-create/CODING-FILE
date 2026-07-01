package Graphs;
import java.util.*;

public class RottenOranges {
    public static void main(String[] args) {
        int mat[][] = {
                {2,1,0,2,1},
                {1,0,1,2,1},
                {1,0,0,2,1}
        };
        System.out.println("value of array is : ");
        for(int[] array : mat){
            for(int ele : array){
                System.out.print(ele+" ");

            }
            System.out.println();

        }
        System.out.print("rotten oranges is : ");
        System.out.println(organgerot(mat));

    }
    public static class triplet{
        int row;
        int col;
        int time;
        triplet(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;

        }

    }
    public static int organgerot(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        Queue<triplet> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==2){
                    q.add(new triplet(i,j,0));
                    
                }
            }

        }
        int maxtime = 0;
        while(q.size()>0){
            triplet front=q.remove();
            int row=front.row;
            int col=front.col;
            int time=front.time;
            maxtime=Math.max(maxtime,time);

            // left
            if(col-1>=0 && arr[row][col-1]==1){
                arr[row][col-1]=2;
                q.add(new triplet(row,col-1,time+1));
                
            }

            // right
            if(col+1<n && arr[row][col+1]==1){
                arr[row][col+1]=2;
                q.add(new triplet(row,col+1,time+1));

            }

            // up
            if(row-1>=0 && arr[row-1][col]==1){
                arr[row-1][col]=2;
                q.add(new triplet(row-1,col,time+1));

            }

            // down
            if(row+1<m && arr[row+1][col]==1){
                arr[row+1][col]=2;
                q.add(new triplet(row+1,col,time+1));

            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    return -1;

                }
            }

        }
        return maxtime;
        
    }

}