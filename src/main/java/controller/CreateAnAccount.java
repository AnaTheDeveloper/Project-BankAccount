package controller;

import service.NewAccountRequest;

public class CreateAnAccount {

  //Standard practice is to put all of your dependencies at the top and then initialise it later.

  NewAccountRequest newAccountRequest;



  public boolean checkNumberRequest(String number){

//    if (number != "1"){
//      return false;
//    }

    newAccountRequest = new NewAccountRequest();      //Copied other class.       //Dependency because this piece of code is not in this section but this section requires it to run. //Here i am initialising it.

    newAccountRequest.newAccount();                                     //Called it in this class.

    return true;

  }

}
