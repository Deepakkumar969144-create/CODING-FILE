
package taiyarijavaa.TAI_OOP.oopps.constructorsoops;
import java.util.*;

        // * final keyword - 
public class finalandstatic {   //  static hata diya

    static class cricketer {   //  inner class static ho sakti hai
        final String counting = "India";
        int runs;
        String name;
        double avg;
    }

    public static void main(String[] args) {

        cricketer c1 = new cricketer();
        System.out.println(c1.counting);
    }
}

//             // * static variable keyword - shareable variable
// public class finalandstatic {

//     static class cricketer {  // shareable variable 
//         static String country = "NZ";
//         int runs;
//         String name;
//         double avg;

//         void print() {
//             System.out.println(runs + " " + name + " " + avg);
//         }

//         static void greet() {  // shareable variable 
//             System.out.println("I only believe in jassi bhai");
//         }
//     }

//     public static void main(String[] args) {

//          cricketer.greet();  // static method call
//         System.out.println(cricketer.country);  // static variable access
//         cricketer c1 = new cricketer();   // object banake non-static use
//           // c1.country = "england";  // error aayega 
//         c1.runs = 100;
//         c1.name = "Virat";
//         c1.avg = 50.5;
//         c1.print();
//         cricketer c2 = new cricketer();
//         c1.country = "India";  // change bhi ho sakta hai 
//         System.out.println(c2.country);
//         c2.greet();

//     }
// }