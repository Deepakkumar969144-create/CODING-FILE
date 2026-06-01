package taiyarijavaa.STACKS;
import java.util.*;

public class theclelebrityproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat = { {1,1,0} , {0,1,0} , {0,1,1} };
        System.out.println("original array: ");
        for(int[] a : mat){
            for(int ele : a){
                System.out.print(ele + " ");

            }
            System.out.println();

        }

        theclelebrityproblem obj = new theclelebrityproblem();
        int ans = obj.celebrity(mat);
        System.out.println("Celebrity index: " + ans);

    }

    public int celebrity(int arr[][] ){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            st.push(i);

        }

        // elimination (single loop)
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();

            if(arr[a][b] == 1) {
                st.push(b);   // a out

            } 
            else {
                st.push(a);   // b out

            }
        }

        if(st.size() == 0) return -1;
        int celeb = st.pop();

        // row check (celeb kisi ko nahi janta)
        for(int j = 0; j < n; j++){
            if(j == celeb) continue;
            if(arr[celeb][j] == 1)
                return -1;

        }

        // column check (sab celeb ko jante hain)
        for(int i = 0; i < n; i++){
            if(i == celeb) continue;
            if(arr[i][celeb] == 0)
                return -1;

        }
        return celeb;
        
    }
}