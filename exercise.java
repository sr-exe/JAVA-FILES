
// // // import java.util.Scanner;
// // // public class exercise {
// // //     public static int avg(int a, int b, int c) {
// // //         int avg = (a + b + c) / 3;
// // //         return avg;
// // //     }
// // //     public static void main(String args[]) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("Enetr your 1st number: ");
// // //         int a = sc.nextInt();
// // //         System.out.println("Enter 2nd number ");
// // //         int b = sc.nextInt();
// // //         System.out.println("Enter 3rd number :");
// // //         int c = sc.nextInt();
// // //         int cal = avg(a, b, c);
// // //         System.out.println("AVERAGE IS : " + cal);
// // //     }
// // // }
// // // -----------------------Q2-----------------------------------------
// // import java.util.Scanner;
// // public class exercise {
// //     public static int odd(int n) {
// //         int sum = 0;
// //         for (int i = 1; i <= n; i++) {
// //             for (int j = i; j <= i; j++) {
// //                 System.out.println("NUMBERS : " + j);
// //             }
// //             if (i % 2 != 0) {
// //                 sum = sum + i;
// //             }
// //         }
// //         System.out.println("ODD NUMBER SUM:" + sum);
// //         return sum;
// //     }
// //     public static void main(String args[]) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enetr your number range :");
// //         int n = sc.nextInt();
// //         odd(n);
// //     }
// // }
// // ----------------Q3-----------------------------
// // import java.util.Scanner;
// // public class exercise {
// //     public static double cir(double r) {
// //         double circum = 2 * Math.PI * r;
// //         return circum;
// //     }
// //     public static void main(String args[]) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter radius :");
// //         double r = sc.nextDouble();
// //         double ans = cir(r);
// //         System.out.println("Your circumference is :" + ans);
// //     }
// // }
// // -------------------Q4-------------------------------
// // import java.util.Scanner;
// // public class exercise {
// //     public static void vote(int age) {
// //         if (age > 18) {
// //             System.out.println("Eligible to vote");
// //         } else {
// //             System.out.println("You are a kid mother fucker go and sleep ");
// //         }
// //     }
// //     public static void main(String args[]) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter you age bitch :");
// //         int age = sc.nextInt();
// //         vote(age);
// //     }
// // }
// // ------------------------Q5----------------------- ALREADY DONE
// //-------------------------Q6-------------------------
// // public class exercise {
// //     public static void main(String args[]) {
// //         int num = 1;
// //         do {
// //             System.out.println(num);
// //         } while (true);
// //     }
// // }
// // ------------------------Q7__-----------------------------------
// import java.util.Scanner;
// public class exercise {
//     public static void main(String args[]) {
//         int pos = 0;
//         int neg = 0;
//         int zero = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How many number will u enter : ");
//         int n = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter a number :");
//             int num = sc.nextInt();
//             if (num > 0) {
//                 pos++;
//             } else if (num < 0) {
//                 neg++;
//             } else {
//                 zero++;
//             }
//         }
//         System.out.println("POS :" + pos);
//         System.out.println(" NEG :" + neg);
//         System.out.println("ZERO :" + zero);
//     }
// }
// -----------------------Q8----------------------
// import java.util.Scanner;
// public class exercise {
//     public static int power(int x, int n) {
//         int power = 1;
//         for (int i = 1; i <= n; i++) {
//             power = power * x;
//         }
//         return power;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         int result = power(x, n);
//         System.out.println("power : " + result);
//     }
// }
// ============================ Q9 ===============================
// import java.util.Scanner;
// public class exercise {
//     public static int gcd(int a, int b) {
//         int gcd = 1;
//         int min;
//         if (a < b) {
//             min = a;
//         } else {
//             min = b;
//         }
//         for (int i = 1; i <= min; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//         }
//         return gcd;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your first number :");
//         int a = sc.nextInt();
//         System.out.println("Enter your second number :");
//         int b = sc.nextInt();
//         System.out.println(" GCD :" + gcd(a, b));
//     }
// }
// =================Q 10 ================================================
import java.util.Scanner;

public class exercise {

    public static void fab(int n) {

        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();

        fab(n);

    }
}
