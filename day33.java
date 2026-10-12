
// public class day33 {
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
//         int num[] = {13, 32, 14, 63, 29};
//         insertion(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day33 {
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
//         int num[] = {35, 15, 74, 46, 15};
//         bubble(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day33 {
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
//         int num[] = {35, 28, 53, 82, 43};
//         selection(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
//!!! ------------------> RECURSION REMAINING <------------------------------
public class day33 {

    static void print(int n) {

    }

    public static void main(String args[]) {

    }
}
