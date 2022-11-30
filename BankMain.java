import java.util.*;

public class BankMain {
    public static void main(String[] args) {
      Bank ob=new Bank();
      ob.withdraw(500);
  }
}
class BankBalance extends Exception
{
  public BankBalance(String s)
  {
    super(s);
  }
}
class Bank
{
  float amount;
  public Bank()
  {
    amount=2000;
  }
  void withdraw(float wamount)
  {
    try 
    {
      if(wamount>amount)
      {
        throw new BankBalance("Insufficient Balance");
      }
      else
      {
        amount=amount-wamount;
        System.out.println("Bank Balance: "+wamount);
      }
      
    } catch(BankBalance e) 
    {
      e.printStackTrace();
    }
  }
}
