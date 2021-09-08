package org.training.tasks.patterns.singleton;

public class Main {
    public static void main(String[] args){
        BankInfo info = BankInfo.getBankInfo("SWIFT:AKBBBY2X; UNP:100325912");
        BankInfo info2 = BankInfo.getBankInfo("SWIFT:111111111; UNP:100000000");
        System.out.println(info.getInfo()+"/"+info2.getInfo());
    }
}
