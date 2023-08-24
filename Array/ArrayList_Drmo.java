import java.util.*;

public class ArrayList_Drmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>(10);

        // for (int i = 0; i < 5; i++) {
        // list.add(sc.nextInt());
        // }
        // for (int i = 0; i < 5; i++) {
        // System.out.println(list.get(i));
        // }

        // System.out.println(list);

        // 2d array
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // for (int i = 0; i < 3; i++) {
        // list.add(new ArrayList<>());
        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // list.get(i).add(sc.nextInt());
        // }
        // }
        // System.out.println(list);

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(11);
        // ArrayList<Integer> newList = new ArrayList<>();
        // newList.add(12);
        // newList.add(13);
        // list.addAll(newList);

        // System.out.println(list);

        // Remove element from list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(14);

        // list.remove(2);
        // list.remove(Integer.valueOf(10));

        // list.clear(); // it will remove all elements from list

        list.set(1, 600);
        System.out.println(list);
        System.out.println(list.contains(600));
    }
}
