package org.training.tasks.patterns.absFactory;

public class IndividualAccountFactory implements AccountFactory{
    @Override
    public Credit createCredit() {
        return new IndividualCredit();
    }

    @Override
    public Deposit createDeposit() {
        return new IndividualDeposit();
    }
}
