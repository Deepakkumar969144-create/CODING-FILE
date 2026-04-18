package oopps;

class Arraylist{    // use define data sturesture 
    int [] arr;
    int idx = 0;
    int size = 0;

    Arraylist ( int capacity){
        arr = new int [capacity];

    }
    void add ( int ele ){
        if(idx == arr.length){  // array is full 
              capacityincrease(); 
        }  
        arr[idx] = ele;
        idx ++;
        size ++;

    }
    void removefromend(){
        idx --;
        size --;

    }
      void remove(int index){
        if(index < 0 || index >= size) return;

        for(int i = index; i < size-1; i++){
            arr[i] = arr[i+1];   // shift left
        }
        idx--;
        size--;

    }
     void add(int index, int ele){
        if(index < 0 || index > size) return;

        if(size == arr.length){
            capacityincrease();
        }

        for(int i = size; i > index; i--){
            arr[i] = arr[i-1];   // shift right
        }

        arr[index] = ele;
        idx++;
        size++;

    }
    void capacityincrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i]; // copy past 

        }
        arr = arr2;

    }
    int capacity(){
        return arr.length;

    }
    int get( int index){
        return arr[index];

    }
    void set( int index , int val){
        arr[index] = val ;

    }
    void displey(){
        for(int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
public class ownarraylist {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(3);
        arr.add(10); arr.add(20); arr.add(30);
        arr.displey();
        System.out.println(arr.get(1));
        arr.add(40); arr.add(49);arr.add(34); arr.add(45); arr.add(56);
        arr.displey();

    }
}

// 1. ArrayList kya hota hai?
//      Java ka ArrayList ek dynamic array hota hai
//       matlab size automatically badh jata hai

// Normal array:
//      int[] arr = new int[5]; // fixed size

// ArrayList:
//      ArrayList<Integer> list = new ArrayList<>();
//      size apne aap increase hota hai

// 2. Own ArrayList ka logic (core idea)
//      Tu basically 3 cheeze use karta hai:
//           int[] arr;   // actual array
//           int size;    // kitne elements hai
//           int capacity; // total space 