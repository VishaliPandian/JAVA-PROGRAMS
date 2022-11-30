public class BankBalancecheck
{
  public static void main(String[] args)
  {
    Balancecheck bob=new Balancecheck();
    bob.check(2500);
  }
}

class BankBal extends Exception
{
  BankBal(String s)
  {
   super(s); 
  }
}
class Balancecheck
{
  double amount;
  Balancecheck()
  {
    amount=200000;
  }
  public void check(float wamount)
  {
    try 
    {
      if(wamount>amount)
      {
        throw new BankBal("Insufficient Balance");
      }
      else
      {
        amount=amount-wamount;
        System.out.println("Balance Amount: "+amount);
      }
    } catch(BankBal e) 
    {
      e.printStackTrace();
    }
  }
}
