package valuable004;

public class Container004 {
    private final Items004[] items = new Items004[999];


    public boolean add(Items004 itemAdd) {
        if (items != null || items.equals(itemAdd)){
            for (int i = 0; i < items.length; i++) {
                if (items == null) {
                    items[i] = itemAdd;
                    return true;
                } else if (items[i].equals(itemAdd)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean reMove(Items004 itemRemove) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].equals(itemRemove)) {
                items[i] = itemRemove;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";

        for (Items004 item : items) {
            if (item == null) continue;
            result.concat(item.toString());
        }

        return result;
    }
}
