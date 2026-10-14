//! SECOND LARGEST ELEMENT FINDING USINNG RETURN TYPE RECURSION ALL EDGE CASES
// public class day42 {

//     static int largest(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return arr[i];
//         }
//         int largestR = largest(arr, i + 1);
//         if (arr[i] > largestR) {
//             return arr[i];
//         }
//         return largestR;
//     }
//     static int secondLargest(int arr[], int i, int largest) {
//         if (i == arr.length) {
//             return Integer.MIN_VALUE;
//         }
//         int second = secondLargest(arr, i + 1, largest);
//         if (arr[i] < largest && arr[i] > second) {
//             return arr[i];
//         }
//         return second;
//     }
//     void main() {
//         int[] num = {20, 10, 20, 4};
//         int max = largest(num, 0);
//         int res = secondLargest(num, 0, max);
//         if (res == Integer.MIN_VALUE) {
//             System.out.println("NO  second distinct element");
//         } else {
//             System.out.println(res);
//         }
//     }
// }
// public class day42 {
//     static boolean isSorted(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true;
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false;
//         } else {
//             return isSorted(arr, i + 1);
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 40, 40};
//         boolean res = isSorted(num, 0);
//         System.out.println(res);
//     }
// }
// public class day42 {
//     static int firstOccurence(int arr[], int i, int target) {
//         if (i == arr.length) {
//             return -1;
//         }
//         if (arr[i] == target) {
//             return i;
//         }
//         return firstOccurence(arr, i + 1, target);
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 32, 12, 10, 32, 32};
//         int res = firstOccurence(num, 0, 32);
//         if (res == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("First  occured at index : " + res);
//         }
//     }
// }
// public class day42 {
//     static int lastOccurence(int arr[], int i, int target) {
//         if (i < 0) {
//             return -1;
//         }
//         if (arr[i] == target) {
//             return i;
//         }   
//         return lastOccurence(arr, i - 1, target);
//     }
//     public static void main(String args[]) {
//         int[] num = {7, 20, 30};
//         int res = lastOccurence(num, num.length - 1, 7);
//         if (res == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("last  occured at index : " + res);
//         }
//     }
// }
// public class day42 {
//     static boolean isPalindrome(String str) {
//         int j = str.length() - 1;
//         for (int i = 0; i < j; i++) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             j--;
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "madad";
//         boolean res = isPalindrome(str);
//         System.out.println(res);
//     }
// }
class day42 {

    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);

    }

    public static void main(String args[]) {
        String str = "madam";
        boolean res = isPalindrome(str, 0, str.length() - 1);
        System.out.println(res);
    }

}
