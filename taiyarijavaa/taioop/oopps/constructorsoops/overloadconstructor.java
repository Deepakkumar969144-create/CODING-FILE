// package constructors;
// import java.util.Scanner;
// import java.util.*;
// public class overloadconstructor {

//             // Ek hi kaam ke multiple versions banana
        // Ek hi class ko different tarike se initialize karna = Constructor Overloading
// public static class car{
//         int seats ;
//         String name ;
//         double length;
//         car(){
//             // defult constructor 
//         }
//         car( int x , String s , double d ){
//             seats = x ;
//             name = s;
//             length = d;
//         }
//         void print(){
//                 System.out.println(seats + " " + name+ " " + length);

//             }
//     }
//    public static void main(String[] args) {
//     car c1 = new car(5 , "kia soner" , 3.99);
//     c1.print();
//     car c2 = new car(4, "lord alto" , 5.45);
//     c2.print();
//     car c3 = new car(); // normally acces 
//     c3.name = " hond a amaze";

//    }
// }

     // Example - 
package oopps.constructorsoops;
import java.util.*;

public class overloadconstructor {
    public static class car {
    String name ;
    int rno ;
    int[] marks;
    car(int[] s){ // array copy
        marks = Arrays.copyOf(s, s.length);
    }
    car( int s){
        marks = new int[s];
    }
}
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 4, 8};
        car s1 = new car(arr);
        s1.marks [0] = 49;
        car s2 = new car(5);
        System.out.println(Arrays.toString(s1.marks));
        System.out.println(Arrays.toString(s2.marks));

    }
}

// Ye code ek class car bana raha hai
//  Jisme ek array (marks) store ho raha hai
//  Aur 2 alag constructors use ho rahe hain (overloading)