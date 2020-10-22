package main.java.com.faelzaga.ArrayListTest.entities;

public class Account implements Comparable<Account>{
    private String name;
    private int balance;

    public Account() {}

    public Account(String name) {
        this.name = name;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Account other) {
        return name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
