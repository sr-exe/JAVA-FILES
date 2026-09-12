// -----------RECALL ---------------------
// public class day14 {
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
//         int num[] = {10, 20, 30, 40, 50};
//         reverse(num);
//         System.out.print("Reverse :");
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// Reverse :50 40 30 20 10 
// public class day14 {

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
//         int num[] = {10, 22, 43, 31, 44, 133};
//         int res = secondL(num);
//         System.out.println("Second largest : " + res);
//     }
// }
// Second largest : 44
// public class day14 {
//     static int occurance(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 32, 13, 10, 10, 32, 42};
//         System.out.println("occurance : " + occurance(num, 10));
//     }
// }
// occurance : 3
public class day14 {

    static int frequency(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int num[] = {10, 32, 10, 42, 10, 20, 20};

        for (int i = 0; i < num.length; i++) {
            boolean alreadySeen = false;

            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    alreadySeen = true;
                    break;
                }
            }
            if (!alreadySeen) {
                int count = frequency(num, num[i]);
                System.out.println(num[i] + " > " + count);
            }
        }
    }
}
// 10 > 3
// 32 > 1
// 42 > 1
// 20 > 2
