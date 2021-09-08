package org.training.tasks.patterns.absFactory;

public class IndividualCredit implements Credit {
    @Override
    public void checkCredit() {
        System.out.println("You've created Individual Credit");

    }
}
