public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        System.out.println("Original Array:");
        printArray(arr);

        sortArray(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}