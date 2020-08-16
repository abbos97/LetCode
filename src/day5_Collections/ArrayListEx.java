package day5_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        //ArrayList:
        // This data structure works similar as an array,
        // but the size is expanded whenever needed
        List<String> list = new ArrayList<>();
        list.add("a"); // 0
        list.add("b"); // 1
        list.add("c"); // 2
        list.add("c");
        list.add(null);
        list.set(0, "0");

        System.out.println(list);



    }
}
