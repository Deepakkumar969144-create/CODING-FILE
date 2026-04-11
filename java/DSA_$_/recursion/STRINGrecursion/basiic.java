package recursion.STRINGrecursion;

import java.util.*;

public class basiic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "kartikey";
        change(s);
        System.out.println(s);
        System.out.println();

        // badi string
        String[] arr = { "santosh ", "krish", "hemant ", "preet" };
        System.out.println("multiply array element : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println();
           ArrayList<String>al=new ArrayList<>();
    al.add("shravani");
    al.add("umang");
    al.add("ayan");
    al.add("shelly");
    al.add("riya");
    System.out.println("new arraylist element : ");
    System.out.println(al);
    System.out.println();

    System.out.println("new arraylist me yek element add hoke: ");
    change2(al);
    System.out.println(al);
    System.out.println();
    
    }

    public static void change(String s) { // funtionn = change(s);
        s = "lavish";

    }
    public static void change2( ArrayList<String>al){ // funtion = change2;
        al.add("biplab");

    }
}
    // * jab string ko function me le jate hai to copy jati hai
    // * string ka array bana sakte hai java me
    // * arraylist ko bhejte hai to wo bhi pass by reference hoti hai
