/**
 * Created by tranh on 01-Aug-16.
 */
public class MobileBankingStrategy implements PaymentStrategy {
    private String phoneNumber;
    private int secretPIN;

    public MobileBankingStrategy(String phoneNumber, int secretPIN) {
        this.phoneNumber = phoneNumber;
        this.secretPIN = secretPIN;
    }

    @Override

    public boolean isValidInfo(Account account) {
        if (phoneNumber == account.getPhoneNumber() && account.isRightPIN(secretPIN))
            return true;
        else
            return false;
    }
}
