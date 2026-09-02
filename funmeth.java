// // --------------------function multiplication-----------------
// // // import java.util.*;

// // // public class funmeth {
// // //     public static int cal(int a, int b) {
// // //         int mul = a * b;
// // //         return mul;
// // //     }
// // //     public static void main(String args[]) {
// // //         Scanner sc = new Scanner(System.in);
// // //         int a = sc.nextInt();
// // //         int b = sc.nextInt();
// // //         int mul = cal(a, b);
// // //         System.out.println("MUL IS : " + mul);
// // //     }
// // // }
// --------------------FACTORIAL OF NUMBER ----------------------
import java.util.*;

public class funmeth {

    public static void pFact(int n) {
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }
        System.out.println(fact);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pFact(n);

    }

}
