public class SortingUtil {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble(int[] arr) {
        int swaps = -1;
        while (swaps != -1) {
            swaps = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i , i+1);
                    swaps++;
                }
            }
        }
        System.out.println("It took you " + swaps + "times.");
    }

    public static int[] randIntArr(int count) {
        int[] randomArr = new int[count];
        for (int i = 0; i < randomArr.length; i++)  {
            randomArr[i] = (int) (Math.random() * 101);
        }
        return randomArr;
    }
}
