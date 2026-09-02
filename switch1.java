// import java.util.*;

// public class switch1{
//     public static void main (String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();



//         switch(button) {
//             case 1 : System.out.println("Hello");
//             break;
//             case 2 : System.out.println("Namaste");
//             break;
//             case 3 : System.out.println("Bonjour");
//             break;
//             default : System.out.println("Invalid button");
//         }
//     }
// }


import java.util.*;
public class switch1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second Number :");
        int b = sc.nextInt();
        System.out.println("ENTER operators (+, -, *, /)");
        char res = sc.next().charAt(0);

        switch(res){
            case '+' : System.out.println("SUM :" + (a+b));
            break;
            case '-' : System.out.println("SUB :"+ (a-b));
            break;
            case '/' : System.out.println("DIV :" +(a/b));
            break;
            case '*' : System.out.println("MUL :" + (a*b));
            default : System.out.println("Invalid operaation");
        }
    }
}