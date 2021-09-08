package org.training.tasks.patterns.methFactory;

public class JuridicalClient implements Client{
    private String info;
    public JuridicalClient(){
        info = "Juridical Client Information";
    }
    @Override
    public String getClientInfo() {
        return info;
    }
}
