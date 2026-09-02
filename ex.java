
import java.util.Scanner;

public class ex {

    public static int greater(int a, int b) {
        if (a > b) {

            return a;

        } else {
            return b;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number :");
        int a = sc.nextInt();
        System.out.println("Enter your second number :");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(" both are equal ");

        } else {
            int ans = greater(a, b);
            System.out.println("GREATER NUMBER IS :" + ans);

        }

    }

}
