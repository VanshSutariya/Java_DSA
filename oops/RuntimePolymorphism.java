class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splender extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Splender s = new Splender();
        s.run();
        Bike b = new Bike();
        b.run();
    }

}
