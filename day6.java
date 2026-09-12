
//  ------------->>old concepts
// import java.util.*;
// public class day6 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int count = 0;
//         while (num > 0) {
//             num = num / 10;
//             count++;
//         }
//         System.out.println("number of digits : " + count);
//     }
// }
// Enter digits : 124364
// number of digits : 6
// import java.util.Scanner;
// public class day6 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int digit = 0;
//         int sum = 0;
//         while (num > 0) {
//             digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         System.out.println("Sum : " + sum);
//     }
// }
// import java.util.Scanner;
// public class day6 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int count = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             num = num / 10;
//             if (digit % 2 == 0) {
//                 count++;
//             }
//         }
//         System.out.println("EVEN : " + count);
//     }
// }
//  java day6
// Enter digits : 123456
// EVEN : 3
// import java.util.Scanner;
// public class day6 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int largest = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit > largest) {
//                 largest = digit;
//             }
//             num = num / 10;
//         }
//         System.out.println("largest : " + largest);
//     }
// }
// Enter digits : 54312398
// largest : 9
// import java.util.Scanner;
// public class day6 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int digit = 0;
//         int sum = 0;
//         int largest = 0;
//         int count = 0;
//         int even = 0;
//         while (num > 0) {
//             digit = num % 10;
//             count++;
//             sum = digit + sum;
//             if (digit > largest) {
//                 largest = digit;
//             }
//             if (digit % 2 == 0) {
//                 even++;
//             }
//             num = num / 10;
//         }
//         System.out.println("Digits : " + count);
//         System.out.println("sum : " + sum);
//         System.out.println("largest : " + largest);
//         System.out.println("even  : " + even);
//     }
// }
// Enter digits : 12864
// Digits : 5
// sum : 21
// largest : 8
// even  : 4
////////////////--------------METHODS----------->>>>>>>
// public class day6 {

//     static void greet(String name) {
//         System.out.println("HELLO " + name);
//     }

//     public static void main(String args[]) {
//         greet("Shubham");
//     }
// }
// HELLO Shubham

// public class day6 {

//     static void mul(int a, int b) {

//         System.out.println(a * b);
//     }

//     public static void main(String args[]) {
//         mul(7, 6);
//     }
// }
// OP-->42

public class day6 {

    static int add(int a, int b) {
        return a + b;

    }

    public static void main(String args[]) {
        int sum = add(15, 25);
        System.out.println("sum = " + sum);
    }
}
