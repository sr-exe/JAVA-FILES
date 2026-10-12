
// public class day36 {
//     static int sumRec(int n, int sum) {
//         if (n > 10) {
//             return sum;
//         }
//         return sumRec(n + 1, sum + n);
//     }
//     public static void main(String args[]) {
//         int res = sumRec(1, 0);
//         System.out.print(res);
//     }
// }
// public class day36 {
//     static int fact(int n, int fact) {
//         if (n > 5) {
//             return fact;
//         }
//         return fact(n + 1, fact * n);
//     }
//     public static void main(String args[]) {
//         int res = fact(1, 1);
//         System.out.print(res);
//     }
// }
// public class day36 {
//     static void rec(int n) {
//         if (n > 5) {
//             return;
//         }
//         System.out.print(n + " ");
//         rec(n + 1);
//     }
//     public static void main(String args[]) {
//         rec(1);
//     }
// }
//!  THIS IS FOR ONLY POSITIVE WITH NO EDGE CASES IN INPUT -->
// import java.util.Scanner;
// public class day36 {
//     static int countDigits(int n, int count) {
//         if (n == 0) {
//             return count;
//         }
//         return countDigits(n / 10, count + 1);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int digits = sc.nextInt();
//         int res = countDigits(digits, 0);
//         System.out.print(res);
//     }
// }
//! THIS CAN HANDLE ALL CASES --->
import java.util.*;

class day36 {

    static int countDigits(int n, int count) {

        if (n == 0 && count == 0) {
            return 1;
        }

        if (n == 0) {
            return count;
        }

        return countDigits(n / 10, count + 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits : ");
        int digits = sc.nextInt();
        digits = Math.abs(digits);

        int res = countDigits(digits, 0);
        System.out.print(res);
    }

}
