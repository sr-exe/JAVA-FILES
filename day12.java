
// class day12 {
//     static int findLargest(int arr[]) {
//         int largest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 231, 324, 13, 432, 643, 65, 22};
//         int res = findLargest(num);
//         System.out.println("Largest : " + res);
//     }
// }
// Largest : 643
// public class day12 {
//     static int findSmallest(int arr[]) {
//         int smallest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 smallest = assrr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 301, 424, 48, 9};
//         int res = findSmallest(num);
//         System.out.println("Smallest : " + res);
//     }
// }
// Smallest : 9
// public class day12 {
//     static void countEvenOdd(int arr[]) {
//         int even = 0;
//         int odd = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//         }
//         System.out.println("Even: " + even);
//         System.out.println("Odd: " + odd);
//     }
//     public static void main(String args[]) {
//         int[] num = {10, 25, 8, 42, 17, 6, 31};
//         countEvenOdd(num);
//     }
// }
// Even: 4
// Odd: 3
// public class day12 {
//     static boolean searchElement(int arr[], int target) {
//         boolean found = false;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 found = true;
//             }
//         }
//         return found;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 221, 53, 13, 54};
//         System.out.println(searchElement(num, 13));
//         System.out.println(searchElement(num, 99));
//     }
// }
// true
// false
// public class day12 {
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
//         int number[] = {110, 32, 14, 23, 42, 13};
//         int res = secondL(number);
//         System.out.println("Second largest : " + res);
//     }
// }
// Second largest : 42
// public class day12 {
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
//         int numbers[] = {10, 20, 30, 40, 50};
//         reverse(numbers);
//         System.out.print("Reverse : ");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }
// Reverse : 50 40 30 20 10 
// public class day12 {
//     static double average(int arr[]) {
//         int total = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             total = total + arr[i];
//         }
//         return (double) total / arr.length;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 34, 13, 53, 21};
//         double res = average(num);
//         System.out.println("Average : " + res);
//     }
// }
// Average : 26.2
public class day12 {

    static int index(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int num[] = {10, 42, 54, 16, 31};
        System.out.println("index : " + index(num, 54));
    }
}

