
// // public class day19 {
// //     public static void main(String args[]) {
// //         String str = "shubham";
// //         for (int i = 0; i < str.length(); i++) {
// //             System.out.println(str.charAt(i));
// //         }
// //     }
// // }
// // s
// // h
// // u
// // b
// // h
// // a
// // m
// public class day19 {
//     static int countVowels(String str) {
//         int count = 0;
//         String vowels = "aeiou";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (vowels.indexOf(ch) != -1) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         int res = countVowels("shubham");
//         System.out.println("Vowels : " + res);
//     }
// }
// Vowels : 2
// public class day19 {
//     static int countDigits(String str) {
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
//         int res = countDigits("shu3833wdje193nn391");
//         System.out.println("Digits : " + res);
//     }
// }
// Digits : 10
// public class day19 {
//     static int countSpaces(String str) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == ' ') {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]) {
//         {
//             int res = countSpaces("Hello bro how are you");
//             System.out.println("Spaces : " + res);
//         }
//     }
// }
// Spaces : 4
// public class day19 {
//     static String reverseString(String str) {
//         String reverse = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             char ch = str.charAt(i);
//             reverse = reverse + ch;
//         }
//         return reverse;
//     }
//     public static void main(String args[]) {
//         String res = reverseString("shubham24");
//         System.out.println("String reverse : " + res);
//     }
// }
// String reverse : 42mahbuhs
public class day19 {

    static String reverseString(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        return reverse;
    }

    static boolean palindromeString(String str) {

        String reverse = reverseString(str);
        return str.equals(reverse);
    }

    public static void main(String args[]) {
        boolean res = palindromeString("madam");
        System.out.println("Palindrome : " + res);
    }
}
// Palindrome : true
