public class Runner {
    public static void main(String[] args) {
        int[] testArr = SortingUtil.randIntArr(10);
        System.out.print("Before: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        long time = System.nanoTime();
        SortingUtil.bubbleSort(testArr);
        time = System.nanoTime() - time;
        System.out.print("After: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}
