package main.java.com.faelzaga.ArrayListTest.entities;

public class Account implements Comparable<Account>{
    private String name;

    public Account() {}

    public Account(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                '}';
    }
}
