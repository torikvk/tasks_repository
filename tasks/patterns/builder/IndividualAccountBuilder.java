package org.training.tasks.patterns.builder;

public class IndividualAccountBuilder implements AccountBuilder{
    private Account indAccount = new Account();

    @Override
    public AccountBuilder clientName(String name) {
        indAccount.setName(name);
        return this;
    }

    @Override
    public AccountBuilder clientSurname(String surname) {
        indAccount.setSurname(surname);
        return this;
    }

    @Override
    public AccountBuilder clientPassNumber(String passNum) {
        indAccount.setPassNumber(passNum);
        return this;
    }

    @Override
    public AccountBuilder clientSum(double sum) {
        indAccount.setSum(sum);
        return this;
    }

    @Override
    public Account build() {
        return indAccount;
    }
}
