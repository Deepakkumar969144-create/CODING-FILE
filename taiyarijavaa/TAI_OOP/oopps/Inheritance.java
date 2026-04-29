package taiyarijavaa.TAI_OOP.oopps;

    // Ek class dusri class ke properties aur methods use kar leti hai
        // Matlab:
    // “Code reuse” + “parent → child relation”

class vehical{  // parent 
    int wheels ;
    int speed;
    int seats;

}
class powervehical extends vehical { // child 
    int engin ;

}
class aircraft extends powervehical{ // child ka child 
    int roter;

}
class animal{   // parent 
    int size ;
    boolean isvegetarian;

}
class birds extends animal{     // child 
    int maximumaltitude;

}
class aqwaticanimal extends animal{     // parent ka child 
    int fins;
}

public class Inheritance {
    public static void main(String[] args) {
        vehical cycle = new vehical(); // vehical 
        cycle.wheels = 2;
        cycle.speed = 25;
        cycle.seats = 1;

        System.out.println("Cycle:");
        System.out.println(cycle.wheels + " " + cycle.speed + " " + cycle.seats);
      
        powervehical bike = new powervehical();    // powervehical
        bike.wheels = 2;
        bike.speed = 100;
        bike.seats = 2;
        bike.engin = 150;
        System.out.println();
        System.out.println("Bike:");
        System.out.println(bike.wheels + " " + bike.speed + " " + bike.seats + " " + bike.engin);

        aircraft plane = new aircraft();     // aircraft
        plane.wheels = 6;
        plane.speed = 800;
        plane.seats = 180;
        plane.engin = 2;
        plane.roter = 4;
        System.out.println();
        System.out.println("Aircraft:");
        System.out.println(plane.wheels + " " + plane.speed + " " + plane.seats + " " + plane.engin + " " + plane.roter);

        animal dog = new animal();   // animal
        dog.size = 50;
        dog.isvegetarian = false;
        System.out.println();
        System.out.println("Dog:");
        System.out.println(dog.size + " " + dog.isvegetarian);

        birds eagle = new birds();  // birds
        eagle.size = 10;
        eagle.isvegetarian = false;
        eagle.maximumaltitude = 5000;
        System.out.println();
        System.out.println("Bird:");
        System.out.println(eagle.size + " " + eagle.isvegetarian + " " + eagle.maximumaltitude);

        aqwaticanimal fish = new aqwaticanimal();   // aquatic animal
        fish.size = 5;
        fish.isvegetarian = true;
        fish.fins = 4;
        System.out.println();
        System.out.println("Fish:");
        System.out.println(fish.size + " " + fish.isvegetarian + " " + fish.fins);

    }
}
