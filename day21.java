
import java.util.Scanner;

public class day21 {

    static int countChar(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    static int countVowels(String str) {
        int count = 0;
        String str1 = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str1.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    static int countDigits(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        return count;
    }

    static int countSpaces(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
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

    static void stringAnalyzer(Scanner sc) {
        int choices;
        sc.nextLine();
        System.out.print("Enter a String : ");
        String str2 = sc.nextLine();
        do {
            System.out.println("1. Count Character");
            System.out.println("2. Count Vowels");
            System.out.println("3. Count digits");
            System.out.println("4. Count Spaces");
            System.out.println("5. Count Frequency");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your choices : ");

            choices = sc.nextInt();
            if (choices >= 1 && choices <= 5) {

                switch (choices) {
                    case 1:
                        System.out.print("Enter target character : ");
                        char target = sc.next().charAt(0);
                        int res = countChar(str2, target);
                        System.out.println("Characters : " + res);
                        break;

                    case 2:
                        int res2 = countVowels(str2);
                        System.out.println("Vowels : " + res2);
                        break;

                    case 3:
                        int res3 = countDigits(str2);
                        System.out.println("Digits : " + res3);
                        break;

                    case 4:
                        int res4 = countSpaces(str2);
                        System.out.println("Spaces : " + res4);
                        break;

                    case 5:
                        charFrequency(str2);
                        break;

                }
            } else if (choices == 6) {
                System.out.println("Returning to main menu...");
                System.out.println();
            } else {
                System.out.println("Invalid input");
            }
        } while (choices != 6);
    }

    public static void main(String args[]) {
        System.out.println("==========String Analyzer=============");
        Scanner sc = new Scanner(System.in);
        int choices1;
        do {
            System.out.println("1. String Analyzer");
            System.out.println("2. Exit");
            System.out.println();
            System.out.print("Enter a choice : ");
            choices1 = sc.nextInt();

            switch (choices1) {
                case 1:
                    stringAnalyzer(sc);
                    break;

                case 2:
                    System.out.println("Exiting...");
                    break;

            }

        } while (choices1 != 2);

    }
}
