
import java.util.Scanner;
import java.util.*;
import java.util.*;
class sturdent{     // data type bana liya hai 
    String name ;
    int rno;
    double cgpa ;

    void print(){         // mehtod (class ke aandar)
        System.out.println(name + " "+ rno + " " + cgpa );

    }
}
public class userdef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sturdent s1 = new sturdent();   // declaration 
        s1.name = "khushi";
        // dot(.) se hm add ya print jesi kai cheeje kar sakte hai 

        s1.rno = 33;
        s1.cgpa = 8.3;

        sturdent s2 = new sturdent();
        s2.name = "lavish";
        s2.rno = 23;
        s2.cgpa = 8.3;

        sturdent s3 = new sturdent();
        s3.name = "angha";
        s3.rno = 55;
        s3.cgpa = 6.3;

        System.out.println(s1.name + " "+ s1.cgpa + " "+ s1.rno); // s1 bala hi print hoga 
         System.out.println(s2.name + " "+ s2.cgpa + " "+ s2.rno);
          System.out.println(s3.name + " "+ s3.cgpa + " "+ s3.rno);

        // change ya update 
        s2.cgpa = 9.9;
        System.out.println(s2.cgpa);

        // print karna 
        s1.print();
        s2.print();
        s3.print();
        // print(s1); print(s2); print(s3); // loop ke bahar ho to print karne me kaam aata hai 

        StringBuilder sb = new StringBuilder(); // string builder class ka object banaya hai
        StringBuilder sb1 = new StringBuilder(sc.nextInt()); // string builder class ka object banaya hai aur usme input liya hai
        System.out.println(sb); // print karna 
    }
    
}