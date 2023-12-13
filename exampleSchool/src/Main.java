import school.Student;

public class Main {
    public static void main(String[] args) {
        testStudent();
    }
    static void testStudent() {
        Student student3 = new Student(3, "Charlie", 100);
        Student student4 = new Student(4, "Diana", 100);
        Student student1 = new Student(1, "Alice", 100);
        Student student2 = new Student(2, "Bob", 100);
        Student student5 = new Student(5, "Ethan", 100);

        //add
        System.out.println(Student.listAll());
        System.out.println("remove 1 ... ");
        //remove
        Student.remove(1);
        System.out.println(Student.listAll());

        System.out.println(" allowance ... ");
        //averagaAllowance
        System.out.println(Student.averagaAllowance());

        System.out.println(" sort .... ");
        //sort
        Student.sort();
        System.out.println(Student.listAll());
    }

}
