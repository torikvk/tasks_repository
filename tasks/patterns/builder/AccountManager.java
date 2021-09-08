package org.training.tasks.patterns.builder;

public class AccountManager {

    private IndividualAccountBuilder builder = new IndividualAccountBuilder();

    public Account createAccount(String name, String surname, String passNum, double sum){
        return builder.clientName(name)
                .clientSurname(surname)
                .clientPassNumber(passNum)
                .clientSum(sum)
                .build();
    }
}
