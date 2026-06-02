package BINARY_SEARCH_TREES;
import java.util.Scanner;

import java.util.*;

public class maxminsizesumbst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        node g = new node(70);
        node h = new node(80);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;

        System.out.println("binary search trees : ");
        print(a );
        System.out.println();

        System.out.println("max , min , size , sum ");
        quead ans = maxminsizesum(a);
        ans.display();


    }
    private static void print(node root ){
        if(root == null ) return;
        System.out.print( root.data + " ");
        print(root.left);
        print(root.right);

    }
    static class quead {
        int max;
        int min;
        int size;
        int sum;
        quead ( int max , int min , int size , int sum ){
            this.max = max;
            this.min = min;
            this.size = size;
            this.sum = sum;

        }
        void display (){
            System.out.println(max + " " +" , " + min + "  "+ " , " + size + "   " +", "+ sum + " ");

        }
    }
        public static quead maxminsizesum( node root ){
            if(root == null ) return new quead(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            quead lst = maxminsizesum(root.left);
            quead rst = maxminsizesum(root.right);
            int max = Math.max(root.data , Math.max(lst.max , rst.max));
            int min = Math.min(root.data , Math.min(lst.min, rst.min));
            int size = 1 + lst.size + rst.size;
            int sum = root.data + lst.sum + rst.sum;
            return new quead(max, min, size, sum);

        }
    }
    
