
// public class day20 {
//     static boolean isPalindrome(String str) {
//         int j = str.length() - 1;
//         for (int i = 0; i < j; i++) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         boolean res = isPalindrome("naman");
//         System.out.println("Palindrome : " + res);
//     }
// }
// public class day20 {
//     static boolean isPalindrome(String str) {
//         int i = 0;
//         int j = str.length() - 1;
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         boolean res = isPalindrome("naman");
//         System.out.println("Palindrome : " + res);
//     }
// }
// Palindrome : true
// public class day20 {
//     static boolean isPalindromeIgnoreCase(String str) {
//         int i = 0;
//         int j = str.length() - 1;
//         str = str.toLowerCase();
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         boolean res = isPalindromeIgnoreCase("MAdam");
//         System.out.println("Palindrome : " + res);
//     }
// }
// Palindrome : true
// public class day20 {
//     static int countChar(String str, char target) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == target) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int res = countChar("programming", 'g');
//         System.out.println("occured :" + res);
//     }
// }
// occured :2
public class day20 {

    static int countChar(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    static void charFrequency(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (alreadySeen(str, i)) {
                continue;
            }
            int frequency = countChar(str, str.charAt(i));
            System.out.println(str.charAt(i) + " > " + frequency);
        }
    }

    static boolean alreadySeen(String str, int index) {

        for (int i = 0; i < index; i++) {
            if (str.charAt(i) == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        charFrequency("programming");
    }
}
