class A {

    void fun() {
        System.out.println("Iam class A");
    }
}

class B {
    void fun() {

        System.out.println("I am class B");
    }
}

class Overridingdemo {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.fun();
    }
}