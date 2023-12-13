package valuableKongphob;

import utilKongphob.Tool004;

public class Item004 {

    private final String name;
    private int amount;

    public Item004(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public static Item004 create(String name, int amount){
       if (Tool004.isUsable004(name) && amount > 0) return new Item004(name, amount);
           return  null;
    }

    @Override
    public String toString() {
      return String.format("%s %d", name, amount);
    }
}
