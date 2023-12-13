package arrMethod;

import java.util.Arrays;

public class ArrCopyRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14,15};

        int[] arr2 = Arrays.copyOfRange(arr,5,10);
        int[] arr3 = Arrays.copyOfRange(arr,5,20);
        String str = Arrays.toString(arr2);
        String str2 = Arrays.toString(arr3);
        System.out.println(str);
        System.out.println(str2);
    }
}
