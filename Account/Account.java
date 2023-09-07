public class Account {
    private String custID;
    private String custName;
    private String custAddress;
    private String custPhone;
    protected double balance;

    // Constructor
    public Account(String custID, String custName, String custAddress, String custPhone, double balance) {
        this.custID = custID;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPhone = custPhone;
        this.balance = balance;
    }

    // Accessor methods
    public String getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public double getBalance() {
        return balance;
    }

    // Mutator methods
    public void setCustID(String custID) {
        this.custID = custID;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    // Method to add to the balance
    public void add(double amount) {
        balance += amount;
    }

    // Method to subtract from the balance
    public void subtract(double amount) {
        balance -= amount;
    }

    // Method to add yearly interest
    public void yearlyInterest() {
        balance *= 1.03; // Increment balance by 3% for yearly interest
    }

    // toString method
    @Override
    public String toString() {
        return "Account:"+"\n custID:\t" + custID + "\n custName:\t" + custName + "\n custAddress:\t" + custAddress
                + "\n custPhone:\t" + custPhone + "\n balance:\t" + balance;
    }
}
