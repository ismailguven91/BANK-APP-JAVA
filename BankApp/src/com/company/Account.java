package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
    //CONSTRUCTOR
  /*  public Account(Double Balance){
        customerBalance = Balance;
    }*/

    //CONSTRUCTOR
    public Account(){
        customerAccountNo = UUID.randomUUID();
    }


    //STATE
    private String customerAccountType = "Debit";
    private Double customerBalance = 10000.0;
    private UUID customerAccountNo;

    //BEHAVIOUR
    public String getCustomerAccountType() {
        return customerAccountType;
    }
    public Double getCustomerBalance() {
        return customerBalance;
    }
    public UUID getCustomerAccountNo() {
        return customerAccountNo;
    }






}






//METHODS AND FUNCTIONS
//TODO: DEPOSIT & WITHDRAW
//TODO: GET ACCOUNT DETAILS (ACCOUNT NO, BALANCE & ACC TYPE)

//TODO: ANVÄND KLASSEN UUID FÖR ATT GENERERA KONTONUMMER
//TODO: KONTOTYP SKA VARA STRING