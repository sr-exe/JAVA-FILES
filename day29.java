
// public class day29 {
//     static int countOccurence(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     static int[] linear(int arr[], int target) {
//         int count = countOccurence(arr, target);
//         int ar[] = new int[count];
//         int pos = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 ar[pos] = i;
//                 pos++;
//             }
//         }
//         return ar;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 10, 39, 49, 20, 10};
//         int res[] = linear(num, 20);
//         for (int i = 0; i < res.length; i++) {
//             System.out.println(res[i]);
//         }
//     }
// }
// public class day29 {
//     static int findLastIndex(int arr[], int target) {
//         int lastIndex = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 lastIndex = i;
//             }
//         }
//         return lastIndex;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 10, 20, 30, 10};
//         int res = findLastIndex(num, 10);
//         System.out.println("Last Index : " + res);
//     }
// }
public class day29 {

    static void bubbleSort(int arr[]) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String args[]) {
        int num[] = {10, 20, 30, 41, 38, 42, 13};
        bubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
