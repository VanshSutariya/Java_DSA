
abstract class Parent{
    public Parent(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet(); // cannot write anything in abstract method 
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child c = new Child();
        c.greet();
        c.sayHello();
        //Child3 c3 = new Child3(); -- error
    }
}
