
public class day28 {

    static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target > arr[middle]) {
                left = middle + 1;

            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = {10, 20, 30, 40, 50, 60};
        int res = binarySearch(num, 50);
        System.out.println("Found At : " + res);
    }
}
