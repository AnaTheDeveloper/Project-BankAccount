package service;

import dataAccessLayer.BankAccountDatabase;
import dataAccessLayer.BankAccountModel;
import java.util.Scanner;

public class NewAccountRequest {

  BankAccountDatabase bankAccountDatabase;

  public void newAccount(){

//    BankAccountModel lukeBankAccountModel = new BankAccountModel("Luke", "1234", 0.10);
//    BankAccountModel anaBankAccountModel = new BankAccountModel("Ana", "12345", 1000000);
//
//     bankAccountDatabase = new BankAccountDatabase();
//
//    bankAccountDatabase.addingNewAccountToDatabase(lukeBankAccountModel);
//    bankAccountDatabase.addingNewAccountToDatabase(anaBankAccountModel);


    System.out.println("Enter a Username");
    Scanner usernameInput = new Scanner(System.in);
    String usernameSavedResponse = usernameInput.nextLine();

    System.out.println("Enter a Password");
    Scanner passwordInput = new Scanner(System.in);
    String passwordSavedResponse = passwordInput.nextLine();

    BankAccountModel bankAccountModel = new BankAccountModel(usernameSavedResponse, passwordSavedResponse);
    bankAccountDatabase = new BankAccountDatabase();

    bankAccountDatabase.addingNewAccountToDatabase(bankAccountModel);

  }

}
