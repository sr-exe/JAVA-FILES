// -------------Saturday--------------REVISION-----------------

// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your name  : ");
//         String s = sc.nextLine();
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();
//         System.out.println(" Name : " + s);
//         System.out.println("Age : " + age);
//     }
// }
// import java.util.Scanner;
// class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("The number " + num + " is even");
//         } else {
//             System.out.println("The number " + num + " is odd ");
//         }
//     }
// }
// Enter the number : 4
// The number 4 is even
// public class day9 {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number a : ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter number b : ");
//         int num2 = sc.nextInt();
//         System.out.println("Sum : " + (num1 + num2));
//         System.out.println("Difference : " + (num1 - num2));
//         System.out.println("Product : " + (num1 * num2));
//         System.out.println("Division : " + (num1 / num2));
//         System.out.println("Remainder : " + (num1 % num2));
//     }
// }
// Enter number a : 20
// Enter number b : 6 
// Sum : 26
// Difference : 14
// Product : 120
// Division : 3
// Remainder : 2
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();
//         if (num > 0) {
//             System.out.println("Number is positive !");
//         } else if (num < 0) {
//             System.out.println("Number is negative !");
//         } else {
//             System.out.println("Number is 0 !");
//         }
//     }
// }
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number : ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number : ");
//         int num2 = sc.nextInt();
//         int largest = 0;
//         if (num1 > num2) {
//             largest = num1;
//             System.out.println("Largest : " + largest);
//         } else if (num2 > num1) {
//             largest = num2;
//             System.out.println("Largest : " + largest);
//         } else {
//             System.out.println("Both are equal !");
//         }
//     }
// }
// Enter first number : 25
// Enter second number : 18
// Largest : 25
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             if (i % 2 == 0) {
//                 sum = sum + i;
//             }
//         }
//         System.out.println("Sum of even till " + num + " is :" + sum);
//         sc.close();
//     }
// }
// Enter the number : 10
// Sum of even till 10 is :30
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number :");
//         int num = sc.nextInt();
//         for (int i = num; i >= 1; i--) {
//             System.out.println(i);
//         }
//     }
// }
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number :");
//         int num = sc.nextInt();
//         for (int i = 0; i <= num; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
// Enter a number :10
// 0
// 2
// 4
// 6
// 8
// 10
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();
//         int mul = 0;
//         for (int i = 1; i <= 10; i++) {
//             mul = num * i;
//             System.out.println(num + " x " + i + " = " + mul);
//         }
// sc.close();
//     }
// }
// Enter a number : 5
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             sum = sum + i;
//         }
//         System.out.println("Sum : " + sum);
//         sc.close();
//     }
// }
// Enter the number : 5
// Sum : 15
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter thhe number : ");
//         int num = sc.nextInt();
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial : " + fact);
//         sc.close();
//     }
// }
// 
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int digit = 0;
//         int reverse = 0;
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
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         int digit = 0;
//         while (num > 0) {
//             digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         System.out.println("Sum of digits : " + sum);
//     }
// }
// Enter digits : 1234
// Sum of digits : 10
// import java.util.Scanner;
// public class day9 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits : ");
//         int num = sc.nextInt();
//         int digit = 0;
//         int even = 0;
//         int odd = 0;
//         while (num > 0) {
//             digit = num % 10;
//             if (digit % 2 == 0) {
//                 even++;
//             }
//             if (digit % 2 == 1) {
//                 odd++;
//             }
//             num = num / 10;
//         }
//         System.out.println("Even :" + even);
//         System.out.println("Odd :" + odd);
//     }
// }
// Enter digits : 78718741
// Even :3
// Odd :5
// public class day9 {
//     static int square(int n) {
//         return n * n;
//     }
//     public static void main(String args[]) {
//         int result = square(5);
//         System.out.println("Square : " + result);
//     }
// }
// Square : 25
// public class day9 {
//     static int add(int a, int b) {
//         return a + b;
//     }
//     public static void main(String args[]) {
//         int result = add(15, 39);
//         System.out.println("Sum : " + result);
//     }
// }
// Sum : 54
// public class day9 {
//     static boolean isEven(int num) {
//         if (num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String args[]) {
//         boolean result = isEven(31);
//         System.out.println("Even : " + result);
//     }
// }
// Even : false
// class day9 {
//     static int digits(int n) {
//         int sum = 0;
//         int digit = 0;
//         while (n > 0) {
//             digit = n % 10;
//             sum = sum + digit;
//             n = n / 10;
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int result = digits(58392);
//         System.out.println("Sum : " + result);
//     }
// }
// Sum : 27
// public class day9 {
//     public static void main(String args[]) {
//         int arr[] = {10, 20, 30, 40, 50};
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         System.out.println("Sum : " + sum);
//     }
// }
// Sum : 150
// public class day9 {
//     static int findSum(int arr[]) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {10, 20, 30, 40, 50};
//         int result = findSum(numbers);
//         System.out.println("Sum : " + result);
//     }
// }
// Sum : 150
public class day9 {

    static int findMax(int arr[]) {
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int max[] = {10, 24, 18, 92, 33};
        int result = findMax(max);
        System.out.println("Largest  : " + result);
    }
}
