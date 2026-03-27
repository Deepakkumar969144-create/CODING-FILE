
                     // 1. Basic Function Call (Must Know)
            // 👉 Use: Basic understanding
public class Demofuntioncall {
    public static void main(String[] args) {
        greet();   // function call
    }

    public static void greet() {
        System.out.println("Hello DK");
    }
} 


                            //  2. Function with Parameters   ( 👉 Use: Input pass karna)

public class Demofuntioncall{
    public static void main(String[] args) {
        sum(10, 20);   // call
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
}   

                        // 3. Return Type Function (Very Important ⭐) [ Use: Value wapas lena]

public class Demofuntioncall {
    public static void main(String[] args) {
        int result = add(5, 7);   // call
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

                        // 4. Boolean Function (Interview Favorite 🔥)[ Use: True / False logic]

public class Demofuntioncall{
    public static void main(String[] args) {
        boolean ans = isEven(10);   // call
        System.out.println(ans);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

                    // 5. Array Passing Function (DSA Important 🚀) [ Use: Arrays handle karna]

 public class Demofuntioncall {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        printArray(arr);   // call
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

                         //  6. Function Calling Function (Very Important 🔥)[ Use: Modular coding]   

 public class Demofuntioncall {
        display();   // call
    }

    public static void display() {
        greet();   // 👈 ek function dusre ko call kar raha
    }

    public static void greet() {
        System.out.println("Hello DK");
    }
}

                            // 7. Different Class Function Call ( Use: OOP concept)

  class A {
    public static void hello() {
        System.out.println("Hello from A");
    }
}

public class B {
    public static void main(String[] args) {
        A.hello();   // 👈 dusri class ka call
    }
}                          