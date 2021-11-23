package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //CONSTRUCTOR
    public Bank(){
        Costumers = new ArrayList<>();
    }

    //STATE
    private List<Costumer> Costumers;

    //BEHAVIOUR
    public List<Costumer> getCostumers() {
        return Costumers;
    }

    public List<Costumer> GetCustomers(){
        return Costumers;

    }

    public void addCostumer(Costumer c){
        Costumers.add(c);
    }
    public  void addAccount(Long personalNo){
        for (var costumer:Costumers)
        {
        if (costumer.getCostumerPersonalNo()==personalNo){
            costumer.addAccount(new Account());
        }
        }

    }
    //
/*    public List<String> GetCustomers()
    public boolean AddCustomer(String name, long pNr)
    public List<String> GetCustomer(long pNr)
    public boolean ChangeCustomerName(String name, long pNr)
    public List<String> RemoveCustomer(long pNr)
    public int AddAccount(long pNr)
    public String GetAccount(long pNr, int accountId)
    public boolean Deposit(long pNr, int accountId, int amount)
    public boolean Withdraw(long pNr, int accountId, int amount)
    public String CloseAccount(long pNr, int accountId)*/

    @Override
    public String toString() {
        return "Bank Costumers: " + Costumers +
                '}';
    }
}
