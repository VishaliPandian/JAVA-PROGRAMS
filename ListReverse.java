import java.util.*;

public class ListReverse {
    public static void main(String[] args) {
      LinkedList<Integer> ll=new LinkedList<>();
      ll.add(1111);
      ll.add(222);
      ll.add(3333);
      ll.add(44444);
      LinkedList<Integer> linl=new LinkedList<>();
      ll.descendingIterator().forEachRemaining(linl::add);
      
      System.out.println(ll);
      System.out.println(linl);
  }
}