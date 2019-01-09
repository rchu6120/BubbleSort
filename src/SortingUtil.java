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
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 10001);
        }
        return randomArr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int sum1 = 0;
        int sum2 = 0;
        if (before.length != after.length) {
            return false;
        } else {
            for (int i = 0; i < before.length; i++) {
                sum1 += before[i];
                sum2 += after[i];
            }
            if (sum1 != sum2) {
                return false;
            }
            return true;
        }
    }

    public static void selectionSort(int[] arr) {
        int minPos = 0;
        for (int curPos = 0; curPos < arr.length-1; curPos++) {
            int minVal = arr[curPos];
            minPos = curPos;
            for (int i = curPos + 1; i < arr.length-1; i++) {
                if (arr[i] < minVal) {
                    minVal = arr[i];
                }
            }
            swap(arr, curPos, minPos);
        }
    }

}
