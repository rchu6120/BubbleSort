public class Runner {
    public static void main(String[] args) {
        int[] randIntArr = new int[10000];
        for (int i = 0; i < randIntArr.length; i++) {
            randIntArr[i] = (int) (Math.random() * 10001);
        }
        SortingUtil.bubble(int[] randIntArr);
        long time = System.nanoTime();
        utils.bubbleSort(randIntArr);
        time = System.nanoTime() - time;

        System.out.println("Time taken: " + time);
    }
}
