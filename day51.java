
// public class day51 {
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
//         int num[] = {18, 42, 53, 13, 53, 134};
//         selection(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
// public class day51 {
//     static boolean isAnagram(String a, String b) {
//         if (a.length() != b.length()) {
//             return false;
//         }
//         int freq[] = new int[26];
//         for (int i = 0; i < a.length(); i++) {
//             int index = a.charAt(i) - 'a';
//             freq[index]++;
//         }
//         for (int i = 0; i < b.length(); i++) {
//             int index = b.charAt(i) - 'a';
//             freq[index]--;
//         }
//         for (int count : freq) {
//             if (count != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String a = "silent";
//         String b = "listen";
//         boolean op = isAnagram(a, b);
//         System.out.println(op);
//     }
// }
// public class day51 {
//     static void insertion(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int key = arr[i];
//             int j = i - 1;
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = key;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {13, 134, 42, 42, 52, 134};
//         insertion(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
public class day51 {

    static int duplicate(int arr[]) {

        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[pos]) {
                pos++;
                arr[pos] = arr[i];
            }
        }
        return pos + 1;
    }

    public static void main(String args[]) {
        int num[] = {10, 10, 20, 20, 30, 40, 40, 50};
        int res = duplicate(num);
        for (int i = 0; i < res; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
