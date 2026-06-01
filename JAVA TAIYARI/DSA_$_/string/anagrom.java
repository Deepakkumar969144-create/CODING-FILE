package string;
import java.util.*;

public class anagrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        String str1 = "geeks";
        System.out.println("example anagrom: " + str1  );
        System.out.print(" enter a anagram : ");
          String strr = sc.nextLine();

         String str2 = "kseeg";
         System.out.println("example anagram: " + str2);
         System.out.print(" enter a anagram : ");
         String strrr = sc.nextLine();

        boolean res = anagram(str1, str2);
        System.out.println("check anagram true and false : " + res);
        boolean ress = aanagram(strr, strrr);
        System.out.println("anagram true and false : " + ress);

    }
    public static boolean anagram(String str1 , String str2){
        if( str1.length() != str2.length()){
            return false;

        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for ( int i=0; i<arr1.length; i++){
            if( arr1[i] != arr2[i] ){
                return false;

            }
        }
         return true;
    }
     public static boolean aanagram(String strr , String strrr){
        if( strr.length() != strrr.length()){
            return false;

        }
        char[] arr1 = strr.toCharArray();
        char[] arr2 = strrr.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for ( int i=0; i<arr1.length; i++){
            if( arr1[i] != arr2[i] ){
                return false;

            }
        }
         return true;

    }
}
