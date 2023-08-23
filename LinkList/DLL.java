package LinkList;

public class DLL {
    private Node head;

    // insert node at first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // insert at last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            head = node;
            node.prev = null;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println(after + " Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        if (p.next != null) {
            p.next.prev = node;
        }
        node.prev = p;
        p.next = node;
    }

    // display DLL
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "-> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
