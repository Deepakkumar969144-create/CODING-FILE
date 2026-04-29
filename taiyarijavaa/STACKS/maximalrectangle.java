package taiyarijavaa.STACKS;
import java.util.*;

public class maximalrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = { {0, 1, 1, 0}, { 1, 1, 1, 1 } , { 1, 1, 1, 1 } , { 1, 1, 0, 0 }};
        System.out.println("original array  : ");
        for( int [] arrr : arr ){
            for( int ele : arrr){
                System.out.print( ele + " ");

            }
            System.out.println();

        }

        System.out.println("maximal rectangle area in row and colum : ");
        maximalrectangle obj = new maximalrectangle();
        int result = obj.maximalRectangle(arr); 
        System.out.println(result);

    }

            // 2D → histogram conversion
     public int maximalRectangle(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int maxArea = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0) height[j] = 0;
                else height[j] += 1;

            }
            maxArea = Math.max(maxArea, getmaxarea(height));

        }
        return maxArea;

    }
    
    public static int getmaxarea( int [] arr ){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] nse = new int [n];
        nse [ n-1 ] = n ;
        st.push(n-1);
        for( int i = n -2 ; i>=0 ; i-- ){
            while (st.size() > 0 && arr[st.peek()] >= arr[i] ) {
                st.pop();
                
            }
            if(st.size()== 0 ) nse [i] = n ;
            else  nse [i] = st.peek();
            st.push(i);

        }
        while (st.size()>0 ) {
            st.pop();
            
        }
        int [] pse = new int[n] ;
        pse [0] = -1;
        st.push(0);
        for( int i =1; i<n ; i++ ){
            while (st.size()>0 && arr[st.peek()] >= arr[i] ) {
                st.pop();
                
            }
            if(st.size() == 0 ) pse[i] = -1;
            else pse [i] = st.peek();
            st.push(i);

        }
        int maxarea = 0 ;
        for( int i = 0 ; i<n ; i++ ) {
            int area = arr[i] * (nse[i] - pse[i] - 1 );
            maxarea = Math.max(maxarea, area);

        }
        return maxarea;

    }
}
