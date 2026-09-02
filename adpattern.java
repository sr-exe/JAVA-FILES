
// public class adpattern {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// //-----O/P------>>> 
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// public class adpattern {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int spaces = n - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// O/P------> 
//     *****
//    *****
//   *****
//  *****
// *****
// public class adpattern {
//     public static void main(String args[]) {
//         int n = 5;
//         int m = 5;
//         for (int i = 1; i <= n; i++) {
//             int spaces = n - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 5; j++) {
//                 if (i == 1 || j == 1 || i == m || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// O/P-------->
//     *****
//    *   *
//   *   *
//  *   *
// *****
// public class adpattern {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int spaces = n - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// O/P -------> 
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
// ----------------PALINDROME PATTERN----------------
// public class adpattern {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int spaces = n - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// OP -------------> 
//     1
//    212
//   32123
//  4321234
// 543212345
public class adpattern {

    public static void main(String args[]) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// ---------OP--------->>
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *



