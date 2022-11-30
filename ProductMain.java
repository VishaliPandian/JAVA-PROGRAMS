public class ProductMain
{

  public static void main(String[] args)
  {
    Product pob=new Product();
    pob.propricecheck(10000);
    
  }

}
class ProductException extends Exception
{
  public ProductException(String s)
  {
    super(s);
  }
}
class Product
{
  public void propricecheck(float price) 
  {
    try 
    {
      if(price<0||price>10000)
      {
        throw new ProductException("Invalid Price");
      }
      else
      {
        System.out.println("Valid Price"); 
      }
    } catch(ProductException e) 
    {
      e.printStackTrace();
    }
    
  }
}
