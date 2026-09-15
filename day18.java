
import java.util.*;

public class day18 {

    // ================= ARRAY METHODS =================
    static boolean contains(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    static int countOccurrence(int arr[], int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    static int index(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int sumOfArray(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    // ================= ARRAY ANALYZER =================
    static void arrayAnalyzer(Scanner sc, int arr[]) {

        int choice;

        do {

            System.out.println();
            System.out.println("========== ARRAY ANALYZER ==========");
            System.out.println("1. Count Occurrence");
            System.out.println("2. Contains");
            System.out.println("3. Find Index");
            System.out.println("4. Sum Array");
            System.out.println("5. Back to Main Menu");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:

                    System.out.print("Enter target: ");
                    int target = sc.nextInt();

                    int result = countOccurrence(arr, target);

                    System.out.println("Occurrence: " + result);

                    break;

                case 2:

                    System.out.print("Enter target: ");
                    int target2 = sc.nextInt();

                    boolean result2 = contains(arr, target2);

                    System.out.println("Contains: " + result2);

                    break;

                case 3:

                    System.out.print("Enter target: ");
                    int target3 = sc.nextInt();

                    int result3 = index(arr, target3);

                    System.out.println("Index: " + result3);

                    break;

                case 4:

                    int result4 = sumOfArray(arr);

                    System.out.println("Sum of array: " + result4);

                    break;

                case 5:

                    System.out.println("Returning to Main Menu...");

                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 5);
    }

    // ==========Digit analyzer =============
    static int sumDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }

    static int reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int rev = reverse(num);

        return original == rev;
    }

    static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int largestDigit(int num) {
        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }

            num = num / 10;
        }

        return largest;
    }

    static int smallestDigit(int num) {
        int smallest = 9;

        while (num > 0) {
            int digit = num % 10;

            if (digit < smallest) {
                smallest = digit;
            }

            num = num / 10;
        }

        return smallest;
    }

    static int countEvenDigits(int num) {
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }

    static int sumEvenDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sum = sum + digit;
            }

            num = num / 10;
        }

        return sum;
    }

    static void digitAnalyzer(Scanner sc) {

        int choice;

        do {
            System.out.println();
            System.out.println("========== DIGIT ANALYZER ==========");
            System.out.println("1. Sum Digits");
            System.out.println("2. Reverse Number");
            System.out.println("3. Palindrome");
            System.out.println("4. Factorial");
            System.out.println("5. Largest Digit");
            System.out.println("6. Smallest Digit");
            System.out.println("7. Count Even Digits");
            System.out.println("8. Sum Even Digits");
            System.out.println("9. Back to Main Menu");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 8) {

                System.out.print("Enter number: ");
                int num = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Sum: " + sumDigits(num));
                        break;

                    case 2:
                        System.out.println("Reverse: " + reverse(num));
                        break;

                    case 3:
                        System.out.println("Palindrome: " + isPalindrome(num));
                        break;

                    case 4:
                        System.out.println("Factorial: " + factorial(num));
                        break;

                    case 5:
                        System.out.println("Largest digit: " + largestDigit(num));
                        break;

                    case 6:
                        System.out.println("Smallest digit: " + smallestDigit(num));
                        break;

                    case 7:
                        System.out.println("Even digit count: " + countEvenDigits(num));
                        break;

                    case 8:
                        System.out.println("Even digit sum: " + sumEvenDigits(num));
                        break;
                }

            } else if (choice == 9) {

                System.out.println("Returning to Main Menu...");

            } else {

                System.out.println("Invalid choice!");
            }

        } while (choice != 9);
    }

    // ================= MAIN =================
    public static void main(String args[]) {

        int num[] = {
            10, 20, 20, 10, 35,
            20, 43, 64, 23
        };

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println();
            System.out.println("========== JAVA ANALYZER ==========");
            System.out.println("1. Array Analyzer");
            System.out.println("2. Digit Analyzer");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:

                    arrayAnalyzer(sc, num);

                    break;

                case 2:

                    digitAnalyzer(sc);

                    break;

                case 3:

                    System.out.println("Exiting Java Analyzer...");

                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 3);

        sc.close();
    }

}
