
import java.util.Scanner;

public class count {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num = sc.nextInt();
        int count = 0;

        if (num == 0) {
            count++;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;

            }
        }

        System.out.println("number of digits : " + count);
        sc.close();
    }
}
