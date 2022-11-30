import java.util.*;

public class BasicsHashMap {
    public static void main(String[] args) {
      Map<String, String> hm=new HashMap<String, String>();
      hm.put("n", "s");
      hm.put("d", "g");
      hm.put("h", "i");
      hm.put("j", "e");
      System.out.println(hm);
      System.out.println("char:"+hm.get("d"));
      System.out.println("Is empty?"+hm.isEmpty());
      System.out.println("Size:"+hm.size());
  }
}