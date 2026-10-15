//! Anagram 

public class day43 {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        int freq[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            freq[index]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int index = b.charAt(i) - 'a';
            freq[index]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String first = "cat";
        String second = "act";
        boolean res = isAnagram(first, second);
        System.out.print(res);
    }
}
