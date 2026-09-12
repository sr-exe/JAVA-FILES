// -----RECALL------------
// public class day15 {

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
//         int num[] = {19, 53, 13, 55, 12, 52};
//         reverse(num);
//         System.out.print("Reverse : ");
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// REVERSE DONE
// public class day15 {
//     static int secondL(int arr[]) {
//         int largest;
//         int second;
//         if (arr[0] > arr[1]) {
//             largest = arr[0];
//             second = arr[1];
//         } else {
//             largest = arr[1];
//             second = arr[0];
//         }
//         for (int i = 2; i < arr.length; i++) {
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
//         int num[] = {193, 13, 5443, 1334, 1342, 2432};
//         int res = secondL(num);
//         System.out.println("Second largest  : " + res);
//     }
// }
// SECOND LARGEST DONE
// public class day15 {
//     static int frequency(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 10, 10, 43, 392, 43, 13, 533};
//         for (int i = 0; i < num.length; i++) {
//             boolean alreadySeen = false;
//             for (int j = 0; j < i; j++) {
//                 if (num[i] == num[j]) {
//                     alreadySeen = true;
//                     break;
//                 }
//             }
//             if (!alreadySeen) {
//                 int count = frequency(num, num[i]);
//                 System.out.println(num[i] + " > " + count);
//             }
//         }
//     }
// }
//FREQUENCY OF EACH ELEMENT DONE
public class day15 {

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
        int mostfrequent = arr[0];
        int highestFrequency = frequency(arr, arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int count = frequency(arr, arr[i]);

            if (count > highestFrequency) {
                mostfrequent = arr[i];
                highestFrequency = count;
            }
        }
        return mostfrequent;
    }

    public static void main(String args[]) {
        int num[] = {10, 10, 20, 13, 2, 3, 23, 2, 3, 3,};
        int res = mostFrequent(num);
        System.out.println("Most frequent : " + res);
    }
}
// Most frequent : 3
