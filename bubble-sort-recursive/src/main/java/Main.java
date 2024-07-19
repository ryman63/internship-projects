import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        arr = BubbleSort.bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
