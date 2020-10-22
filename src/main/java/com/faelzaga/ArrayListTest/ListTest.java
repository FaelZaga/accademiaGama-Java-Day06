package main.java.com.faelzaga.ArrayListTest;

import main.java.com.faelzaga.ArrayListTest.entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<Account>();

        Random rdm = new Random();

        for (int i=0; i < 10; i++) {
            Account account = new Account(rdm.nextInt());
            accounts.add(i,account);
        }

        for (int i=0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }

    }
}
