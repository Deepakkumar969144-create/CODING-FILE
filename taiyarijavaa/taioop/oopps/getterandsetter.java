package oopps;
import java.util.Scanner;
import java.util.*;
// Getter → value read (get) karta hai
// Setter → value update (set) karta hai
// Setter → value daalo
// Getter → value nikalo

class student{
    String name;
    private int rno ; 
    double cgpa;
    void print(){ 
        System.out.println(name + " "+ rno + " " + cgpa );

    }
    int getRno(){ // getter method 
        return rno ; // getter method
    }
    void setRno(int r){ // setter method 
        rno = r; // setter method
    }
}
public class getterandsetter {
    public static void main(String[] args) {
        student s1 = new student();

        s1.cgpa = 8.9;
        s1.name = "hemu";
        s1.setRno(56);

        s1.print();  //  ab yaha print karo
        System.out.println(s1.getRno());
    }
}


