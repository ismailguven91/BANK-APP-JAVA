package com.company;

import java.util.ArrayList;
import java.util.List;

public class Costumer {

    //CONSTRUCTOR
    public Costumer(String Name, Long personalNo){
        costumerName = Name;
        costumerPersonalNo = personalNo;
        costumerAccounts=new ArrayList<>();
    }

    //STATE
    private String costumerName;
    private Long costumerPersonalNo;
    private List<Account> costumerAccounts;

    //BEHAVIOUR
    public void addAccount(Account account){
        costumerAccounts.add(account);
    }
    public String getCostumerName() {
        return costumerName;
    }

    public Long getCostumerPersonalNo() {
        return costumerPersonalNo;
    }

    public List<Account> getCostumerAccounts() {
        return costumerAccounts;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "costumerName='" + costumerName + '\'' +
                ", costumerPersonalNo=" + costumerPersonalNo +
                '}';
    }
}





//METHODS AND FUNCTIONS
//TODO: GET INFO OF COSTUMER (NAME,PERSONAL NO & INFO ABOUT COSTUMER ACCOUNTS)
//TODO: CHANGE INFO OF COSTUMER (NAME AND PERSONAL NO)
//TODO: SHOW LIST OF COSTUMER ACCOUNTS
//TODO:
