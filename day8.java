// ---------RECALL----------
// class day8{
//     public static void main(String args[]){
//         for(int i = 1; i <= 10; i++){
//             System.out.print(i);
//         }
//     }
// }

// import java.util.Scanner;
// public class day8 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int count = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             count++;
//             num = num / 10;
//         }
//         System.out.println("Digits : " + count);
//     }
// }
// public class day8 {
//     static int square(int num) {
//         return num * num;
//     }
//     public static void main(String args[]) {
//         int result = square(5);
//         System.out.println("Square : " + result);
//     }
// }
// --------------ARRAYS-------------------
// public class day8 {
//     public static void main(String args[]) {
//         int[] arr = {10, 20, 30, 40, 50};
//         System.out.println(arr[0]);
//         System.out.println(arr[2]);
//         System.out.println(arr[4]);
//     }
// }
// 10
// 30
// 50
// public class day8 {
//     public static void main(String args[]) {
//         int[] arr = {10, 20, 30, 40, 50};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
// 10
// 20
// 30
// 40
// 50
// public class day8 {
//     public static void main(String args[]) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         System.out.println("Sum : " + sum);
//     }
// }
// Sum : 150
// public class day8 {
//     public static void main(String args[]) {
//         int largest = 0;
//         int arr[] = {22, 39, 12, 53, 24, 14};
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         System.out.println("Largest : " + largest);
//     }
// }
// Largest : 53
// public class day8 {
//     public static void main(String args[]) {
//         int smallest = 1000;
//         int arr[] = {22, 39, 12, 53, 24, 14};
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//         }
//         System.out.println("Smallest : " + smallest);
//     }
// }
// Smallest : 12
// public class day8 {
//     public static void main(String args[]) {
//         int count = 0;
//         int arr[] = {10, 23, 5, 4, 12, 54};
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 count++;
//             }
//         }
//         System.out.println("Even digits : " + count);
//     }
// }
// Even digits : 4
// public class day8 {
//     public static void main(String args[]) {
//         int arr[] = {10, 20, 30, 40, 50};
//         for (int i = 4; i >= 0; i--) {
//             System.out.println(arr[i]);
//         }
//     }
// }
// 50
// 40
// 30
// 20
// 10
// public class day8 {
//     public static void main(String args[]) {
//         boolean found = false;
//         int arr[] = {10, 34, 29, 48, 23};
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 29) {
//                 found = true;
//             }
//         }
//         if (found == true) {
//             System.out.println("Found ");
//         } else {
//             System.out.println("Not found ");
//         }
//     }
// }
// Found 
public class day8 {

    public static void main(String args[]) {
        int arr[] = {10, 20, 37, 40, 50};
        float avg = 0;
        float total = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];

        }
        total = avg / arr.length;
        System.out.println("Average : " + total);

    }
}
// Average : 31.4
