public class Lamda1
{
  public static void main(String[] args)
  {
    Hi hob=(t)->
    {
      System.out.println("Hi "+t);
    };
    hob.sayHi("Vishali");
  }
}
interface Hi
{
  void sayHi(String t);
}
