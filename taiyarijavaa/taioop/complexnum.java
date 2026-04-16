
  class complexnumb{
        double  x ;
        double  y ;
        double denom ;
        complexnumb( double x , double y ){
            this.x = x;
            this.y = y;
            
        }
        void print(){
            if(y>=0 ) System.out.println(x + " + "+ y + "i");
            else {
                System.out.println(x+" - "+ (-y) + "i");
                
            }
        }
        void add(complexnumb c ){
            x += c.x;
            y += c.y;

        }
        void multiply(complexnumb c ){
            x = x * c.x - y * c.y;
            y = x * c.y + y * c.x;

        }
        void divide(complexnumb c ){
            denom = c.x * c.x + c.y * c.y;

             x = (x * c.x + y * c.y)/denom;
             y = (y * c.x - x * c.y)/denom;
        // formula - 
            // (a+bi)/(c+di)
            // result hota hai to -
            // (a+bi) (c-di)/c^2+d^2 

    }
}

public class complexnum {
  public static void main(String[] args) {
    complexnumb c1 = new complexnumb(2,-6);
    complexnumb c2 = new complexnumb(3, 04);
    c1.print(); c2.print();
    System.out.println( );

    c1.add(c2);
    c1.print(); c2.print();
    System.out.println();

    c2.multiply(c1);
    c1.print(); c2.print();
    System.out.println();

    c2.divide(c1);
    c1.print(); c2.print();
    System.out.println();
    
  }
}
