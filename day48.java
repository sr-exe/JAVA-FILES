//! RECALL SESSION

// import java.util.*;
// public class day48 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         System.out.print("sum : " + sum);
//     }
// }
// import java.util.*;
// public class day48 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int reverse = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }
//         System.out.print("Reverse : " + reverse);
//     }
// }
// import java.util.Scanner;
// public class day48 {
//     static void reverse(int num) {
//         int original = num;
//         int reverse = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }
//         if (original == reverse) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not palindrome");
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int n = sc.nextInt();
//         reverse(n);
//     }
// }
// public class day48 {
//     static int largest(int arr[]) {
//         int largest = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     static int second(int arr[]) {
//         int second = Integer.MIN_VALUE;
//         int largest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 second = largest;
//                 largest = arr[i];
//             } else if (arr[i] > second && arr[i] < largest) {
//                 second = arr[i];
//             }
//         }
//         return second;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 10, 20, 20, 43, 14, 43};
//         int res = second(num);
//         int res2 = largest(num);
//         System.out.println("largest : " + res2);
//         System.out.println("Second largest : " + res);
//     }
// }
// public class day48 {
//     static void main(String args[]) {
//         String s = "shubham";
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             System.out.println(ch);
//         }
//     }
// }
// public class day48 {
//     static int count(String str) {
//         String vowels = "aeiouAEIOU";
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (vowels.indexOf(ch) != -1) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         String str = "shubham";
//         int res = count(str);
//         System.out.println("Vowel count: " + res);
//     }
// }
// public class day48 {
//     static int count(String str) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= '0' && ch <= '9') {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         String str = "shu234ndj173f";
//         int res = count(str);
//         System.out.println("Count : " + res);
//     }
// }
// public class day48 {
//     static int countSpace(String str) {
//         int count = 0;
//         String s = " ";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == ' ') {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         String str = "heellow everyonne mera naam hai tun tun";
//         int res = countSpace(str);
//         System.out.println("count : " + res);
//     }
// }
// public class day48 {
//     static String reverse(String str) {
//         String reverse = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             char ch = str.charAt(i);
//             reverse = reverse + ch;
//         }
//         return reverse;
//     }
//     static boolean palindrome(String str) {
//         String reverse = reverse(str);
//         return str.equals(reverse);
//     }
//     public static void main(String args[]) {
//         String str = "shubham";
//         boolean res = palindrome(str);
//         String res1 = reverse(str);
//         String s = reverse(str);
//         System.out.println(res1);
//         System.out.println(res);
//     }
// }
// public class day48 {
//     static boolean palindrome(String str) {
//         int j = str.length() - 1;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             j--;
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "madam";
//         boolean res = palindrome(str);
//         System.out.println(res);
//     }
// }
public class day48 {

    static int countchar(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "shubham";

        int res = countchar(str, 'h');
        System.out.println(res);
    }
}
