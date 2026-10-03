
// public class day25 {
//     static int duplicate(int arr[]) {
//         int pos = 1;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 arr[pos] = arr[i];
//                 pos++;
//             }
//         }
//         return pos;
//     }
//     public static void main(String args[]) {
//         int num[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
//         int res = duplicate(num);
//         for (int i = 0; i < res; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// 1 2 3 4 5
// public class day25 {
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
//         int num[] = {10, 2, 0, 28, 0, 3, 0, 19, 0, 27};
//         moveZero(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day25 {
//     static int secondDistinct(int arr[]) {
//         int largest = arr[0];
//         int second = Integer.MIN_VALUE;
//         boolean secondFound = false;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 second = largest;
//                 largest = arr[i];
//                 secondFound = true;
//             } else if (arr[i] > second && arr[i] < largest) {
//                 second = arr[i];
//                 secondFound = true;
//             }
//         }
//         if (!secondFound) {
//             return -1;
//         }
//         return second;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 120, 10, 10, 10};
//         int res = secondDistinct(num);
//         System.out.println("Second Distinct largest : " + res);
//     }
// }
public class day25 {

    static int frequency(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    static int mostFrequent(int arr[]) {
        int mostFrequent = arr[0];
        int highestFrequency = frequency(arr, arr[0]);

        for (int i = 0; i < arr.length; i++) {
            int count = frequency(arr, arr[i]);
            if (count > highestFrequency) {
                mostFrequent = arr[i];
                highestFrequency = count;
            }
        }
        return mostFrequent;
    }

    public static void main(String args[]) {
        int num[] = {1, 12, 20, 332, 30, 10, 49, 20, 20};
        int res = mostFrequent(num);
        System.out.println("Most Frequent : " + res);

    }
}
