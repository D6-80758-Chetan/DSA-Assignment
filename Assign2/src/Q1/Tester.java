package Q1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws Exception {
        int[] arr = { 237, 95, 68, 67, 46, 45, 30, 24, 23, 3, 0 };

        System.out.println(Arrays.toString(arr));
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        int j;

        int noofPasses = 0, noofCom = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            noofPasses++;
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                noofCom++;
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }

        System.out.printf("%s %s", noofCom, noofPasses);
    }
}
