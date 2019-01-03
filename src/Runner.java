public class Runner {
    public static void main(String[] args) {
        int[] list = SortingUtil.randIntArr(100);
        long time = System.nanoTime();
        SortingUtil.bubble(list);
        for (int cur : list) {
            System.out.println(cur);
        }
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}
