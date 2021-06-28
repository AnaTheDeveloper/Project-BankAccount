package dataAccessLayer;

public class BankAccountModel {

  //A model is the constant objects that make up the project.
  //Instance variables.
  //THIS IS A TEMPLATE FOR MY BANK ACCOUNT

  private String username;
  private String password;
  private double balance;
  private String appointments;
  private RoleBasedAuthentication role;

  public BankAccountModel(String username, String password, double balance) {
    this.username = username;
    this.password = password;
    this.balance = balance;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAppointments() {
    return appointments;
  }

  public void setAppointments(String appointments) {
    this.appointments = appointments;
  }


  public void setRole(RoleBasedAuthentication role) {
    this.role = role;
  }
}
