class Dc {
    String name = "vansh";
    static int age = 20;

    static void func() {
        System.out.println(" i am function");
    }

}

public class DeepCpy {
    public static void main(String[] args) {
        Dc d = new Dc();
        Dc d1 = new Dc();
        d1.name = "Sutariya";
        System.out.println(d.name);
        System.out.println(d1.name);
        System.out.println(Dc.age);
        Dc.func();

    }
}
