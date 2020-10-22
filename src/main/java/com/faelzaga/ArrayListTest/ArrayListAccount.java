package main.java.com.faelzaga.ArrayListTest;

import main.java.com.faelzaga.ArrayListTest.entities.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAccount {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<Account>();

        Account acc1 = new Account("Fulano");
        Account acc2 = new Account("Cicrano");
        Account acc3 = new Account("Beltrano");
        Account acc4 = new Account("Pedregundo");
        Account acc5 = new Account("Zanildita");
        Account acc6 = new Account("Jamainda");
        Account acc7 = new Account("Anike");

        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        accounts.add(acc4);
        accounts.add(acc5);
        accounts.add(acc6);
        accounts.add(acc7);

        readAll(accounts);

        Collections.sort(accounts);

        readAll(accounts);
    }

    public static void readAll(List list){
        System.out.println("---------------LIST--------------");
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------END---------------");
    }
}
