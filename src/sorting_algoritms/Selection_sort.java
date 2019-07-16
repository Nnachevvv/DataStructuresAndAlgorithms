package sorting_algoritms;

public class Selection_sort {

    private static void swap(int [] arr, int min , int i)
    {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

    public static void selection_sort(int [] arr)
    {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int min = i;
            for (int j = i+ 1; j < arr.length ; j++) {
                if(arr[min] > arr[j])
                {
                    min=j;
                }
            }
            swap(arr,min,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 2, 6, 7, -1};
        selection_sort(arr);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
