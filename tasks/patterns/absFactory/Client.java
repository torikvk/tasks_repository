package org.training.tasks.patterns.absFactory;

public class Client {
    private Credit cred;
    private Deposit dep;

    public Client(AccountFactory accF){
        cred = accF.createCredit();
        dep = accF.createDeposit();
    }
    public void check(){
        cred.checkCredit();
        dep.checkDeposit();
    }
}
