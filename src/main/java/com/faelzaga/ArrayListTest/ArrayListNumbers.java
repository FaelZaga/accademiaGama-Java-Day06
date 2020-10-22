package main.java.com.faelzaga.ArrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Random rdm = new Random();

        for (int i=0; i < 20; i++){
            numbers.add(rdm.nextInt());
        }

        readAll(numbers);

        Collections.sort(numbers);

        Integer secondHighestNumber = numbers.get(numbers.size()-2);

        System.out.println("The second highest number of the list is "+secondHighestNumber);
    }

    public static void readAll(List list){
        System.out.println("---------------LIST--------------");
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------END---------------");
    }
}
