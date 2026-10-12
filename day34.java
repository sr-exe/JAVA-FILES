
// public class day34 {
//     static void count(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         count(n - 1);
//     }
//     public static void main(String args[]) {
//         count(5);
//     }
// }
// public class day34 {
//     static void fun(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         fun(n - 1);
//         System.out.println("back " + n);
//     }
//     static void main(String args[]) {
//         fun(5);
//     }
// }
// public class day34 {
//     static void print(int n) {
//         if (n == 0) {
//             return;
//         }
//         print(n - 1);
//         System.out.println(n);
//     }
//     static void main(String args[]) {
//         print(5);
//     }
// }
public class day34 {

    static void recursion(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        recursion(n - 1);

    }

    public static void main(String args[]) {
        recursion(50);
    }
}
