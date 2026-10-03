
// import java.util.Scanner;
// public class day22 {
//     static int count = 0;
//     static void addStudent(Scanner sc, String name[], int marks[]) {
//         if (count < 5) {
//             System.out.print("Enter student name: ");
//             String name1 = sc.nextLine();
//             System.out.print("Enter student marks: ");
//             int marks1 = sc.nextInt();
//             sc.nextLine();
//             name[count] = name1;
//             marks[count] = marks1;
//             count++;
//         } else {
//             System.out.println("No space remaining");
//         }
//     }
//     static void viewStudents(String name[], int marks[]) {
//         if (count == 0) {
//             System.out.println("No students available");
//         } else {
//             for (int i = 0; i < count; i++) {
//                 System.out.println("Student " + (i + 1) + ": " + name[i] + " - " + marks[i]);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int choice;
//         Scanner sc = new Scanner(System.in);
//         String name[] = new String[5];
//         int marks[] = new int[5];
//         do {
//             System.out.println("=========Student Analyzer=========");
//             System.out.println();
//             System.out.println("1. Add student");
//             System.out.println("2. View Students");
//             System.out.println("3. Search students");
//             System.out.println("4. Student Statistics");
//             System.out.println("5. Exit");
//             System.out.println();
//             System.out.print("Enter your choice : ");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                     addStudent(sc, name, marks);
//                     break;
//                 case 2:
//                     viewStudents(name, marks);
//                     break;
//             }
//         } while (choice != 5);
//     }
// }
// public class day23 {
//     public static int lowest(int arr[]) {
//         int lowest = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < lowest) {
//                 lowest = arr[i];
//             }
//         }
//         return lowest;
//     }
//     public static void main(String args[]) {
//         int marks[] = {31, 42, 38, 12, 48};
//         int res = lowest(marks);
//         System.out.println("Lowest : " + res);
//     }
// }
// --------------DAY continued-------------------------
// public class day22 {
//     static int largest(int arr[]) {
//         int largest = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int num[] = {10, 34, 256, 94, 29, 432, 26};
//         int res = largest(num);
//         System.out.println("Largest : " + res);
//     }
// }
// Largest : 432
//--------------IF FIRST  OCCURENCE-----------------
// public class day22 {
//     static int findIndex(int arr[], int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     static void findAllIndex(int arr[], int target) {
//         boolean found = false;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 System.out.println(i);
//                 found = true;
//             }
//         }
//         if (found == false) {
//             System.out.println("Element not found");
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {19, 492, 22, 42, 22, 52, 22, 53};
//         findAllIndex(num, 22);
//         int res = findIndex(num, 22);
//         System.out.println("Index of target : " + res);
//     }
// }
public class day22 {

    static int countOccurence(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int num[] = {10, 32, 19, 31, 39, 31, 31, 92, 31};
        int res = countOccurence(num, 31);
        System.out.println("Occurence : " + res);
    }
}
