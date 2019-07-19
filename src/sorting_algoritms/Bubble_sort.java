package sorting_algoritms;

public class Bubble_sort {
    private static void swap(int[] arr, int min, int i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        bubble_sort(arr);

        for (int x : arr) {    // Printing sorted array
            System.out.print(x + " ");
        }
    }
}
