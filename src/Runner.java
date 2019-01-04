public class Runner {
    public static void main(String[] args) {
        int[] testArr = SortingUtil.randIntArr(1000);
        System.out.print("Before: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        long time = System.nanoTime();
        SortingUtil.bubbleSort(testArr);
        System.out.print("After: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        time = System.nanoTime() - time;
        System.out.println("It took " + SortingUtil.bubbleSort.swaps + " swaps to sort this list.");
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}
