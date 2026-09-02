
// import java.util.Scanner;
// public class plus {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             sum = sum + i;
//         }
//         System.out.println("Sum : " + sum);
//     }
// }
import java.util.*;

public class plus {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("factorial = " + fact);
    }
}
