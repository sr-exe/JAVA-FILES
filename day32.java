
// public class day32 {
//     static int secondLargest(int arr[]) {
//         int secondLargest = Integer.MIN_VALUE;
//         int largest = arr[0];
//         boolean secondFound = false;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//                 secondFound = true;
//             } else if (arr[i] < largest && arr[i] > secondLargest) {
//                 secondLargest = arr[i];
//                 secondFound = true;
//             }
//         }
//         if (!secondFound) {
//             return -1;
//         }
//         return secondLargest;
//     }
//     public static void main(String args[]) {
//         int num[] = {14, 24, 42, 82, 82, 47, 47};
//         int res = secondLargest(num);
//         System.out.print("Second largest : " + res);
//     }
// }
// public class day32 {
//     static void moveZeros(int arr[]) {
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
//         int num[] = {38, 14, 0, 348, 0, 17, 0, 38, 18};
//         moveZeros(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
    public class day32 {

        static int removeDuplicate(int arr[]) {
            int pos = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr[pos]) {
                    pos++;
                    arr[pos] = arr[i];
                }
            }
            return pos + 1;
        }

        public static void main(String args[]) {
            int num[] = {1, 1, 2, 2, 2, 3, 3, 4, 5, 5};
            int res = removeDuplicate(num);
            for (int i = 0; i < res; i++) {
                System.out.print(num[i] + " ");
            }
        }
    }
// public class day32 {

//     static int[] twoSum(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{-1, -1};
//     }
//     public static void main(String[] args) {
//         int arr[] = {2, 7, 11, 15};
//         int target = 9;
//         int result[] = twoSum(arr, target);
//         System.out.println(result[0] + " " + result[1]);
//     }
// }
