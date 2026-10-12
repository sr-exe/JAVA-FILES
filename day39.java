// ! parameterized count occurence of target
// public class day39 {

//     static int countOccurence(int arr[], int i, int target, int count) {
//         if (i == arr.length) {
//             return count;
//         }
//         if (arr[i] == target) {
//             count++;
//         }
//         return countOccurence(arr, i + 1, target, count);
//     }
//     public static void main(String args[]) {
//         int num[] = {13, 13, 43, 13, 38, 13};
//         int res = countOccurence(num, 0, 13, 0);
//         System.out.println("Target occured : " + res);
//     }
// }
// ! return type count occurence 
// public class day39 {
//     static int countOccurence(int arr[], int i, int target) {
//         if (i == arr.length) {
//             return 0;
//         }
//         if (arr[i] == target) {
//             return 1 + countOccurence(arr, i + 1, target);
//         }
//         return countOccurence(arr, i + 1, target);
//     }
//     public static void main(String args[]) {
//         int num[] = {13, 13, 43, 13, 38, 13};
//         int res = countOccurence(num, 0, 13);
//         System.out.println("Target occured : " + res);
//     }
// }
// ! last occurence
// public class day39 {
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
//         int num[] = {13, 52, 13, 13, 134, 13, 1};
//         int res = lastOccurence(num, num.length - 1, 13);
//         System.out.print("last occurence : " + res);
//     }
// }
//! parameterized last occurence
// public class day39 {
//     static int lastOccurence(int arr[], int i, int target, int last) {
//         if (i < 0) {
//             return last;
//         }
//         if (arr[i] == target && last == -1) {
//             last = i;
//         }
//         return lastOccurence(arr, i - 1, target, last);
//     }
//     public static void main(String args[]) {
//         int num[] = {23, 13, 13, 13, 45};
//         int res = lastOccurence(num, num.length - 1, 13, -1);
//         System.out.println("last occurence : " + res);
//     }
// }
// ! first occurence using parameterized recursion
// public class day39 {
//     public static int firstOccurence(int arr[], int i, int target, int first) {
//         if (i == arr.length) {
//             return first;
//         }
//         if (arr[i] == target && first == -1) {
//                first = i;
//         }
//         return firstOccurence(arr, i + 1, target, first);
//     }
//     public static void main(String args[]) {
//         int num[] = {23, 13, 13, 13, 45};
//         int res = firstOccurence(num, 0, 13, -1);
//         System.out.println("first  occurence : " + res);
//     }
// }
// public class day39 {
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
//         int num[] = {1, 13, 13, 13, 53, 134};
//         int res = firstOccurence(num, 0, 13);
//         System.out.print(" First occured at : " + res);
//     }
// }
// public class day39 {
//     static int countOccurence(int arr[], int i, int target) {
//         if (i == arr.length) {
//             return 0;
//         }
//         if (arr[i] == target) {
//             return 1 + countOccurence(arr, i + 1, target);
//         }
//         return countOccurence(arr, i + 1, target);
//     }
//     public static void main(String args[]) {
//         int num[] = {19, 119, 13, 13, 442, 13, 31};
//         int res = countOccurence(num, 0, 13);
//         System.out.println(res);
//     }
// }
// public class day39 {
//     static int countOccurence(int arr[], int i, int target, int count) {
//         if (i == arr.length) {
//             return count;
//         }
//         if (arr[i] == target) {
//             count++;
//         }
//         return countOccurence(arr, i + 1, target, count);
//     }
//     public static void main(String args[]) {
//         int num[] = {19, 119, 13, 13, 442, 13, 31};
//         int res = countOccurence(num, 0, 13, 0);
//         System.out.println(res);
//     }
// }
// public class day39 {
//     static int evencount(int arr[], int i, int count) {
//         if (i == arr.length) {
//             return count;
//         }
//         if (arr[i] % 2 == 0) {
//             count++;
//         }
//         return evencount(arr, i + 1, count);
//     }
//     static int oddcount(int arr[], int i, int count) {
//         if (i == arr.length) {
//             return count;
//         }
//         if (arr[i] % 2 != 0) {
//             count++;
//         }
//         return oddcount(arr, i + 1, count);
//     }
//     public static void main(String args[]) {
//         int num[] = {13, 18, 32, 432, 113};
//         int res = evencount(num, 0, 0);
//         System.out.println("Evens : " + res);
//         int res1 = oddcount(num, 0, 0);
//         System.out.println("Odds : " + res1);
//     }
// }
public class day39 {

    static int sumevens(int arr[], int i, int sum) {
        if (i == arr.length) {
            return sum;
        }

        if (arr[i] % 2 == 0) {
            sum = sum + arr[i];
        }

        return sumevens(arr, i + 1, sum);
    }

    public static void main(String args[]) {
        int num[] = {13, 2, 13, 42, 14};
        int res = sumevens(num, 0, 0);
        System.out.println("Sum : " + res);
    }
}
