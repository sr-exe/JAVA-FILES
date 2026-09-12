
// public class day13 {
//     static int indexFind(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 32, 53, 54, 24};
//         System.out.println("Index : " + indexFind(num, 53 ));
//         System.out.println("Index : " + indexFind(num, 24));
//         System.out.println("Index : " + indexFind(num, 99));
//     }
// }
// Index : 2
// Index : 4
// Index : -1
// public class day13 {
//     static int findOccurance(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 10, 32, 13, 42, 10, 2, 2, 12, 664};
//         int res = findOccurance(num, 10);
//         System.out.println("Occurance : " + res);
//     }
// }
// Occurance : 3
// public class day13 {
//     static int sumOfElements(int arr[]) {
//         int sum = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 32, 42, 54, 24};
//         int res = sumOfElements(num);
//         System.out.println("Sum : " + res);
//     }
// }
// Sum : 162
// public class day13 {
//     static void reverse(int arr[]) {
//         int temp;
//         int j = arr.length - 1;
//         for (int i = 0; i < j; i++) {
//             temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             j--;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 40, 50, 60};
//         reverse(num);
//         System.out.print("Reverse : ");
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// Reverse : 60 50 40 30 20 10 
// public class day13 {
//     static int secondL(int arr[]) {
//         int second;
//         int largest;
//         if (arr[0] > arr[1]) {
//             largest = arr[0];
//             second = arr[1];
//         } else {
//             largest = arr[1];
//             second = arr[0];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 second = largest;
//                 largest = arr[i];
//             } else if (arr[i] > second) {
//                 second = arr[i];
//             }
//         }
//         return second;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 32, 42, 543, 2344, 13, 3222, 5, 432, 3221};
//         int res = secondL(num);
//         System.out.println("Second largest : " + res);
//     }
// }
// Second largest : 3221
// public class day13 {

//     static int duplicate(int arr[]) {

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {

//                 if (arr[i] == arr[j]) {
//                     return arr[i];
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 10, 32, 43};
//         System.out.println("Duplicate: " + duplicate(num));

//     }
// }
// Duplicate: 10