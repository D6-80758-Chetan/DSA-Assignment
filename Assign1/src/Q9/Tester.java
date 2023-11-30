package Q9;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {

        int[] arr = { 4, 1, 2, 6, 3, 8, 2, 9, 0, 19, 35, 31, 87, 12, 56 };
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(selectionSort(arr, arr.length));
        System.out.println(Arrays.toString(arr));
    }

    private static int selectionSort(int[] arr, int size) {

        int count = 0;
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                count++;
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return count;
    }
}
