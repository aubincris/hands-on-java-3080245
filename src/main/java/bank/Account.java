package bank;

import java.security.Identity;

import bank.exceptions.AmountExceptions;

public class Account {

  private int ID;
  private String type;
  private double balance;

  public Account(int Id, String type, double balance) {
    setID(Id);
    setType(type);
    setBalance(balance);

  }


  public int getID() {
    return this.ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount)throws AmountExceptions{
    if(amount < 1){
      throw new AmountExceptions("The minimum deposit is 1.00");
    }
    else{
      double newBalance = balance + amount;
      setBalance(newBalance);
      DataSource.updateAccountBalance(ID, newBalance);
    }


  }

  public void withdraw(double amount) throws AmountExceptions{
    if(amount < 0){
      throw new AmountExceptions("The withdrawal amount must be greater than 0");
    }
    else if(amount > getBalance()){
      throw new AmountExceptions("You do not have sufficient funds for this withdrawal");
    }
    else{
      double newBalance = balance - amount;
      setBalance(newBalance);
      DataSource.updateAccountBalance(ID, newBalance);
    }
    

  }

  
}
