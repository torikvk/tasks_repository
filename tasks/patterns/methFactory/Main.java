package org.training.tasks.patterns.methFactory;

public class Main {
    public static void main(String[] args) {
        ClientCreation indClient, jurClient;
        indClient = new IndividualClientCreation();
        jurClient = new JuridicalClientCreation();
        System.out.println(indClient.getClientInfo());
        System.out.println(jurClient.getClientInfo());
    }
    }
