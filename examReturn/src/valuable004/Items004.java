package valuable004;

import util004.Tool004;

public class Items004 {
    public static void main(String[] args) {
        Items004 item1 =  Items004.create("asd" , 12);
        Items004 item2 =  Items004.create("asd" , -1);
        System.out.println(item2);

        System.out.println(item1);
    }
    private final String name;
    private int amount;

    private Items004(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public static Items004 create(String name, int amount) {
        if (Tool004.isUsable004(name) && amount > 0) return  new Items004(name, amount);
        return null;
    }
    public int add(Items004 item) {
        if(item == null) throw new RuntimeException("item is null");
        amount += item.amount;
        return amount;
    }
    public boolean isMatch(Items004 item) {
        return item != null && name.equals(item.name);
    }

    @Override
    public String toString() {
       return String.format("%s %s", name, amount);
    }



}
