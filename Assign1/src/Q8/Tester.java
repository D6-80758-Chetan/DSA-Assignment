package Q8;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
        System.out.println("Enter the Element: ");

        System.out.println(findRank(arr, new Scanner(System.in).nextInt()));
    }

    private static int findRank(int[] arr, int r) {
        int count = 0;
        for (int i : arr) {
            if (i <= r) {
                count++;
            }
        }
        return count;
    }
}
