public class SortingUtil {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int swaps = -1;
        while (swaps != 0) {
            swaps = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swaps++;
                }
            }
        }
    }

    public static int[] randIntArr(int count) {
        int[] randomArr = new int[count];
        for (int i = 0; i < randomArr.length; i++)  {
            randomArr[i] = (int) (Math.random() * 10001);
        }
        return randomArr;
    }

}
