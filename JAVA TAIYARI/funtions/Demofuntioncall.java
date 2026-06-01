public class Demofuntioncall {
    public static void main(String[] args) {
        // 1. Basic Function Call
        greet();

        // 2. Function with Parameters
        sum(10, 20);

        // 3. Return Type Function
        int result = add(5, 7);
        System.out.println("Sum result: " + result);

        // 4. Boolean Function
        boolean ans = isEven(10);
        System.out.println("Is even: " + ans);

        // 5. Array Passing Function
        int[] arr = {10, 20, 30};
        printArray(arr);
        System.out.println();

        // 6. Function Calling Function
        display();

        // 7. Different Class Function Call
        A.hello();
    }

    public static void greet() {
        System.out.println("Hello DK");
    }

    public static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void display() {
        greet();
    }
}

class A {
    public static void hello() {
        System.out.println("Hello from A");
    }
}