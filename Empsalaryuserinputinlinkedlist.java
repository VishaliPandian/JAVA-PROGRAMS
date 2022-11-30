import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Employee1 e1=new Employee1();
    Employee1 e2=new Employee1();
    Employee1 e3=new Employee1();
    Employee1 e4=new Employee1();
    Employee1 e5=new Employee1();
    
    e1.inputEmployee1();
    e2.inputEmployee1();
    e3.inputEmployee1();
    e4.inputEmployee1();
    e5.inputEmployee1();
    
    List<Employee1> lobj=new LinkedList<Employee1>();
    lobj.add(e1);
    lobj.add(e2);
    lobj.add(e3);
    lobj.add(e4);
    lobj.add(e5);
    //System.out.println(lobj);
    
    Iterator<Employee1> eitor=lobj.iterator();
    System.out.println("      Employee Details     ");
    System.out.println("___________________________");
    System.out.println("ID\tAGE\tNAME\tSALARY");
    while(eitor.hasNext())
    {
      Employee1 em1=eitor.next();
      System.out.println(em1.ename+"\t"+em1.eid+"\t"+em1.eage+"\t"+em1.esalary);
    }
    
    
    
  }
}
class Employee1
{
  int eid;
  int eage;
  String ename;
  float esalary;
  public Employee1()
  {
    super();
  }
  void inputEmployee1()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name:");
    ename=sc.next();
    System.out.println("Enter Id:");
    eid=sc.nextInt();
    System.out.println("Enter Age:");
    eage=sc.nextInt();
    System.out.println("Enter Salary:");
    esalary=sc.nextFloat();
  }
  
}
