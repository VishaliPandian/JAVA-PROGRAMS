import java.util.*;

public class Enum {
  enum Chocolates
  {
    DAIRYMILK,FERRERO,GALAXY,AMUL;
  }
    public static void main(String[] args) 
    {
      Chocolates a=Chocolates.AMUL;
      switch(a)
      {
        case DAIRYMILK:
          System.out.println("VERY TASTY");
          break;
        case FERRERO:
          System.out.println("DELICIOUS");
          break;
        case GALAXY:
          System.out.println("VERY YUMMY");
          break;
        case AMUL:
          System.out.println("AWESOME TASTE");
          break;
      }
  }
}