import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class BasicsofTreemapp
{
  public static void main(String[] args)
  {
    Person p1=new Person();
    Person p2=new Person();
    Person p3=new Person();
    Person p4=new Person();
    Person p5=new Person();
    
    p1.inputdata();
    p2.inputdata();
    p3.inputdata();
    p4.inputdata();
    p5.inputdata();
    
    Map<String, String> tm=new TreeMap<String, String>();
    tm.put(p1);
    tm.put(p2);
    tm.put(p3);
    tm.put(p4);
    tm.put(p5);
    System.out.println(tm);
  }
}
class Person
{
  String phnum;
  String name;
  public Person()
  {
    super();
  }
  void inputdata()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Details:");
    System.out.println("Enter Phone Number:");
    phnum=sc.next();
    System.out.println("Enter Name:");
    name=sc.next();
  }

  public String toString()
  {
    return"["+phnum+""+name+"]";
  }
}
/*public class BasicsTreeMap {
    public static void main(String[] args) {
      Map<Long, String> treem=new TreeMap<Long, String>();
      treem.put(1234567890", "Siva");
      treem.put(9087654321", "Gayu");
      treem.put("9753124680", "Ishu");
      treem.put("1357908642", "Eshwar");
      treem.put("2468097531", "Ammu");
      System.out.println(treem);
      System.out.println(treem.size());
  }
}*/