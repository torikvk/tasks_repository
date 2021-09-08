package org.training.tasks.patterns.absFactory;

public class IndividualDeposit implements Deposit{
    @Override
    public void checkDeposit() {
        System.out.println("You've created Individual Deposit");
    }
}
