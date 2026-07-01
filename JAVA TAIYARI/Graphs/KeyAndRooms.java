package Graphs;
import java.util.*;

public class KeyAndRooms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr= { { 1,3 } , { 3, 0 , 1 } , { 2 } , { 0 } };
        System.out.println("value of array is : ");
        for( int [] array : arr ){
            for( int ele : array ){
                System.out.print( ele + " ");

            }
            System.out.println();

        }
       // array ko list me convert karna hai
        List<List<Integer>> rooms = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
        List<Integer> list = new ArrayList<>();
        
        for (int j = 0; j < arr[i].length; j++) {
        list.add(arr[i][j]);

        }
        rooms.add(list);

        }
        System.out.print("key and rooms is : ");
        System.out.println(canvisitedrooms(rooms));

    }
    public static boolean canvisitedrooms( List<List< Integer>> rooms ){ // single bsf lagana hai opar 
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Queue< Integer> q = new LinkedList<>();
        q.add(0);
        while( q.size() > 0 ){
            int front = q.remove();
            for( int ele : rooms.get(front)){
                if( !visited[ele ] ){
                    q.add(ele );
                    visited[ele ] = true;

                }
            }
        }
        for( boolean flag : visited){
            if( !flag) return false;

        }
        return true;

    }
    
}
