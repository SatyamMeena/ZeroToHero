package Java.BinarySearch;

public class IndexInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 6, 66, 77, 888, 9765, 56645 };
        int target = 77;
        int start[] = ans(arr, target);
      int index =   binarySearch(arr, target, start[0], start[1]);
      System.out.println(index);
    }

    static int[] ans(int[] arr, int target) {
        int start = 0 ; 
        int end = 1 ;
        while (arr[end] < target) {
            int temp = end + 1 ;
            end = end + (end - start + 1 );
            start = temp;
        }
        return new int[] {start , end };
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

}
