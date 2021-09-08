package org.training.tasks.patterns.builder;

public interface AccountBuilder {

    public AccountBuilder clientName(String name);
    public AccountBuilder clientSurname(String surname);
    public AccountBuilder clientPassNumber(String passNum);
    public AccountBuilder clientSum(double sum);
    public Account build();

}
