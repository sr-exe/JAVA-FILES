
public class day45 {

    static int findchar(String a) {

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
        String a = "aaadfdfffg";
        int res = findchar(a);
        if (res == -1) {
            System.out.println("Not found");

        } else {
            System.out.println(res);
        }
    }
}
