// // Methods + array

// public class day10 {
//     static void newArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String args[]) {
//         int number[] = {10, 20, 30, 40, 50};
//         newArray(number);
//     }
// }
// 10
// 20
// 30
// 40
// 50
// class day10 {
//     static void newArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {110, 21, 29, 34, 29, 22};
//         newArray(arr);
//     }
// }
// 110
// 34
// 22
// public class day10 {
//     static int sumArray(int arr[]) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 20, 30, 40, 50};
//         int result = sumArray(numbers);
//         System.out.println("Sum : " + result);
//     }
// }
// Sum : 150
// public class day10 {
//     static int findMax(int arr[]) {
//         int largest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {-10, -111, -23, -64, -1334, -54};
//         int result = findMax(numbers);
//         System.out.println("Largest :" + result);
//     }
// }
// Largest : -10
// public class day10 {
//     static int newSmall(int arr[]) {
//         int smallest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 3, 45, 224, 55,};
//         int res = newSmall(numbers);
//         System.out.println("Smallest :" + res);
//     }
// }
// Smallest :3
// public class day10 {
//     static int newArray(int arr[]) {
//         int count = 0;ss
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 12, 5, 64, 23};
//         int res = newArray(numbers);
//         System.out.println("Evens : " + res);
//     }
// }
// Evens : 3
// public class day10 {
//     static int newArray(int arr[]) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 != 0) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 32, 45, 34, 2, 4, 5, 654, 3};
//         int res = newArray(numbers);
//         System.out.println("odd : " + res);
//     }
// }
// odd : 3
// public class day10 {
//     static int evenSum(int arr[]) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 sum = sum + arr[i];
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {24, 2, 4, 5, 21, 86, 56};
//         int res = evenSum(numbers);
//         System.out.println("Even sum : " + res);
//     }
// }
// Even sum : 172
public class day10 {

    static int secondL(int arr[]) {

        int largest;
        int second;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            second = arr[1];

        } else {
            largest = arr[1];
            second = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String args[]) {
        int numbers[] = {23, 53, 14, 65, -13, 43};
        int res = secondL(numbers);
        System.out.println("Second largest : " + res);
    }
}
