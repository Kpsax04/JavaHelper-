package util004;

public class Tool004 {
    public static boolean isUsable004(String x){
        if (x != null && !x.isBlank()) return true;
        return false;
    }
    public  static boolean isUsable004(Object[] a){
        if (a != null && a.length > 0) return true;
        return false;
    }
    public static int add004(Object[] a){
        if(!isUsable004(a)) return -1;
        var count = 0;
        //loop obj loop a มาในรูปของ objects
        for (var obj : a)  {
          if (obj != null){
              count++;
          }
          
        }
        return count;
    }

}
