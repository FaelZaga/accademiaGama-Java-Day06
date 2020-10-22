package main.java.com.faelzaga.ArrayListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTests {

    public static void main(String[] args) {
        List colors = List.of("Blue","Red","Green","Yellow","Purple"); //Immutable
        readAll(colors);

        List names = new ArrayList();
        names.add("Tania");
        names.add("Leonardo");
        names.add("Nilvande");
        names.add("Rafael");
        readAll(names);

        names.add(2,"Bruna");
        readAll(names);

        names.set(4,"Rafael Gonzaga Brito");
        readAll(names);

        names.remove(4);
        readAll(names);

        wipeOut(names);
        readAll(names);
    }

    public static void readAll(List list) {
        System.out.println("---------------LIST--------------");
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------END---------------");
    }

    public static void wipeOut(List list) {
        for (int i= list.size()-1; i >= 0; i--) {
            list.remove(i);
        }
    }

}
