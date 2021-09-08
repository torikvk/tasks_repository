package org.training.tasks.patterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        String name, surname, passNum;
        double sum;
        name = "Isidore";
        surname = "Iolanthe";
        passNum = "mp1111111";
        sum = 1234.45;
        Account acc = new AccountManager().createAccount(name,surname,passNum,sum);
        System.out.println(acc.toString());
    }
}
