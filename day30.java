
public class day30 {

    static void selection(int arr[]) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int num[] = {10, 32, 12, 53, 13};
        selection(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
// public class day30 {

//     static void selection(int arr[]) {
//         int temp;
//         for (int i = 0; i < arr.length; i++) {
//             int bestIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[bestIndex]) {
//                     bestIndex = j;
//                 }
//             }
//             temp = arr[bestIndex];
//             arr[bestIndex] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {39, 12, 42, 19, 43};
//         selection(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
// }
