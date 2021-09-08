package org.training.tasks.patterns.absFactory;

public class JuridicalDeposit implements Deposit{
    @Override
    public void checkDeposit() {
        System.out.println("You've created Juridical Deposit");
    }
}
