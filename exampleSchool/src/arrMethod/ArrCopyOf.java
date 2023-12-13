package arrMethod;

import java.util.Arrays;

public class ArrCopyOf {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr2 = Arrays.copyOf(arr,5);
//        int[] arr3 = Arrays.copyOf(arr,15);
//        String str = Arrays.toString(arr2);
//        String str2 = Arrays.toString(arr3);
//        System.out.println("Arrays.copyOf : " + str);
//        System.out.println("Arrays.copyOf : " + str2);
        int[] arr4 = {1,2,3,4,5,6};
        int[] systemcopy = new int[6];
        System.arraycopy(arr4, 0, systemcopy, 0,arr4.length);

        for (int value : systemcopy){
            System.out.println(value + " ");
        }


    }
}
