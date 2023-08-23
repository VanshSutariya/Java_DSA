package LinkList;

public class Main {
    public static void main(String[] args) {

        // LL list = new LL();
        // list.insertFirst(5);
        // list.insertFirst(6);
        // list.insertFirst(7);
        // list.insertFirst(8);
        // list.insertLast(3);
        // list.insert(100, 2);
        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();

        // DLL list = new DLL();
        // list.insertFirst(5);
        // list.insertFirst(6);
        // list.insertFirst(7);
        // list.insertFirst(8);
        // list.insertLast(19);
        // list.insert(6, 10);
        // list.display();

        CLL list = new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.delete(30);
        list.display();

    }
}
