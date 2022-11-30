import java.util.*;

public class DecendingAndAscendingorderusingTreeSet {
    public static void main(String[] args) {
      //Tree Set for Decending order
      TreeSet<Integer> sob=new TreeSet<Integer>(Collections.reverseOrder());
      sob.add(24);
      sob.add(2);
      sob.add(204);
      sob.add(2);
      System.out.println(sob);
      Iterator<Integer> itor=sob.iterator();
      while(itor.hasNext())
      {
        System.out.println(itor.next());
      }
      //Tree Set for Ascending order
      TreeSet<Integer> sob1=new TreeSet<Integer>();
      sob1.add(24);
      sob1.add(2);
      sob1.add(204);
      sob1.add(2);
      System.out.println(sob1);
      Iterator<Integer> itor1=sob1.iterator();
      while(itor1.hasNext())
      {
        System.out.println(itor1.next());
      }
  }
}