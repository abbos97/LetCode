package day5_Collections;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("V");
        list.addFirst("z");
        list.addLast(null);
        System.out.println(list);

    }
}
