package bank;

public class Customer {

  private int id;
  private String name;
  private String userName;
  private String password;
  private int accountId;
  private boolean authenticated;

  public Customer(int id, String name, String userName, String password, int accounId) {
    setId(id);
    setName(name);
    setUsername(userName);
    setPassword(password);
    setAccountId(accounId);
    setAuthenticated(false);

  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.userName;
  }

  public void setUsername(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }


  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public boolean isAuthenticated() {
    return this.authenticated;
  }

  public void setAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
  }


}
