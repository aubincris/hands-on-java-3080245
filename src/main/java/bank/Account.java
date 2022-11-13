package bank;

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


  
}
