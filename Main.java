/*interface Drawable
{
  void draw();
  default void msg()
  {
    System.out.println("Default");
  }
}
class Rectangle implements Drawable
{
  public void draw()
  {
    System.out.println("Draw Rectangle");
  }
}
public class Main
{
  public static void main(String[] args) {
    Drawable ob=new Rectangle();
    ob.draw();
    ob.msg();
  }
}*/
class Main{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}
}
interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  

