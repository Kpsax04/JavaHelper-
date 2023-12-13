package arrMethod;

import java.util.Arrays;

public class ArrBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,123,6556,23,79,123};
        //หลักการใช้ Arrays.binarySearch(name,values); นั้นเราจำเป็นต้องทำการ sort เพื่อจัดเรียงข้อมูลใน Array ก่อนมิฉะนั้นเราจะใช้ binarySearch ไม่ได้
        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr,123);
        int indexTest = Arrays.binarySearch(arr,23);
        System.out.println("Arrays.binarySearch : " + indexTest);
        //ในที่นี้ Arrays.binarySearch นั้นจะทำการค้นหาตำแหน่งของเลขที่เราใส่ลงไปใน Arrays เช่น Item[] = {0,1,2,3,4,5,6,7,8}
        //เลือก เลข 2 แล้วเมื่อ output ออกมาจะมีการแสดงผลว่าเลข 2 จะอยู่ในตำแหน่งที่ 2;
    }



}
