package Q7;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 9, 3, -1, 2, 1, 0, 4, -1, 9, 7, 8 };

        int ele = firstNonRepeatingElement(arr);
        System.out.println(ele);
    }

    private static int firstNonRepeatingElement(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int curr = map.get(ele);
                map.put(ele, curr + 1);

            } else {
                map.put(ele, 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.printf("%d -> %d\n", key, map.get(key));
            if (map.get(key) == 1) {
                return key;
            }
        }

        return 0;
    }
}
