package algorithms;

import java.awt.*;

public class Binary_Search {

    public static  int binary_search_irretive(int[] arr, int value)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
          int middle = left + (right-left)/2;
          if(value == arr[middle])
          {
              return middle;
          }else if( value < arr[middle] )
          {
              right  = middle-1;
          }
          else {
              left = middle+1;
          }

        }
        return -1;
    }
    public static int binary_search_recursive(int [] arr,int left, int right,int value)
    {
        if(left>right)
        {
            return -1;
        }
        int middle = left + (right-left)/2;
        if(value == arr[middle])
        {
            return middle;
        }else if( value < arr[middle] )
        {
            right  = middle-1;
        }
        else {
            left = middle+1;
        }
        return binary_search_recursive(arr,left,right,value);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 35, 112, 258, 324};
        int valueSearch = 3244;
        System.out.println(binary_search_recursive(arr,0,arr.length-1,valueSearch));
    }

}
