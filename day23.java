
// public class day23 {
//     static int secondLargest(int arr[]) {
//         int larget = arr[0];
//         int second = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > larget) {
//                 second = larget;
//                 larget = arr[i];
//             } else if (arr[i] > second && arr[i] != larget) {
//                 second = arr[i];
//             }
//         }
//         return second;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 32, 10, 32, 35, 35, 10};
//         int res = secondLargest(num);
//         System.out.println("Second largest : " + res);
//     }
// }
// ! Second largest : 32 -------> handles duplicate too
// public class day23 {
//     static int sumOfArray(int arr[]) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 40, 50};
//         int res = sumOfArray(num);
//         System.out.println("Sum of Array : " + res);
//     }
// }
// Sum of Array : 150
// public class day23 {
//     static double avgOfArray(int arr[]) {
//         int total = 0;
//         for (int i = 0; i < arr.length; i++) {
//             total += arr[i];
//         }
//         return (double) total / arr.length;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 403, 50};
//         double res = avgOfArray(num);
//         System.out.println("Average : " + res);
//     }
// }
// Average : 102.6
// public class day23 {
//     static int smallestInArray(int arr[]) {
//         int smallest = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 31, 3, 10, 3, 10};
//         int res = smallestInArray(num);
//         System.out.println("Smallest : " + res);
//     }
// }
// Smallest : 3
public class day23 {

    static int secondDistinct(int arr[]) {
        int smallest = arr[0];
        int second = Integer.MAX_VALUE;
        boolean secondFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
                secondFound = true;
            } else if (arr[i] < smallest && arr[i] != smallest) {

                second = arr[i];
                secondFound = true;
            }
        }
        if (!secondFound) {
            return -1;
        }
        return second;

    }

    public static void main(String args[]) {
        int num[] = {3, 3, 3, 3, 3};
        int res = secondDistinct(num);
        System.out.println("Second distinct : " + res);
    }
}
// public class day23 {

//     static void moveZero(int arr[]) {
//         int pos = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 arr[pos] = arr[i];
//                 pos++;
//             }
//         }
//         for (int i = pos; i < arr.length; i++) {
//             arr[i] = 0;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {0, 10, 32, 0, 21, 0, 23, 0, 9};
//         moveZero(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
