package arrMethod;

import java.util.Arrays;

public class ArrFill {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.fill(arr,2,5,12);
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
