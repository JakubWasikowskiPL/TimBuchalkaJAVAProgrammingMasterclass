public class BankAccount {

   private int accountNumber;
   private double balance;
   private String customerName;
   private String email;
   private String phoneNumber;

    public BankAccount() {
        this(56789,2.50,"Default name","Default address","Default phone number");//calling other constructor in this constructor, must be called in the first line
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999,100.55,customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double deposit){
        setBalance((getBalance()+deposit));
        System.out.println("Deposit of "+deposit+" made. New balance is = "+this.balance);
    }
    public void withdrawFunds(double withdraw){
        if ((getBalance()-withdraw)>=0) {
            setBalance((getBalance() - withdraw));
            System.out.println("Withdrawal of "+withdraw+" processed. Remaining balance = "+this.balance);
        }else {
            System.out.println("Only "+this.balance+" available. Withdrawal not processed");
        }
    }
}
