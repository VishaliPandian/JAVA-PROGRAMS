import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class LinkedListforuserdefineddatatype
{
  public static void main (String[]args)
  {
    Employee e1=new Employee(1,25,"RAM",50000.5f);
    Employee e2=new Employee(2,25,"RAJ",55000.5f);
    Employee e3=new Employee(3,26,"SIVA",60000.5f);
    Employee e4=new Employee(4,24,"SHALI",65000.5f);
    Employee e5=new Employee(5,23,"PADMA",50000.5f);
    
    List<Employee> lobj=new LinkedList<Employee>();
    lobj.add(e1);
    lobj.add(e2);
    lobj.add(e3);
    lobj.add(e4);
    lobj.add(e5);
    System.out.println(lobj);
    
    Iterator<Employee> eitor=lobj.iterator();
    System.out.println("ID\tAGE\tNAME\tSALARY");
    while(eitor.hasNext())
    {
      Employee em1=eitor.next();
      System.out.println(em1.eid+"\t"+em1.eage+"\t"+em1.ename+"\t"+em1.esalary);
    }
    
    
    
  }
}
class Employee
{
  int eid;
  int eage;
  String ename;
  float esalary;
  public Employee(int eid,int eage,String ename,float esalary)
  {
    super();
    this.eid=eid;
    this.eage=eage;
    this.ename=ename;
    this.esalary=esalary;
  }
  @Override
  public String toString()
  {
    return "EmpDetails[ID: "+eid+" AGE: "+eage+" NAME: "+ename+"]";
  }
  
}
