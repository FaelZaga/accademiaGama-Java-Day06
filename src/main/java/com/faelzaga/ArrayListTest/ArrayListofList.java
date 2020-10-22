package main.java.com.faelzaga.ArrayListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListofList {

    public static void main(String[] args) {
        List familyA = new ArrayList();

        familyA.add("Pedro");
        familyA.add("Maria");
        familyA.add("Marina");

        List familyB = new ArrayList();

        familyB.add("Fernando");
        familyB.add("Marcela");

        List<List> families = new ArrayList();

        families.add(familyA);
        families.add(familyB);

        for (int i=0; i < families.size(); i++) {
            for (int y=0; y < families.get(i).size(); y++) {
                System.out.println(families.get(i).get(y));
            }
        }

    }

}
