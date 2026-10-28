// RECALL SESSIONS ______________________>>>>>>>



// public class day50 {
//     static void findindex(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 20, 20, 40, 5, 20};
//         findindex(num, 20);
//     }
// }
// public class day50 {
//     static int countoccurence(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     static int[] findallinndex(int arr[], int target) {
//         int count = countoccurence(arr, target);
//         int pos = 0;
//         int ar[] = new int[count];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 ar[pos] = i;
//                 pos++;
//             }
//         }
//         return ar;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 20, 42, 40, 20, 53, 20};
//         int res[] = findallinndex(num, 20);
//         for (int i = 0; i < res.length; i++) {
//             System.out.print(res[i] + " ");
//         }
//     }
// }
// public class day50 {
//     static int binsearch(int arr[], int target) {
//         int right = arr.length - 1;
//         int left = 0;
//         while (left <= right) {
//             int middle = (left + right) / 2;
//             if (target == arr[middle]) {
//                 return middle;
//             } else if (target > arr[middle]) {
//                 left = middle + 1;
//             } else {
//                 right = middle - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 10, 20, 20, 30, 40, 50, 60};
//         int res = binsearch(num, 60);
//         System.out.println(res);
//     }
// }
// public class day50 {
//     static void selection(int arr[]) {
//         int temp;
//         for (int i = 0; i < arr.length; i++) {
//             int min = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {13, 3422, 14, 53, 14, 6, 63, 124};
//         selection(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }                       
// }
// public class day50 {
//     static void selection(int arr[]) {
//         int temp;
//         for (int i = 0; i < arr.length; i++) {
//             int max = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[max]) {
//                     max = j;
//                 }
//             }
//             temp = arr[max];
//             arr[max] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {193, 13, 42, 53, 53, 24};
//         selection(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
public class day50 {

    static void insertion(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int num[] = {120, 42, 633, 14, 74, 24};
        insertion(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
