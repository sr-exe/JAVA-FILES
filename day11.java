
// public class day11 {
//     static boolean newArray(int arr[], int target) {
//         boolean ok = false;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 ok = true;
//             }
//         }
//         return ok;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 32, 53, 39, 29};
//         System.out.println(newArray(numbers, 39));
//         System.out.println(newArray(numbers, 20));
//     }
// }
// true
// false
// public class day11 {
//     static int indexS(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 43, 32, 63, 22};
//         System.out.println(indexS(numbers, 43));
//         System.out.println(indexS(numbers, 22));
//     }
// }
// 1
// 4
// public class day11 {
//     static int newArray(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 20, 20, 20, 109, 10};
//         System.out.println(newArray(numbers, 10));
//         System.out.println(newArray(numbers, 20));
//     }
// }
// 2
// 3
// public class day11 {
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
//         int numbers[] = {10, 229, 308, 4012, 503};
//         reverse(numbers);
//         System.out.print("Reverse : ");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }
// Reverse : 503 4012 308 229 10 
public class day11 {

    static double averageI(int arr[]) {
        double total = 0.0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        return total / arr.length;

    }

    public static void main(String args[]) {
        int numbers[] = {10, 20, 30, 40, 50};
        double res = averageI(numbers);
        System.out.println("Average : " + res);
    }
}
// Average : 30.0
