package org.training.tasks.patterns.methFactory;

public class JuridicalClientCreation extends ClientCreation{
    @Override
    public Client createClient() {
        return new JuridicalClient();
    }
}
