package sorting_algoritms;

public class Insertion_sort {
    public static void insertion_sort(int [] arr)
    {
        for (int i = 1; i <arr.length ; i++) {
            int curr = arr[i] ;
            int temp = i - 1;
            while(temp >= 0 && curr < arr[temp])
            {
                arr[temp+1] = arr[temp];
                --temp;
            }
            arr[temp+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 2, 6, 7, -1};
        insertion_sort(arr);
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
