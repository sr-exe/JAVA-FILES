
// public class day24 {
//     static void moveZero(int arr[]) {
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
//         int num[] = {10, 0, 40, 0,
//      10, 4, 53, 0, 0, 3};
//     moveZero(num);
// for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// 10 40 10 4 53 3 0 0 0 0 
// public class day24 {
//     static int duplicate(int arr[]) {
//         int pos = 1;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 arr[pos] = arr[i];
//                 pos++;
//             }
//         }
//         return pos;
//     }
//     public static void main(String args[]) {
//         int num[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
//         int res = duplicate(num);
//         for (int i = 0; i < res; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day24 {
//     static void moveZero(int arr[]) {
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
//         int num[] = {10, 0, 224, 0, 13, 0, 31, 34, 0};
//         moveZero(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day24 {
//     static int duplicate(int arr[]) {
//         int pos = 1;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 arr[pos] = arr[i];
//                 pos++;
//             }
//         }
//         return pos;
//     }
//     public static void main(String args[]) {
//         int num[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
//         int res = duplicate(num);
//         for (int i = 0; i < res; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// ! 1 2 3 4 5 ---OP--------------->
// public class day24 {
//     static boolean sorted(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i - 1] > arr[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         int num[] = {1, 2, 3, 4, 4, 5};
//         System.out.println(sorted(num));
//     }
// }
// sorted : true
public class day24 {

    static String neither(int arr[]) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                descending = false;
            } else if (arr[i - 1] > arr[i]) {
                ascending = false;
            }

        }
        if (ascending && !descending) {
            return "ascending";
        } else if (descending && !ascending) {
            return "descending";
        } else if (ascending && descending) {
            return "equal";
        }
        return "neither";

    }

    public static void main(String args[]) {
        int num[] = {50, 50, 50};
        System.out.println(neither(num));
    }

}
