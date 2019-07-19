package sorting_algoritms;

public class Merge_Sort {

    public static void merge(int[] arr, int start, int middle, int end) {
        int sizeFirstArray = middle - start + 1;
        int sizeSecondArray = end - middle;
        int[] firstArray = new int[sizeFirstArray];
        int[] secondArray = new int[sizeSecondArray];

        for (int i = 0; i < sizeFirstArray; i++) {
            firstArray[i] = arr[start + i];
        }

        for (int i = 0; i < sizeSecondArray; i++) {
            secondArray[i] = arr[middle + i + 1];
        }

        int currentPos = start;
        int firstPos = 0;
        int secondPos = 0;
        while ((firstPos < firstArray.length) && (secondPos < secondArray.length)) {
            if (firstArray[firstPos] <= secondArray[secondPos]) {
                arr[currentPos] = firstArray[firstPos];
                ++firstPos;
            } else {
                arr[currentPos] = secondArray[secondPos];
                ++secondPos;
            }
            ++currentPos;
        }
        while (firstPos < firstArray.length) {
            arr[currentPos] = firstArray[firstPos];
            ++firstPos;
            ++currentPos;

        }
        while (secondPos < secondArray.length) {
            arr[currentPos] = secondArray[secondPos];
            ++secondPos;
            ++currentPos;
        }
    }

    public static void merge_sort(int[] arr, int l, int r) {
        if (l < r) {
            int middle = l + (r - l) / 2;
            merge_sort(arr, l, middle);
            merge_sort(arr, middle + 1, r);
            merge(arr, l, middle, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 2, 6, 7, -1};
        merge_sort(arr, 0, arr.length - 1);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
