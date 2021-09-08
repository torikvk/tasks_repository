package org.training.tasks.patterns.methFactory;

public class IndividualClientCreation extends ClientCreation{
    @Override
    public Client createClient() {
        return new IndividualClient();
    }
}
