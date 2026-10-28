// ------------------------------------------FROM DAY 47 TO DAY 51 RECALL SESSIONS ----------------------------------
// public class day49 {
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
//         int num[] = {10, 20, 30, 40, 20, 30};
//         int res = duplicate(num);
//         System.out.println("Duplicate : " + res);
//     }
// }
// public class day49 {
//     static double average(int arr[]) {
//         double total = 0;
//         for (int i = 0; i < arr.length; i++) {
//             total = total + arr[i];
//         }
//         return (double) total / arr.length;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 40, 50, 35};
//         System.out.println(average(num));
//     }
// }
// public class day49 {
//     static int smallest(int arr[]) {
//         int smallest = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 432, 23, 1, 45};
//         int res = smallest(num);
//         System.out.println(res);
//     }
// }
// public class day49 {
//     static int second(int arr[]) {
//         int smallest = arr[0];
//         int second = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < smallest) {
//                 second = smallest;
//                 smallest = arr[i];
//             } else if (arr[i] < second && arr[i] > smallest) {
//                 second = arr[i];
//             }
//         }
//         return second;
//     }
//     public static void main(String args[]) {
//         int num[] = {5, 5, 5, 5};
//         int res = second(num);
//         if (res == Integer.MAX_VALUE) {
//             System.out.println("No second smallest");
//         } else {
//             System.out.println(res);
//         }
//     }
// }
// public class day49 {
//     static void movezero(int arr[]) {
//         int pos = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 arr[pos] = arr[i];
//                 pos++;
//             }
//         }
//         for (int i = pos; i < arr.length; i++) {
//             arr[i] = 0;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 0, 33, 13, 0, 24, 0, 32, 1, 0, 1, 4};
//         movezero(num);
//         for (int value : num) {
//             System.out.print(value + " ");
//         }
//     }
// }
// public class day49 {
//     static int duplicate(int arr[]) {
//         int pos = 1;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 pos++;
//             }
//         }
//         return pos;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 10, 20, 20, 30, 30, 40};
//         int res = duplicate(num);
//         System.out.print(res);
//     }
// }
// public class day49 {
//     static boolean sorted(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] > arr[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 30, 40};
//         boolean res = sorted(num);
//         System.out.println(res);
//     }
// }
// public class day49 {
//     static String neither(int arr[]) {
//         boolean ascending = true;
//         boolean descending = true;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] < arr[i]) {
//                 descending = false;
//             } else if (arr[i - 1] > arr[i]) {
//                 ascending = false;
//             }
//         }
//         if (ascending && descending) {
//             return "equal";
//         } else if (ascending && !descending) {
//             return "ascending";
//         } else if (!ascending && descending) {
//             return "descending";
//         }
//         return "neither";
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 30, 20, 10};
//         String res = neither(num);
//         System.out.println(res);
//     }
// }
// public class day49 {
//     static int frequency(int arr[], int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     static int mostfrequent(int arr[]) {
//         int mostfrequent = arr[0];
//         int highestfreq = frequency(arr, arr[0]);
//         for (int i = 0; i < arr.length; i++) {
//             int count = frequency(arr, arr[i]);
//             if (count > highestfreq) {
//                 mostfrequent = arr[i];
//                 highestfreq = count;
//             }
//         }
//         return mostfrequent;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 20, 42, 42, 55, 42, 456};
//         int res = mostfrequent(num);
//         System.out.println(res);
//     }
// }
// public class day49 {
//     static int count(String str, char target) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     static void charfrequency(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             boolean alreadyseen = false;
//             for (int j = 0; j < i; j++) {
//                 if (str.charAt(j) == ch) {
//                     alreadyseen = true;
//                 }
//             }
//             if (alreadyseen) {
//                 continue;
//             } else {
//                 int count = count(str, ch);
//                 System.out.println(ch + " >  " + count);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         String str = "banana";
//         charfrequency(str);
//     }
// }
public class day49 {

    static int[] firstlast(int arr[], int target) {

        int first = -1;
        int last = -1;

        int ar[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
                ar[0] = first;
                ar[1] = last;
            }

        }
        return ar;

    }

    public static void main(String args[]) {

        int num[] = {10, 43, 43, 55, 24, 43};
        int res[] = firstlast(num, 43);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
    
