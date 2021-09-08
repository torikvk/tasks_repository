package org.training.tasks.patterns.absFactory;

public class JuridicalAccountFactory implements AccountFactory{
    @Override
    public Credit createCredit() {
        return new JuridicalCredit();
    }

    @Override
    public Deposit createDeposit() {
        return new JuridicalDeposit();
    }
}
