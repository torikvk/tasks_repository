package org.training.tasks.patterns.methFactory;

public class IndividualClient implements Client{
    private String info;

    public IndividualClient(){
        info = "Individual Client Information";
    }
    @Override
    public String getClientInfo() {
        return info;
    }
}
