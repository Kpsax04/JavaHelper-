package school;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Student implements Comparable<Student> {
    private final int id;
    private String name;
    private double allowance;
    private static  Student[] all;
    private static int count;
    public static Student remove(int id){
        for (int i = 0; i < count; i++){
            if(all[i].id == id) {
                var temp = all[i];
                all[i] = all[--count]; // ถ้าเขียนอีกแบบหนึ่งก็คือ all[i] = all[--count]  คือการน้ำ count - ออกไป 1
                all[count] = null;
              return temp;
            }
        }
        return  null;
    }
    //ข้อที่ยากที่สุด!!!!!!!!
    public  Student(int id, String name, double allowance) {
        if (id < 0 || name == null || allowance <= 0) throw new IllegalArgumentException();
        //ถ้า id ซ้ำอยู่ใน Array all เราจะต้องค้นหาใน Array all
        for (int i = 0; i < count; i++) {
            if (all[i].id == id) throw new IllegalArgumentException();
        }
        this.id = id;
        this.name = name;
        this.allowance = allowance;
        if (all == null) {
            all = new Student[2];
        } else if (all.length == count) {
            all = Arrays.copyOf(all, all.length * 2);
        } //กำหนด condition ว่าถ้า Array all เป็นค่าว่างจะให้สร้าง Array all ตัวใหม่มาใน Type Student มีขนาด Arrayเป็น 2
        all[count++] = this;
    }

    public static double averagaAllowance(){
        if (count == 0) return -1.0;
        double result = 0.0;
        for (int i = 0; i < count; i++){
            result += all[i].allowance;
        }
        return result / count;
    }
    public static void sort(){
        Arrays.sort(all,0,count);
    }
    public static String listAll(){
        var s = new StringJoiner(", \n");
        for (int i = 0; i < count; i++){
            s.add(all[i].toString()); //ไม่ต้องเรียก method toString เพราะ StringBuilder จะไป เรียกออก
        }
        return s.toString();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getAllowance() {return allowance;}

    public void setAllowance(double allowance) {this.allowance = allowance;}
    public  int getId() {return id;}
    @Override public String toString() {return String.format("Student(%d,'%s',%f)",id,name,allowance);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {return id;}

    @Override
    public int compareTo(Student o) {return  id - o.id;}
}
 /*
1) create a public class "Student" in package "school" having 3 private non-static fields:
   "id" (int,final), "name" (String), "allowance" (double).
1.1) create setters for all non-static fields except "id",
     and getters for all non-static fields.
1.2) @Override the "equals" and "hashCode" methods using only the "id" of Student.
1.3) @Override the "toString" method to return a String in this format:
     "Student(id,'name',allowance)".

1.4) implement Comparable<Student> for Student by comparing only the "id" of Student.
1.5) add 2 private static fields: "all" (of Student array type) to store
     all Students created and "count" (of int type) to count
     the number of Students stored in the array.

1.6) create a constructor that receives 3 parameters: "id", "name", "allowance"
     to initialize the 3 fields if a Student object can be created.
     A Student object can be created if "name" is not null,
     "allowance" is more than zero, "id" is not negative,
     and the "id" is not already in the Student array ("all").
     If a Student can be created, put it in the array "all" and increment the "count".
    Note that if "all" is null, create an array of size 2 first.
    If "all" is full, double its size.*

    If a Student cannot be created, throws an IllegalArgumentException.
1.7) create a public static method named "averagaAllowance" that receives no argument and
    returns the average allowance of "all" Student.  This method returns a negative value
    if "all" is null or there is no Student in "all".
1.8) create a public static method named "remove" that receives an int (named "id").
    This method removes the Student with id equals to "id" from "all" and return that Student.
    This method returns null if "all" is null or there is no Student with that id in the array.
    When removing a Student from the array, move that last element in the array to replace
    the Student that is removed and decrement the "count".
1.9) create a public static void method named "sort" to sort the array.
1.10) create a public static method named "listAll" to return a String containing
      all Students in "all" separated by "; ".
*/
