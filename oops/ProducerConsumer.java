class Procon
{
    boolean m = false;
    int data ;
      synchronized void prod(int x)
      {
          data = x;
          if(!m)
          {
                System.out.println("Put" + data);
                m=true;
                notify();
          }
          try {
            wait();
       } 
       catch (InterruptedException e) {
           System.out.println("Wait");                 
       }
      }
      synchronized void consu()
      {
          if(!m)
          {
            try {
                wait();
           } 
           catch (InterruptedException e) {
               System.out.println("Wait");                 
           }
          }
                System.out.println("Got" + data);
                m=false;
                notify();
          
          
      }
}
class Pro implements Runnable
{
    Procon pc;
    Thread t;
    Pro(String n, Procon pc)
    {
        this.pc = pc;
        t =new Thread(this , n);
        t.start();
    }
    public void run()
    {
          for(int i = 0 ; i<=10 ; i++)
          {
              pc.prod(i);
          }
    }
}
class Consumer implements Runnable
{
    Procon pc;
    Thread t;
    Consumer(String n, Procon pc)
    {
        this.pc = pc;
        t =new Thread(this , n);
        t.start();
    }
    public void run()
    {
          for(int i = 0 ; i<=10 ; i++)
          {
              pc.consu();
          }
    }
}
class ProducerConsumer 
{
    public static void main(String[] args) {
        Procon pc = new Procon();
        Pro p = new Pro("put",pc);
        Consumer c = new Consumer("get", pc);
    }
}