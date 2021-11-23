package com.company;

import java.util.List;
import java.util.UUID;

public class Account {
    //CONSTRUCTOR
    public Account(Double Balance){
        costumerBalance = Balance;
    }

    //CONSTRUCTOR
    public Account(){
        UUID.randomUUID();
    }
    //STATE
    private String costumerAccountType = "Debit";
    private Double costumerBalance;
    private UUID costumerAccountNo;

    //BEHAVIOUR
    public String getCostumerAccountType() {
        return costumerAccountType;
    }

    public Double getCostumerBalance() {
        return costumerBalance;
    }

    public UUID getCostumerAccountNo() {
        return costumerAccountNo;
    }




}






//METHODS AND FUNCTIONS
//TODO: DEPOSIT & WITHDRAW
//TODO: GET ACCOUNT DETAILS (ACCOUNT NO, BALANCE & ACC TYPE)

//TODO: ANVÄND KLASSEN UUID FÖR ATT GENERERA KONTONUMMER
//TODO: KONTOTYP SKA VARA STRING
