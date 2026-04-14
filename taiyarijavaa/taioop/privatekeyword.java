import java.util.Scanner;
import java.util.*;
        // private ko hm normally access nhi kar sakte hai ( private keyword ka use karne se hm kisi bhi variable 
        // ya method ko private bana sakte hai jise hm class ke bahar access nahi kar sakte hai ). 
        class student {
        String name ;
        private int rno = 87; 
        double cgpa;

        private void print(){ // private method ese bhi hm class ke bahar access nahi kar sakte hai 
            System.out.println(name + " "+ rno + " " + cgpa );
        }

        public void p(){    // method function 
            print(); // private method ko public method ke andar call kar sakte hai ( private method ko
               // public method ke andar call karne se hm class ke bahar se bhi access kar sakte hai )
        }
    }
public class privatekeyword {
    public static void main(String[] args) {
        student s1 = new student();

        s1.p();  // private method ko public method ke andar call karne se hm class ke bahar se bhi access kar sakte hai
        // s1.print(); // private method ko class ke bahar access nahi kar sakte hai 
         //  s1.rno = 78; // private variable ko class ke bahar access nahi kar sakte hai

        s1.cgpa = 8.0; 
        s1.name = "heamnt";
        s1.p();
        
        student s2 = new student(); // new student class ka object banaya hai
        s2.p();  // new student class ka object banane ke baad usme private method ko public method ke andar call karne se 
                 // hm class ke bahar se bhi access kar sakte hai
       
    }
    
}
