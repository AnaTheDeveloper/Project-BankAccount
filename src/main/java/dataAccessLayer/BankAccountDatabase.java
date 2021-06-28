package dataAccessLayer;

import java.util.ArrayList;

public class BankAccountDatabase {

  private static ArrayList<BankAccountModel> bankAccountDatabase = new ArrayList<BankAccountModel>();

//static means you cant do new/the same

  public void addingNewAccountToDatabase(BankAccountModel bankAccount){

    bankAccountDatabase.add(bankAccount);
    for (BankAccountModel model: bankAccountDatabase) {
      System.out.println(model.toString());


    }
  }



}
