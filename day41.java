
public class day41 {

    static int largest1(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int largestR = largest1(arr, i + 1);

        if (arr[i] > largestR) {
            return arr[i];
        }
        return largestR;

    }

    static int secondLargest(int arr[], int i, int largest) {
        if (i == arr.length) {
            return Integer.MIN_VALUE;
        }

        int candidate = secondLargest(arr, i + 1, largest);

        if (arr[i] < largest && arr[i] > candidate) {
            return arr[i];
        }

        return candidate;
    }

    public static void main(String args[]) {
        int num[] = {13, 13, 13, 13, 13};

        int max = largest1(num, 0);
        int res = secondLargest(num, 0, max);

        if (res == Integer.MIN_VALUE) {
            System.out.println("No distinct second largetst element");
        } else {
            System.out.println(res);
        }
    }
}
