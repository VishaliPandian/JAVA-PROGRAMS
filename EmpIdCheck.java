public class EmpIdCheck {

  public static void main(String[] args)
  {
    EmplId ob=new EmplId();
    ob.check(500);
  }

}
class EmplException extends Exception
{
  public EmplException(String s)
  {
    super(s);
  }
}
class EmplId
{
  public void check(int eid)
  {
    try 
    {
      if(eid<=0 || eid>999)
      {
        throw new EmplException("Invalid Id");
      }
      else
      {
        System.out.println("Valid Id"); 
      }
    } catch(EmplException e) 
    {
      e.printStackTrace();
    }
  }
}
