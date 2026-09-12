
// import java.util.Scanner;
// public class day7 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int count = 0;
//         int digit = 0;
//         int sum = 0;
//         int largest = 0;
//         int even = 0;
//         int orig = 0;
//         while (num > 0) {
//             digit = num % 10;
//             count++;
//             num = num / 10;
//             sum = sum + digit;
//             if (digit > largest) {
//                 largest = digit;
//             }
//             if (digit % 2 == 0) {
//                 even++;
//             }
//         }
//         System.out.println(" Digits : " + count);
//         System.out.println(" Sum : " + sum);
//         System.out.println(" largest : " + largest);
//         System.out.println(" even : " + even);
//     }
// }
// Enter digits : 128765
//  Digits : 6
//  Sum : 29
//  largest : 8
//  even : 3
// public class day7 {
//     static int square(int n) {
//         return n * n;
//     }
//     public static void main(String args[]) {
//         int result = square(7);
//         System.out.println("result" + result);
//     }
// }
// result = 49
// public class day7 {
//     static boolean isEven(int n) {
//         return n % 2 == 0;
//     }
//     public static void main(String args[]) {
//         boolean result = isEven(5);
//         System.out.println("even : " + result);
//     }
// }
// even : false
// public class day7 {
//     static int largest(int a, int b, int c) {
//         int largest = 0;
//         if (a > largest) {
//             largest = a;
//         }
//         if (b > largest) {
//             largest = b;
//         }
//         if (c > largest) {
//             largest = c;
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int result = largest(12, 544, 34);
//         System.out.println("Largest : " + result);
//     }
// }
// Largest : 544
// public class day7 {
//     static int sumDigit(int num) {
//         int digit = 0;
//         int sum = 0;
//         while (num > 0) {
//             digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int result = sumDigit(58392);
//         System.out.println("Sum : " + result);
//     }
// }
// Sum : 27
// public class day7 {
//     static int even(int num) {
//         int digit = 0;
//         int count = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit % 2 == 0) {
//                 count++;
//             }
//             num = num / 10;
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int result = even(58923);
//         System.out.println("Even : " + result);
//     }
// }
// Even : 2
// public class day7 {
//     static int odd(int num) {
//         int count = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit % 2 == 1) {
//                 count++;
//             }
//             num = num / 10;
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int result = odd(23451);
//         System.out.println("Odd : " + result);
//     }
// }
// Odd : 3
public class day7 {

    static int evenSum(int num) {
        int sum = 0;
        int count = 0;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            num = num / 10;

        }
        return sum;
    }

    public static void main(String args[]) {
        int result = evenSum(58392);
        System.out.println(" Even sum : " + result);
    }
}
