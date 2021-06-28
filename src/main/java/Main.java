import controller.CreateAnAccount;
import dataAccessLayer.BankAccountDatabase;
import java.util.Scanner;

public class Main {








  public static void main(String[] args) {


   boolean infinate = true;

   while (infinate == true) {
     System.out.println("Type in a number from the menu");
     System.out.println("[1] create an account");

     Scanner input = new Scanner(System.in);
     String savedResponce = input.nextLine();

     CreateAnAccount createAnAccount = new CreateAnAccount();
     createAnAccount.checkNumberRequest(savedResponce);



   }


  }

}
