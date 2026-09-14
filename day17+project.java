//SATURDAY REVISION-------------------?>>

// import java.util.Scanner;
// public class day16 {
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
//         System.out.println("Sum of digits : " + sum);
//         sc.close();
//     }
// }
// Enter the digits : 122345
// Sum of digits : 17
// import java.util.Scanner;
// public class day16 {
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
//         System.out.println("Reverse : " + reverse);
//     }
// }
// Enter digits : 12345
// Reverse : 54321
// import java.util.Scanner;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial : " + fact);
//     }
// }
// Enter a number : 6
// Factorial : 720
// import java.util.*;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int num = sc.nextInt();
//         int orig = num;
//         int reverse = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             num = num / 10;
//             reverse = reverse * 10 + digit;
//         }
//         if (orig == reverse) {
//             System.out.println("The number is Palindrome number ");
//         } else {
//             System.out.println("The number  is not Palindrome number ");
//         }
//     }
// }
// Enter the digits : 111
// The number is Palindrome number 
// import java.util.*;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int count = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             count++;
//             num = num / 10;
//         }
//         System.out.println("Digits : " + count);
//     }
// }
// Enter digits : 123456
// Digits : 6
// import java.util.Scanner;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int num = sc.nextInt();
//         int digit = 0;
//         int largest = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit > largest) {
//                 largest = digit;
//             }
//             num = num / 10;
//         }
//         System.out.println("Largest : " + largest);
//     }
// }
// Enter the digits : 12322728
// Largest : 8
// import java.util.*;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int num = sc.nextInt();
//         int smallest = 9;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit < smallest) {
//                 smallest = digit;
//             }
//             num = num / 10;
//         }
//         System.out.println("Smallest : " + smallest);
//     }
// }
// Enter the digits : 324234
// Smallest : 2
// import java.util.Scanner;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int digit = 0;
//         int evencounter = 0;
//         int oddcounter = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit % 2 == 0) {
//                 evencounter++;
//             } else {
//                 oddcounter++;
//             }
//             num = num / 10;
//         }
//         System.out.println("Evens : " + evencounter);
//         System.out.println("Odds : " + oddcounter);
//     }
// }
// Enter digits : 362789
// Evens : 3
// Odds : 3
// import java.util.Scanner;
// public class day16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit % 2 == 0) {
//                 sum = sum + digit;
//             }
//             num = num / 10;
//         }
//         System.out.println("Sum of Evens : " + sum);
//     }
// }
// Enter digits : 321432
// Sum of Evens : 8
import java.util.*;

public class day16 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choices;
        double average = 0.0;

        do {
            System.out.println();
            System.out.println("============ANALYZER==================");
            System.out.println("1.Number Analyzer ");
            System.out.println("2.Student marks Analyzer ");
            System.out.println("3.Exit");
            System.out.print("Enter your choice : ");
            choices = sc.nextInt();

            switch (choices) {
                case 1:
                    System.out.println("Number Analyzer Selected ----> ");
                    System.out.println();
                    System.out.print("Enter the number : ");
                    int num1 = sc.nextInt();
                    int digit = 0;
                    int sum = 0;
                    int temp = num1;
                    int reverse = 0;
                    int original = num1;
                    long fact = 1;
                    int largest = 0;
                    int smallest = 9;
                    int temp2 = original;
                    int evencount = 0;
                    int oddcount = 0;
                    int temp3 = original;
                    int evensum = 0;

                    while (num1 > 0) {
                        digit = num1 % 10;
                        sum = sum + digit;
                        num1 = num1 / 10;

                    }
                    while (temp > 0) {
                        digit = temp % 10;
                        reverse = reverse * 10 + digit;

                        temp = temp / 10;
                    }
                    if (original == reverse) {
                        System.out.println("It's a palindrome");
                    } else {
                        System.out.println("Its not palindrome ");
                    }
                    for (int i = 1; i <= original; i++) {
                        fact = fact * i;
                    }

                    while (temp2 > 0) {
                        digit = temp2 % 10;
                        if (digit > largest) {
                            largest = digit;
                        }
                        if (digit < smallest) {
                            smallest = digit;
                        }
                        temp2 = temp2 / 10;
                    }
                    while (temp3 > 0) {

                        digit = temp3 % 10;

                        if (digit % 2 == 0) {
                            evensum = evensum + digit;
                            evencount++;
                        } else {
                            oddcount++;
                        }
                        temp3 = temp3 / 10;
                    }
                    System.out.println("The sum of digits : " + sum);
                    System.out.println("Reverse : " + reverse);
                    System.out.println("Factorial : " + fact);
                    System.out.println("Largest : " + largest);
                    System.out.println("Smallest : " + smallest);
                    System.out.println("Evens : " + evencount);
                    System.out.println("Odds : " + oddcount);
                    System.out.println("Even sum : " + evensum);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Student marks analyzer selected ---> ");
                    System.out.println();

                    int marks[] = new int[5];
                    int total = 0;

                    for (int i = 0; i < marks.length; i++) {
                        System.out.print("Enter marks : ");
                        marks[i] = sc.nextInt();
                        total = total + marks[i];
                    }
                    int largest1 = marks[0];
                    int smallest1 = marks[0];
                    for (int i = 0; i < marks.length; i++) {
                        if (marks[i] > largest1) {
                            largest1 = marks[i];
                        }

                        if (marks[i] < smallest1) {

                            smallest1 = marks[i];
                        }

                    }
                    average = (double) total / marks.length;
                    int evencount1 = 0;
                    for (int i = 0; i < marks.length; i++) {
                        if (marks[i] % 2 == 0) {
                            evencount1++;
                        }

                    }
                    boolean found = false;

                    System.out.print("Enter the target : ");
                    int target = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < marks.length; i++) {
                        if (marks[i] == target) {
                            found = true;
                            index = i;
                            break;

                        }

                    }
                    int count2 = 0;
                    System.out.print("Enter target to count : ");
                    int target1 = sc.nextInt();
                    for (int i = 0; i < marks.length; i++) {
                        if (marks[i] == target1) {
                            count2++;
                        }
                    }
                    int largest2 = 0;
                    int second = 0;
                    if (marks[0] > marks[1]) {
                        largest2 = marks[0];
                        second = marks[1];
                    } else {
                        largest2 = marks[1];
                        second = marks[0];
                    }

                    for (int i = 2; i < marks.length; i++) {
                        if (marks[i] > largest2) {
                            second = largest2;
                            largest2 = marks[i];
                        } else if (marks[i] > second) {
                            second = marks[i];
                        }
                    }
                    int j = marks.length - 1;
                    int temp5;
                    for (int i = 0; i < j; i++) {

                        temp5 = marks[i];
                        marks[i] = marks[j];
                        marks[j] = temp5;

                        j--;

                    }
                    System.out.print("Reverse :");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.print(marks[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Total marks : " + total);
                    System.out.println("Average marks : " + average);
                    System.out.println("Largest : " + largest1);
                    System.out.println("Smallest : " + smallest1);
                    System.out.println("Even marks : " + evencount1);
                    System.out.println("Search marks found : " + found);
                    System.out.println("Index : " + index);
                    System.out.println("Number of occurrences : " + count2);
                    System.out.println("Second largest : " + second);

                    System.out.println();

                    break;

                case 3:
                    System.out.println("Exiting... ");
                    break;

                default:
                    System.out.println("Invalid input ");

            }
        } while (choices != 3);

    }
}
