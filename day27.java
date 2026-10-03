
// public class day27 {
//     static void findIndex(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 40, 50, 30, 30};
//         findIndex(num, 30);
//     }
// }
public class day27 {

    static int countOccurence(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;

            }
        }
        return count;
    }

    static int[] findAllIndex(int arr[], int target) {
        int pos = 0;
        int count = countOccurence(arr, target);
        int ar[] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ar[pos] = i;

                pos++;
            }
        }
        return ar;
    }

    public static void main(String args[]) {
        int num[] = {10, 20, 10, 20, 10, 20, 39, 43,};
        int res[] = findAllIndex(num, 20);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
// public class day27 {
//     static int lastIndex(int arr[], int target) {
//         int lastIndex = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 lastIndex = i;
//             }
//         }
//         return lastIndex;
//     }
//     static int firstIndex(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 10, 40, 10};
//         int res1 = firstIndex(num, 10);
//         System.out.println("First index : " + res1);
//         int res = lastIndex(num, 10);
//         System.out.println("Last index : " + res);
//     }
// }
// public class day27 {

//     static int[] firstLast(int arr[], int target) {
//         int firstIndex = -1;
//         int lastIndex = -1;
//         int ar[] = new int[2];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 if (firstIndex == -1) {
//                     firstIndex = i;
//                 }
//                 lastIndex = i;
//                 ar[0] = firstIndex;
//                 ar[1] = lastIndex;
//             }
//         }
//         return ar;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 49, 30, 30, 20, 30};
//         int res[] = firstLast(num, 30);
//         for (int i = 0; i < res.length; i++) {
//             System.out.println(res[i]);
//         }
//     }
// }
