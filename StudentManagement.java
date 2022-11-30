import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class Student
{
    private int studentid;
    private String studentname;
    private int studentatd;
    private int studentfees;
    
    Student(int studentid,String studentname,int studentatd,int studentfees)
    {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentatd = studentatd;
        this.studentfees = studentfees;
    }
    public int getStudentid()
    {
        return studentid;
    }
    public String getStudentname()
    {
        return studentname;
    }
    public int getStudenatd()
    {
        return studentatd;
    }
    public int getStudentfees()
    {
        return studentfees;
    }
    public String toString()
    {
        return studentid+" "+studentname+" "+studentatd+" "+studentfees;
    }
}
public class StudentManagement
{
    public static void main(String[] args) 
    {
        List<Student> s=new ArrayList<Student>();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("6.Exit");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Studentid : ");
                    int sid = sc.nextInt();
                    System.out.print("Enter Studentname : ");
                    String sname = sc1.nextLine();
                    System.out.print("Enter Studentatd in % : ");
                    int satd = sc.nextInt();
                    System.out.print("Enter Studentfees : ");
                    int sfees = sc.nextInt();
                    
                    s.add(new Student(sid,sname,satd,sfees));
                break;
                case 2:
                    System.out.println("--------------------------");
                    Iterator<Student> i=s.iterator();
                    while(i.hasNext())
                    {
                        Student e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("--------------------------");
                break;
                case 3:
                    boolean found=false;
                    System.out.println("Enter Studentid to Search : ");
                    int studentid =sc.nextInt();
                    System.out.println("--------------------------");
                    i=s.iterator();
                    while(i.hasNext())
                    {
                        Student e=i.next();
                        if(e.getStudentid()==studentid)
                        {
                            System.out.println(e);
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------");
                break;
                case 4:
                    found=false;
                    System.out.println("Enter Studentid to Delete : ");
                    studentid =sc.nextInt();
                    System.out.println("--------------------------");
                    i=s.iterator();
                    while(i.hasNext())
                    {
                        Student e=i.next();
                        if(e.getStudentid()==studentid)
                        {
                            i.remove();
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record Not Found");
                    }
                    else
                    {
                        System.out.println("Record is Deleted Successfully....!");
                    }
                    System.out.println("--------------------------");
                break;
                case 5:
                    found=false;
                    System.out.println("Enter Studentid to Update : ");
                    studentid =sc.nextInt();
                    System.out.println("--------------------------");
                    ListIterator<Student> li = s.listIterator();
                    while(li.hasNext())
                    {
                        Student e=li.next();
                        if(e.getStudentid()==studentid)
                        {
                            System.out.println("Enter new Name : ");
                            String studentname = sc1.nextLine();
                            
                            System.out.println("Enter new Atd : ");
                            int studentatd = sc.nextInt();
                            
                            System.out.println("Enter new Fees : ");
                            int studentfees = sc.nextInt();
                            li.set(new Student(studentid,studentname,studentatd,studentfees));
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record Not Found");
                    }
                    else
                    {
                        System.out.println("Record is Updated Successfully....!");
                    }
                    System.out.println("--------------------------");
                break;
                case 6:
                    System.out.println("Thank you");
                return;
                default:
                    System.out.println("Invalid choice");
                break;
            }
        }while(ch!=0);
    }
}