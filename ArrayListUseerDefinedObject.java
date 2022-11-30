import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUseerDefinedObject {
    public static void main(String[] args) {
      StudentDetails s1=new StudentDetails(1,"VISHALI",2000.5f);
      StudentDetails s2=new StudentDetails(2,"DHANUSH",2000.6f);
      StudentDetails s3=new StudentDetails(3,"BALA",2000.5f);
      StudentDetails s4=new StudentDetails(4,"SRI",2000.6f);
      //Syntax: ArrayList<Class Name> objname=new ArrayList<Class Name>
      ArrayList<StudentDetails> sobj= new ArrayList<StudentDetails>();
      sobj.add(s1);
      sobj.add(s2);
      sobj.add(s3);
      sobj.add(s4);
      
      System.out.println(sobj);
      //Iterator
      Iterator<StudentDetails> sitor=sobj.iterator();
      System.out.println("ID \t NAME \t FEES");
      while(sitor.hasNext())
      {
        StudentDetails st1=sitor.next();
        System.out.println(st1.sid+"\t"+st1.sname+"\t"+st1.sfees);
      }
  }
}
class StudentDetails
{
  int sid;
  String sname;
  float sfees;
  public StudentDetails(int sid,String sname,float sfees)
  //steps:
  //constructor with arg (generate)
	//to generate const, rightclick->source->generate const with arg
  {
    super();
    this.sid=sid;
    this.sname=sname;
    this.sfees=sfees;
  }
  @Override
  public String toString()
  //generate automaically //to generate toString, rightclick->source->generate toString
  {
    return "StudentDetails[ID: "+sid+",NAME: "+sname+",FEES: "+sfees+"]";
  }
}

