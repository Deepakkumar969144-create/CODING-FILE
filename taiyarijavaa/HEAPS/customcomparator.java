package taiyarijavaa.HEAPS;
import java.util.Scanner;
import java.util.*;

public class customcomparator {
    static class sudent implements Comparable<sudent> {
        String name;
        int rno;
        double cgpa;
        sudent(String name , int rno , double cgpa){
            this.name = name;
            this.rno = rno;
            this.cgpa = cgpa;

        }
        public int compareTo(sudent s){
            if(this.cgpa == s.cgpa){
                return this.rno - s.rno;

            }
            return Double.compare(s.cgpa , this.cgpa);

        }
        void print(){
            System.out.println(name + " " + rno + " " + cgpa);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sudent s1 = new sudent("gopi" , 49 , 8.9);
        sudent s2 = new sudent("anuj" , 90 , 8.5);
        sudent s3 = new sudent("isha" , 8 , 8.3);
        sudent s4 = new sudent("aditya" , 51 , 9.7);

        sudent[] arr = {s1 , s2 , s3 , s4};
        Arrays.sort(arr);

        for(sudent s : arr){
            s.print();

        }
    }
    
}