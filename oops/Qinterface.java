// interface inheritance 

interface p 
{
   int a = 25;
   void m();
}

interface p1  extends p
{
  int b = 24;
  void m1();

}

interface p2 extends p 
{
  int c = 12;
  void m2();
}

interface p12 extends p1 , p2
{
   int d =8; 
   void m12();

}

class N implements p12
{
   
 public  void display()
 {
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    System.out.println("d="+d); 
 }
 public void m()
 {
   System.out.println("hi p interface");
 }

 public void m1()
 {
   System.out.println("hi p1 interface");
 }
 public void m2()
 {
   System.out.println("hi p2 interface");
 }
 public void m12()
 {
   System.out.println("hi p12 interface");
 }
}

class Qinterface
{
  public static void main(String[] args) {
    N q = new N();
    q.display();
    q.m();
    q.m1();
    q.m2();
    q.m12();
  }
}