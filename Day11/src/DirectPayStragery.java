/**
 * Created by tranh on 01-Aug-16.
 */
public class DirectPayStragery implements PaymentStrategy {
    private String userId;
    private int secretPIN;

    public DirectPayStragery(String userId, int secretPIN) {
        this.userId = userId;
        this.secretPIN = secretPIN;
    }

    @Override
    public boolean isValidInfo(Account account) {
        if (userId == account.getUserId() &&account.isRightPIN(secretPIN))
            return true;
        else

            return false;
    }
}
