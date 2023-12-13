import valuable004.Items004;

public class Main {
    public static void main(String[] args) {
    testItems();
    }
    static void testItems(){
        Items004 items1 = Items004.create("Kong",1);
        Items004 items2 = Items004.create("Mha",2);
        Items004 items3 = Items004.create("Mhe",3);
        items1.add(items2);
        items1.isMatch(items3);
        items2.isMatch(items1);

        System.out.println(items1);
    }
}
