package org.training.tasks.patterns.methFactory;

public abstract class ClientCreation {
    public String getClientInfo(){
        Client client = createClient();
        return client.getClientInfo();
    }

    public abstract Client createClient();
}
