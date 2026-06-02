package Hashmap_and_Hashset;

import java.util.Scanner;
import java.util.*;
public class arraysubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arra[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int arrb[] = {11, 3, 7, 1, 7};
        System.out.println("arrays element arr a : ");
        for(int ele : arra){
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println("arrays element arr b : ");
        for(int ele : arrb){
            System.out.print(ele + " ");

        }
        System.out.println();
        System.out.println("array subset : ");
        System.out.println(issubset(arra, arrb));

    }
    public static boolean issubset(int arra[] , int arrb[] ){
        HashMap<Integer, Integer > amap = new HashMap<>();
        for( int ele : arra){
            if(amap.containsKey(ele)){
                int freq = amap.get(ele);

            }
            else amap.put(ele, 1);

        }
        HashMap < Integer , Integer> bmap = new HashMap<>();
        for( int ele : arrb){
            if( !amap.containsKey(ele)){
                return false;

            }
            if(bmap.containsKey(ele)) {
                int freq = bmap.get(ele);
                bmap.put(ele, freq + 1);

            }
            else bmap.put(ele, 1);

        }
        for(int ele : bmap.keySet()){
            int freq = bmap.get(ele);
            int afreq = amap.get(ele);
            if(afreq < freq ) return false;

        }
        return true;

    }
}