
public class day26 {

    static int frequency(String str, char target) {
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
            char ch = str.charAt(i);
            int count = frequency(str, ch);
            boolean alreadySeen = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadySeen = true;
                }
            }
            if (alreadySeen) {
                continue;
            } else {
                int re = frequency(str, ch);
                System.out.println(ch + " > " + count);
            }

        }
    }

    public static void main(String args[]) {
        String str = "banana";
        charFrequency(str);

    }
}
