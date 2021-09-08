package org.training.tasks.patterns.singleton;

public final class BankInfo {
    private static BankInfo obj;
    private String info;
    private BankInfo(String val){
        this.info = val;
    }
    public static BankInfo getBankInfo(String val) {
        if (obj == null) {
            obj = new BankInfo(val);
        }
        return obj;
    }
    public String getInfo(){
        return info;
    }
}
