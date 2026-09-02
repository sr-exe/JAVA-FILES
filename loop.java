
// //_________FFFOOORRR LLLLOOOOOPPPP_________
// // // public class loop {
// // //   public static void main(String args[]) {
// // //     for (int i = 0; i <= 100; i++) {
// // //       System.out.println("HELLO WORLD");
// // //     }
// // //   }
// // // }
// // public class loop{
// //     public static void main(String args[]){
// //         for(int i = 0; i < 21; i++){
// //             System.out.print(i+" ");
// //         }
// //     }
// // }
// //?? __________WWHHIILLEE LLLLOOOOOPPPPP___________
// public class loop{
//     public static void main(String args[]){
//         int i = 0;
//         while(i < 21) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }
//  ______________DDDOOOO  WHILE_____________________
// public class loop{
//     public static void main(String args[]){
//     int i = 0;
//     do{
//         System.out.println(i);
//         i++;
//     }while( i < 21);
//     }
// }
// public class loop{
//     public static void main(String args[]){
//        int i = 12;
//        while(i < 11){
//         System.out.println("HELLO");
//        }
//        do {
//         System.out.println("HELLO SHUBHAM");
//        }while(i < 11);
//     }
// }
//________EXAMPLE______________
// import java.util.*;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 0; i <= n; i++){
//             sum = sum+i;
//         }
//         System.out.println("SUM :" + sum);
//     }
// }
//____________TABLE USING LOOP_____________
import java.util.*;

public class loop {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
    }
}
