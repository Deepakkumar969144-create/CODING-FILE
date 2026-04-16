
class frection{
    int num;
    int den;
    frection(int num , int den){
        this.num = num;
        this.den = den;
         simplify();

    }
    void print(){
        System.out.println(num+ " " + den + " ");

    }
    void add(frection f){
        num = num*f.den*f.num; 
        den = den*f.den;
         simplify();

    }
    void multiply(frection f){
        this.num = this.num*f.num;
        this.den = this.den*f.den;
         simplify();

    }
    void divide(frection f){
        num = num * f.den;
        den = den*f.num;
        simplify();

    }
    void simplify(){
        int gcd = hcf(num , den);
        num = num / gcd;
        den = den / gcd;
          boolean isnegative = (num*den < 0 ) ? true: false;
        if( isnegative ) num = -num;

    }
    int hcf(int a , int b){
        if(a == 0) return b;
        return hcf(b % a , a);

    }
}

public class fraction {
    public static void main(String[] args) {
        frection f1 = new frection(3, 7);
        frection f2 = new frection(7, 3);
        f1.multiply(f2);
        f1.print();
        frection f3 = new frection(50, 100);
        f3.print();

    }
}
