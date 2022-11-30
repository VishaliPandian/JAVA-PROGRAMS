import java.util.ArrayList;
public class Arrayofintdatatype
{
  public static void main(String[] args)
  {
    ArrayList<Integer> lob=new ArrayList<>();
    lob.add(24);
    lob.add(33);
    lob.add(31);
    lob.add(5);
    lob.add(2);
    lob.add(20);
    lob.add(5);
    System.out.println(lob);
    for(int i:lob)
    {
      System.out.println(i);
    }
    ArrayList<Float> fob=new ArrayList<>();
    fob.add(2.5f);
    fob.add(22.2f);
    fob.add(1001.4f);
    fob.add(450.1f);
    System.out.println(fob);
    for(float j:fob)
    {
      System.out.println(j);
    }
    ArrayList<Double> dob=new ArrayList<>();
    dob.add(1000.5);
    dob.add(400.6);
    dob.add(2000.8);
    dob.add(50000.9);
    System.out.println(dob);
    for(double k:dob)
    {
      System.out.println(k);
    }
    ArrayList<String> sob=new ArrayList<>();
    sob.add("Hi");
    sob.add("Hello");
    sob.add("Welcome");
    sob.add("Joy");
    System.out.println(sob);
    for(String o:sob)
    {
      System.out.println(o);
    }
    
  }
}