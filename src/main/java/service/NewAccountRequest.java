package service;

import dataAccessLayer.BankAccountDatabase;
import dataAccessLayer.BankAccountModel;

public class NewAccountRequest {

  BankAccountDatabase bankAccountDatabase;

  public void newAccount(){

    BankAccountModel lukeBankAccountModel = new BankAccountModel("Luke", "1234", 0.10);
    BankAccountModel anaBankAccountModel = new BankAccountModel("Ana", "12345", 1000000);

     bankAccountDatabase = new BankAccountDatabase();

    bankAccountDatabase.addingNewAccountToDatabase(lukeBankAccountModel);
    bankAccountDatabase.addingNewAccountToDatabase(anaBankAccountModel);
  }

}
