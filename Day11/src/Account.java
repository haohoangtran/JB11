/**
 * Created by tranh on 01-Aug-16.
 */
public class Account {
    private String userId;
    private String name;
    private String phoneNumber;
    private String cardNumber = GenerateRandomCardNumber.generateMasterCardNumber();
    private double balance;
    private int secretPIN;

    public Account(String userId, String name, int secretPIN) {
        this.userId = userId;
        this.name = name;
        this.secretPIN = secretPIN;
    }

    public Account(String userId, String name, int secretPIN, double balance) {
        this.userId = userId;
        this.name = name;
        this.secretPIN = secretPIN;
        this.balance = balance;

    }

    public double deposit(double valuer) {
        if (valuer > 0)
            this.balance = balance + valuer;
        return balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double withdraw(PaymentStrategy paymentStrategy, double valuer) {
        if (paymentStrategy.isValidInfo(this))
            if (valuer > 0 && valuer <= balance) {
                this.balance = balance - valuer;
            }
        return balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isRightPIN(int secretPIN) {
        if (secretPIN == this.secretPIN)
            return true;
        else
            return false;
    }
}
