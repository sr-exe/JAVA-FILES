
// public class day44 {
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
//         String str1 = "listen";
//         String str2 = "silent";
//         boolean res = isAnagram(str1, str2);
//         System.out.println(res);
//     }
// }
public class day44 {

    static int findnon(String a) {

        int freq[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            freq[index]++;

        }

        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            if (freq[index] == 1) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        String a = "aaaabbbbbddddd";
        int res = findnon(a);

        if (res != -1) {
            System.out.println(a.charAt(res));
        } else {
            System.out.println("No unique character found");
        }

    }
}
