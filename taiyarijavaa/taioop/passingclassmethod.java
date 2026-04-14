
import java.util.Scanner;
import java.util.*;

public class passingclassmethod {
    public static class car{    // data type bana liya hai 
       int seats ;
       String name ;
       double length ;
       String type;
       int torque;
    
       void print(){         // mehtod (class ke aandar)
        System.out.println(seats+ " "+ name+ " " + length + "m " + type + " " + torque+ "nm ");
       }
    }
    public static void main(String[] args) {
        car c1 = new car();   // declaration
        c1.seats = 4;
        c1.name = "Toyota";
        c1.length = 4.5;
        c1.type = "Suv";
        c1.torque = 200;
        c1.print();
        change(c1); // method call karna hai
        System.out.println(c1.seats); // call ke bad new value print hogi    
        c1.print(); // c1 declaration hai wo  print hoga ( but call ke bad jo bhi change hua hai wo same print hoga )

    }
    public static void change(car c){ // 
        c.seats = 6; // change 
    }
}
