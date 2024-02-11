package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(60);
        list2.add(36);
        list2.add(54);
        list2.add(93);

        System.out.println(list2);
        System.out.println("Index[0]=" + list2.get(0) + " Index[1]=" + list2.get(1) + " Index[2]=" + list2.get(2) +
                " Index[3]=" + list2.get(3) + " Index[4]=" + list2.get(4));




    }
}
