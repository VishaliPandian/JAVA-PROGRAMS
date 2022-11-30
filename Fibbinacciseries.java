import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Fibbinacciseries
{
  int f1,f2,f3,terms;
  Fibbinacciseries()
  {
    f1=0;
    f2=1;
  }
  void inputdata()
  {
    InputStreamReader is= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(is);
    System.out.println("Enetr the num of terms:");
    terms=Integer.parseInt(br.readLine());
  }
  void generateseries()
  {
    System.out.println("Fibbonacci Series:");
    System.out.println(f1);
    System.out.println(f2);
    for(int i=1;i<=terms-1;i++)
    {
      f3=f1+f2;
      System.out.println(f3);
      f1=f2;
      f2=f3;
    }
  }
}


public class Fibbinacciseriesmain {

  public static void main(String[] args)throws IOException{
    Fibbinacciseries ob=new Fibbinacciseries();
    ob.inputdata();
    ob.generateseries();
  }

}