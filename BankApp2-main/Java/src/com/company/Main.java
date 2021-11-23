package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        List<Account> costumerAccounts = new ArrayList<>();

        //ADD COSTUMERS TO THE BANK

        Bank b1 = new Bank();
        b1.addCostumer(new Costumer("Zlatan Ibrahimovic", 8110031111L));
        b1.addCostumer(new Costumer("Ismail Güven",  9102212222L));
        b1.addCostumer(new Costumer("Maria Güven",  8701213333L));
        b1.addCostumer(new Costumer("Elon Musk",  7106284444L));
        b1.addAccount(67786786L);
        b1.addAccount(81100311L);







        System.out.println(b1);


    }


}

