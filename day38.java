
// public class day38 {
//     static int sumArray(int arr[], int i) {
//         if (i == arr.length) {
//             return 0;
//         }
//         return arr[i] + sumArray(arr, i + 1);
//     }
//     public static void main(String args[]) {
//         int num[] = {14, 13, 50, 12};
//         int result = sumArray(num, 0);
//         System.out.println(result);
//     }
// }
//! THIS IS LARGEST IN ARRAY PROGRAM BACKWORD USING RETURN CALL
// public class day38 {
//     static int largest(int arr[], int i) {
//         if (i == 0) {
//             return arr[i];
//         }
//         int largestR = largest(arr, i - 1);
//         return Math.max(arr[i], largestR);
//     }
//     public static void main(String args[]) {
//         int num[] = {24, 13, 63, 44, 44, 633, 35};
//         int res = largest(num, num.length - 1);
//         System.out.print(res);
//     }
// }
// ! THIS IS USING PARAMETERIZED RECURSION
// public class day38 {
//     static int largest(int arr[], int i, int max) {
//         if (i == arr.length) {
//             return max;
//         }
//         if (arr[i] > max) {
//             max = arr[i];
//         }
//         return largest(arr, i + 1, max);
//     }
//     public static void main(String args[]) {
//         int num[] = {18, 2, 53, 64, 74, 24};
//         int res = largest(num, 0, num[0]);
//         System.out.print(res);
//     }
// }
//!  COUNT EVEN IN ARRAY WWITH ELSE COZ OF 2 CASES 
// public class day38 {
//     static int countEven(int arr[], int i) {
//         if (i == arr.length) {
//             return 0;
//         }
//         if (arr[i] % 2 == 0) {
//             return 1 + countEven(arr, i + 1);
//         } else {
//             return 0 + countEven(arr, i + 1);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {12, 7, 4, 9, 6};
//         int result = countEven(arr, 0);
//         System.out.println(result);
//     }
// }
// ! WITHOUT ELSE COUNT EVEN IN ARRAY
public class day38 {

    static int countEven(int arr[], int i) {

        if (i == arr.length) {
            return 0;
        }

        if (arr[i] % 2 == 0) {
            return 1 + countEven(arr, i + 1);
        }

        return countEven(arr, i + 1);
    }

    static int countOdd(int arr[], int i) {
        if (i == arr.length) {

            return 0;
        }

        if (arr[i] % 2 != 0) {
            return 1 + countOdd(arr, i + 1);
        }

        return countOdd(arr, i + 1);
    }

    public static void main(String args[]) {
        int num[] = {24, 13, 42, 31, 42};
        int res = countEven(num, 0);
        System.out.println("Even : " + res);
        int res1 = countOdd(num, 0);
        System.out.println("Odd : " + res1);

    }
}
