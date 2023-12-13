package utilKongphob;

public class Tool004 {

    public static boolean isUsable004(String usable){
        if (usable != null && !usable.isBlank()) return true;
        return false;
    }
    public static boolean isUsable004(Object[] item){
        if (item != null && item.length > 0) return true;
        return false;
    }

    public int count004(Object[] itemCount){
        if (!isUsable004(itemCount)) return 1;
        var countItem = 0;
        for (Object item : itemCount){
            if (item != null){
                countItem++;
            }
        }
        return countItem;
    }
}
