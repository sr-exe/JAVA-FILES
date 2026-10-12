
// public class day35 {
//     static int sumrec(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         return n + sumrec(n - 1);
//     }
//     public static void main(String args[]) {
//         int res = sumrec(5);
//         System.out.println(res);
//     }
// }
// public class day35 {
//     static void insertion(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int key = arr[i];
//             int j = i - 1;
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = key;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {284, 14, 54, 35, 643};
//         insertion(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day35 {
//     static void bubble(int arr[]) {
//         int temp;
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j + 1];
//                     arr[j + 1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {24, 64, 14, 64, 24};
//         bubble(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day35 {
//     static void selection(int arr[]) {
//         int temp;
//         for (int i = 0; i < arr.length; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {84, 13, 65, 24, 76, 134};
//         selection(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day35 {
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
// import java.util.Scanner;
// public class day35 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number : ");
//         int b = sc.nextInt();
//         int c = a + b;
//         System.out.print("Sum = " + c);
//     }
// }
// public class day35 {

//     static int fact(int n) {
//         if (n == 0) {
//             return 1;
//         }

//         return n * fact(n - 1);

//     }

//     public static void main(String args[]) {
//         int res = fact(5);
//         System.out.print("Factorial : " + res);
//     }
// }
// public class day35{

//     static 
// }