package recursion.STRINGrecursion;
import java.util.*;

public class powerset {
    public static void main(String[] args) {

            // concept - pick and skip 
        Scanner sc=new Scanner(System.in);
        String s = "abc";
        System.out.println("original string : " + s);
        System.out.println("power set string : ");
        // subsets(" ", s, 0);

        List<String> result = allpossiblestring(s);
        for(String str : result){
            System.out.print(str);

        }
    }
//     public static void subsets( String ans , String s , int idx ){
//         if( idx == s.length()) {
//             System.out.print(ans + " ");
//             return;
//         }
//         char ch = s.charAt(idx); 
//         subsets(ans+ch, s, idx + 1); // pick
//                  // skip
//         subsets(ans, s, idx + 1);
//     }
// }
            // modify code - 
    public static void subsets( String ans , String s, int idx , List<String>list){
        if(idx == s.length()){
            if( ans.length() != 0)
            list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch, s, idx+1, list);
        subsets(ans, s, idx +1, list);
    }
    public static List<String> allpossiblestring(String s){
        List<String> list = new ArrayList<>();
        subsets(" ", s, 0, list);
        Collections.sort(list); 
        return list ;

    }
}