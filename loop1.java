
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }
//  using if but try to do it without if -->
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 2; i <= 20; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
//?? below is a program for even and can be odd too without using if else 
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 2; i <= 20; i += 2) {
//             System.out.println(i);
//         }
//     }
// }
//WHILE LOOP 
// public class loop1 {
//     public static void main(String args[]) {
//         int i = 10;
//         while (i >= 1) {
//             System.out.println(i);
//             i--;
//         }
//     }
// }
// DO WHILE LOOP
// public class loop1 {
//     public static void main(String args[]) {
//         int i = 1;
//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 5);
//     }
// }
// BREAK STATEMENT 
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 10; i++) {
//             if (i == 7) {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }
//CONTINUE STATEMENT 
// public class loop1{
//     public static void main(String args[])
//     {
//         for(int i = 1; i <= 10; i++)
//         {
//             if (i == 5){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//OP ------> *
//           **
//           ***
//           ****
//           *****
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 5; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//  }
// OP------>
// *****
// ****
// ***
// **
// *
// public class loop1 {
//     public static void main(String args[]) {
//         int inc = 1;
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(inc++);
//             }
//             System.out.println();
//         }
//     }
// }
// OP ------->
// 1
// 23
// 456
// 78910
// 1112131415
// import java.util.Scanner;
// public class loop1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of stars : ");
//         int num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  * 
//  *  *  *  *  *  * 
// import java.util.Scanner;
// public class loop1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of stars : ");
//         int num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             for (int j = num; j >= i; j--) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }
//  *  *  *  *  * 
//  *  *  *  * 
//  *  *  * 
//  *  * 
//  * 
// import java.util.Scanner;
// public class loop1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of stars : ");
//         int num = sc.nextInt();
//         for (int k = 1; k <= num; k++) {
//             for (int i = 1; i <= num - k; i++) {
//                 System.out.print("*");
//             }
//             for (int j = 1; j <= k; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class loop1 {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// 1
// 12
// 123
// 1234
// 12345
// public class loop1 {
//     public static void main(String args[]) {
//         int num = 1;
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
// 1
// 23
// 456
// 78910
// import java.util.Scanner;
// public class loop1 {
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
// Enter digits : 11222345
// number of digits : 8
// import java.util.Scanner;
// public class loop1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         int digit;
//         while (num > 0) {
//             digit = num % 10;
//             num = num / 10;
//             sum = sum + digit;
//         }
//         System.out.println("sum : " + sum);
//     }
// }
// Enter the digits : 1234
// sum : 10
// import java.util.Scanner;
// public class loop1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter this digits : ");
//         int num = sc.nextInt();
//         int reverse = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }
//         System.out.print(reverse);
//     }
// }
// Enter this digits : 123
// 321
// import java.util.Scanner;
// public class loop1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int num = sc.nextInt();
//         int count = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit % 2 == 0) {
//                 count++;
//             }
//             num = num / 10;
//         }
//         System.out.println("even : " + count);
//     }
// }
// Enter the digits : 123456789
// even : 4
import java.util.Scanner;

public class loop1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        int num = sc.nextInt();
        int orig = num;
        int reverse = 0;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (orig == reverse) {
            System.out.println("digit is palindrome : " + reverse);
        } else {
            System.out.println("digit is not palindrome : " + reverse);
        }
    }
}
