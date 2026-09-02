
// // public class Array {
// //     public static void main(String args[]) {
// //         // int marks[] = new int[3];//  OR
// //         int marks[] = {88, 78, 90};
// //         // marks[0] = 90;
// //         // marks[1] = 88;
// //         // marks[2] = 95;
// //         for (int i = 0; i < 3; i++) {
// //             System.out.println(marks[i]);
// //         }
// //     }
// // }
// import java.util.Scanner;
// public class Array {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of array  elements :");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         // input ke liye
//         for (int i = 0; i < size; i++) {
//             System.out.println("Enter array element :");
//             numbers[i] = sc.nextInt();
//         }
//         // output ke liye
//         for (int i = 0; i < size; i++) {
//             System.out.println("ELEMENT : " + numbers[i]);
//         }
//     }
// }
import java.util.Scanner;

public class Array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements :");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element :");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter which element you want to find ");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("ELEMENT FOUND AT INDEX :" + i);
            } else {
                System.out.println("Element not found ");
            }

        }

    }
}
