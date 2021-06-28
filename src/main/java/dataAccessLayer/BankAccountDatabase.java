package dataAccessLayer;

import java.util.ArrayList;
import service.NewAccountRequest;

public class BankAccountDatabase {

  private static ArrayList<BankAccountModel> bankAccountDatabase = new ArrayList<BankAccountModel>();

//static means you cant do new/the same

  public void addingNewAccountToDatabase(BankAccountModel bankAccount){

    bankAccountDatabase.add(bankAccount);
  }







}
