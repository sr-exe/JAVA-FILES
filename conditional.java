// // // import java.util.*;
// // // public class conditional
// // // {
// // //     public static void main (String args[])
// // //     {
// // //         Scanner sc = new Scanner(System.in);
// // //         int age = sc.nextInt();

// // //         if(age > 18){
// // //             System.out.println("Adult");
// // //         }else
// // //           System.out.println("Not Adult");
// // //     }
// // // }
// // import java.util.*;
// // class conditional {
// //     public static void main (String args[])
// //     {
// //         Scanner sc = new Scanner(System.in);
// //         int number = sc.nextInt();
// //         if(number % 2 == 0)
// //         {
// //             System.out.println("The number is even ");
// //         }else
// //            System.out.println("The number is odd");
// //     }
// // }
// import java.util.Scanner;
// class conditional {
//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     if (a == b) {
//       System.out.println("both equal");
//     } else {
//       if (a > b) {
//         System.out.println("a is greter ");
//       } else System.out.println("a is smaller");
//     }
//   }
// }
import java.util.*;

class conditional {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid button");
        }
    }
}
