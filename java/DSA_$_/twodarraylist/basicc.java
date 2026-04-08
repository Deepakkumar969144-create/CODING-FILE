package twodarraylist;

import java.util.*;

public class basicc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); // 2d array list banaya( array list ki array list )

        arr.add(new ArrayList<>(Arrays.asList(10, 20, 30, 80, 110))); // ek list banai hai uko arrlist me convert kiya
                        // hao or fir es list ke end me add karta hai

        System.out.println(arr.get(0).get(2)); // 0 index par jo list hai uske 2 index par jo element hai
        // usko print karna hai

        System.out.println(arr.get(0).get(2)); // 2 index par jo element hai usko print karna hai
        System.out.println(arr.get(0).get(3)); // print hoga
        System.out.println(arr.get(0).set(1, 6)); // position 1 pe 6 set hoga
        arr.get(0).set(2, 300); // 2 index par jo element hai usko 300 se replace karna hai

        arr.get(0).add(7); // 0 index par add hoga 7 eleement
        // yek new array list add

        arr.add(new ArrayList<>()); // new array list add hoga
        System.out.println("array list : ");
        for (ArrayList<Integer> list : arr) {
            for (int ele : list) {
                System.out.print(ele + " ");

            }
            System.out.println();
        }
        ArrayList<ArrayList<Integer>> arrr = new ArrayList<>(); // arraylist ki arraylist

        ArrayList<Integer> a = new ArrayList<>(); // normal new arraylist
        a.add(33);
        a.add(22);
        a.add(44);              // a arraylist me element add
        a.add(55);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(5);
        c.add(7);
        c.add(9);
        c.add(11);
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
        arr2.add(a);
        arr2.add(b);
        arr2.add(c);
        // print
        System.out.println("new array list : ");
        for (ArrayList<Integer> list : arr2) {
            for (int ele : list) {
                System.out.print(ele + " ");

            }
            System.out.println();
        }

        arr.add(new ArrayList<>());     // Nayi list add (bad me add ki jo )
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);
        // "Jo last me nayi list add ki hai, usi me elements add karo"

                    // Agar sirf LAST wali list print karni hai:
        ArrayList<Integer> last = arr.get(arr.size() - 1);  // arr ke andar jo last wali list hai, usko nikaal ke last me store kar raha hai
        System.out.println("new new list : ");
        for(int ele : last){
            System.out.print(ele + " ");
        }
        System.out.println();

            // to array matrix ka call karna 
         ArrayList<ArrayList<Integer>> result = multiply(mat1, mat2);

            // arraylist or 1 array matrix ka call karna 
         ArrayList<Integer> result = spirallytraverse(mat);

            // "This is a method call (method invocation) where generate is the method name and n is the argument."
         pascalstriangle obj = new pascalstriangle();
        List<List<Integer>> result = obj.generate(n);
        
    }
}
