package oopps;
import java.util.Scanner;
import java.util.*;
    //  same method - different behavior
public class polymorphism {
    public static class dog {
        void sound() {
            System.out.println("bow bow");
        }
    }
    public static class  cat {
        void sound(){
            System.out.println("meow meow ");
        }
    }
    public static class pikachu {
        void sound (){
            System.out.println("pika pika");
        }
    }
    public static class human {
        void sound(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dog tommy = new dog(); //  declaration ( mtlab dog bale function method ka naya name tommy)
          // tommy - name 
        cat c = new cat(); // c declaration
        human bishal = new human(); 
        pikachu p = new pikachu();

                 tommy.sound(); // method call karna hai ( new name se call karna )
                    c.sound();
                    bishal.sound();
                    p.sound();

    }
}
