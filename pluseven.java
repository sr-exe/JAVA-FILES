
import java.util.Scanner;

public class pluseven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (num % 2 == 0) {
                sum = sum + i;

            }

        }
        System.out.println("sum : " + sum);
        sc.close();
    }
}
