package org.training.tasks.patterns.absFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Client client = clientChoice();
        client.check();


    }
    public static Client clientChoice(){
        Client client = null;
        AccountFactory accF;
        Scanner scan=new Scanner(System.in);
        boolean status;
        int i;
        do{
            status = true;
            System.out.println("1-Individual;"+"\n"+"2-Juridical"+"\n"+"Enter a number:");
            i = scan.nextInt();
            switch (i){
                case 1:{
                    accF = new IndividualAccountFactory();
                    client = new Client(accF);
                    break;
                }
                case 2:{
                    accF = new JuridicalAccountFactory();
                    client = new Client(accF);
                    break;
                }
                default: status = false;

            }
        } while (!status);
        
        return client;
    }
}
