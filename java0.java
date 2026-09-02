
// public class java0 {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;
//         System.out.println("SUM " + (a + b));
//     }
// }
import java.util.Scanner;

public class java0 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Numebr is even");

        } else {
            System.out.println("numer is odd");
        }

        sc.close();
    }
}
