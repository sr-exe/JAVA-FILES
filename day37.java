
// public class day37 {
//     static int sum(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         return n + sum(n - 1);
//     }
//     public static void main(String args[]) {
//         int res = sum(10);
//         System.out.print(res);
//     }
// }
// public class day37 {
//     static int fact(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return n * fact(n - 1);
//     }
//     public static void main(String args[]) {
//         int res = fact(10);
//         System.out.print(res);
//     }
// }
// import java.util.Scanner;
// public class day37 {
//     static int count(int n) {
//         if (n < 10) {
//             return 1;
//         }
//         return 1 + count(n / 10);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int digit = sc.nextInt();
//         digit = Math.abs(digit);
//         int res = count(digit);
//         System.out.print(res);
//     }
// }
// public class day37 {
//     static int reverse(int n, int result) {
//         if (n == 0) {
//             return result;
//         }
//         return reverse(n / 10, result * 10 + n % 10);
//     }
//     public static void main(String args[]) {
//         int res = reverse(34567, 0);
//         System.out.print(res);
//     }
// }
// public class day37 {
//     static int sum(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         return n + sum(n - 1);
//     }
//     static void main(String args[]) {
//         int res = sum(10);
//         System.out.print(res);
//     }
// }
public class day37 {

    static int sum(int n, int s) {
        if (n > 10) {
            return s;
        }

        return sum(n + 1, s + n);
    }

    public static void main(String args[]) {
        int res = sum(1, 0);
        System.out.print(res);
    }
}
