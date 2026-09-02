
import java.util.Scanner;

public class project1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name :");
        String name = sc.nextLine();

        System.out.print("Enter java marks :");
        int mark1 = sc.nextInt();
        System.out.print("Enter DBMS marks :");
        int mark2 = sc.nextInt();
        System.out.print("Enter C++ marks :");
        int mark3 = sc.nextInt();

        System.out.println(" ");
        System.out.println("----------RESULT------------");

        System.out.println("Student :" + name);

        int total = mark1 + mark2 + mark3;
        System.out.println("Total :" + total);

        double percentage = (mark1 + mark2 + mark3) * (100) / (300);
        System.out.println("Percentage :" + percentage);

        if (percentage >= 85) {
            System.out.println("Status : pass");
            System.out.println("Grade : A");
            System.out.println(" ");
            System.out.println("Performance : Excellent");

        } else if (percentage >= 75) {
            System.out.println("Status : Pass");
            System.out.println("Grade : B");
            System.out.println(" ");
            System.out.println("Performance : Good");

        } else if (percentage >= 65) {
            System.out.println("Status : pass");
            System.out.println("Grade : C");
            System.out.println(" ");
            System.out.println("Performance : Average");

        } else {
            System.out.println("Fail!");
            System.out.println(" ");
            System.out.println("Performance : Noob Study kar!");
        }
        sc.close();

    }
}
