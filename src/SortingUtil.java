public class SortingUtil {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble(int[] arr) {
        int count = -1;
        while (count != -1) {
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i , i+1);
                    count++;
                }
            }
        }
    }

}
