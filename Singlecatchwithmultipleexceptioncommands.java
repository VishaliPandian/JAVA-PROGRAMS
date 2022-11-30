public class Singlecatchwithmultipleexceptioncommands
{
  public static void main(String[] args)
  {
    int a=10,b=2,c=1;
    int ar[]={1,2,3,4,5,6};
    try
    
    {
      c=a/b;
      ar[6]=34;
    }
    catch(ArithmeticException | ArrayIndexOutOfBoundsException e)//feature works in java 7
    {
      e.printStackTrace();
    }
    finally
    {
      System.out.println("finally blocks executed ");
    }
  }
}