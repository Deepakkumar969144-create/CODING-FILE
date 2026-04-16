package constructors;
import java.util.Scanner;
import java.util.*;

public class thiskeyword {
    public static class car {
        int price;
        String name ;
        car(){
            // defult 
        }
        car( int price , String name ){
            this.price = price;
            this.name = name;
            // same name de sakte hai but this. lagana padega 

        }
        car ( String s, int x){
            this.price = x;
            name = s;

        }
        void price(){
            System.out.println(this.price + " " + this.name);
        }
    }
    public static void main(String[] args) {
        car s1 = new car(1200 , "kia sonet");
        s1.price();

    }
}

    // this. ka matlab same name se fark nahi padega sahi code aceess karega
