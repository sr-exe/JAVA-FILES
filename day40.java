// ! RECALL
// public class day40 {

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
//         int num[] = {244, 12, 7, 1, 7, 1, 7, 43};
//         int res = countOccurence(num, 0, 7, 0);
//         System.out.print(res);
//     }
// }
//! returns -1 if no second largest but there can be -1 itself second largesst so not a robust solution
// public class day40 {
//     static int secondLargest(int arr[], int i, int largest,
//             int second, boolean found) {
//         // Base case
//         if (i == arr.length) {
//             if (found) {
//                 return second;
//             }
//             return -1;
//         }
//         if (arr[i] > largest) {
//             // Previous largest becomes second-largest
//             second = largest;
//             largest = arr[i];
//             found = true;
//         } else if (arr[i] < largest
//                 && (!found || arr[i] > second)) {
//             // Found a distinct second-largest candidate
//             second = arr[i];
//             found = true;
//         }
//         return secondLargest(arr, i + 1, largest, second, found);
//     }
//     public static void main(String args[]) {
//         int num[] = {13, 13, 13, 13, 12};
//         int result = secondLargest(num, 1, num[0], Integer.MIN_VALUE, false);
//         System.out.println("Second largest: " + result);
//     }
// }
//! robust solution but not done ------->
import java.util.OptionalInt;

public class day40 {

    static OptionalInt secondLargest(int arr[], int i, int largest, int second, boolean found) {

        // Base case
        if (i == arr.length) {
            if (found) {
                return OptionalInt.of(second);
            }
            return OptionalInt.empty();
        }

        if (arr[i] > largest) {
            // Old largest becomes second-largest
            second = largest;
            largest = arr[i];
            found = true;

        } else if (arr[i] < largest
                && (!found || arr[i] > second)) {

            // Update second-largest distinct value
            second = arr[i];
            found = true;
        }

        return secondLargest(
                arr, i + 1, largest, second, found);
    }

    static OptionalInt secondLargest(int arr[]) {

        // Empty or single-element array
        if (arr.length < 2) {
            return OptionalInt.empty();
        }

        return secondLargest(
                arr, 1, arr[0], 0, false);
    }

    public static void main(String args[]) {

        int num[] = {13, 13, 13, 13};

        OptionalInt result = secondLargest(num);

        if (result.isPresent()) {
            System.out.println("Second largest: " + result.getAsInt());
        } else {
            System.out.println("No second-largest distinct element");
        }
    }
}
