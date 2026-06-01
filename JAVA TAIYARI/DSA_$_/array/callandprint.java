public class callandprint {
    public static void main(String[] args) {
        int[] arrp = {0, 1, 0, 1, 1, 0};
        segregate0sto1s(arrp);

        System.out.println("\nAfter Segregation:");
        for (int ele : arrp) {
            System.out.print(ele + " ");
        }
    }

    public static void segregate0sto1s(int[] arrp) {
        int zeroIndex = 0;
        for (int i = 0; i < arrp.length; i++) {
            if (arrp[i] == 0) {
                int temp = arrp[i];
                arrp[i] = arrp[zeroIndex];
                arrp[zeroIndex] = temp;
                zeroIndex++;
            }
        }
    }
}