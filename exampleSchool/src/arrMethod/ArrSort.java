package arrMethod;

import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] x = {2,12,55,0,1,345};
        Arrays.sort(x);
        System.out.println("Arrays.sort : " + Arrays.toString(x));
    }
}
