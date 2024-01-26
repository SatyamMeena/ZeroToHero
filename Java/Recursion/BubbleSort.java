package Java.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2 , 1};
        bubble(arr, arr.length -1 , 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[] , int i , int j ){
        if (i == 0 ){
            return ;
        }

        if (i > j){
            if (arr[j] > arr[j+1]){ 
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                bubble(arr, i, j+1);
            }
        }
        else {
            bubble(arr, i-1, 0);
        }
    
    }
}
