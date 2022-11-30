class Main {
    public static void main(String[] args) {
        Thread1 ob=new Thread1();
        ob.setName("vish");
        Thread1 ob1=new Thread1();
        ob1.setName("shali");
        ob.start();
        ob1.start();
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Name="+Thread.currentThread());
            System.out.println(i);
            try{
                Thread.sleep(2000);
                
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
        }
    }
}
