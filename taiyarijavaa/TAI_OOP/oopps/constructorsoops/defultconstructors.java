package taiyarijavaa.TAI_OOP.oopps.constructorsoops;
import java.util.Scanner;
import java.util.*;
            // Default constructor → auto banta hai
            // User constructor → tum khud banate ho

public class defultconstructors {
    public static class car{
        int seats;
        String name;
        double length;
        car(){
            // defult constructors 
        }
    }
    public static void main(String[] args) {
        car c1 = new car();

    }
}
// Default constructor is automatically created by Java 
// if no constructor is defined in the class

// * aagar tum package me class banate ho to us foulder me access kar sakte ho 
        // but aagar tum kisi perticular class(file) me class banate ho to tum us class me kahi bhi acees kar sakte hai 