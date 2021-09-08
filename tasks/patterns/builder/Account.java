package org.training.tasks.patterns.builder;

public class Account {
    private String name;
    private String surname;
    private String passNumber;
    private double sum;

    public Account() {
        super();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getPassNumber(){
        return this.passNumber;
    }
    public void setPassNumber(String passNumber){
        this.passNumber = passNumber;
    }
    public double getSum(){
        return this.sum;
    }
    public void setSum(double sum){
        this.sum = sum;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ACCOUNT name:").append(name).append(", surname:").append(surname).append(", passport:").append(passNumber).append(", sum:").append(sum);
        return builder.toString();
    }
}
