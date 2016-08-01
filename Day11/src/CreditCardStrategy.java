/**
 * Created by tranh on 01-Aug-16.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private int secretPIN;

    public CreditCardStrategy(String name, String cardNumber, int secretPIN) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.secretPIN = secretPIN;
    }


    @Override
    public boolean isValidInfo(Account account) {
        if (name == account.getName() && cardNumber == account.getCardNumber() && account.isRightPIN(secretPIN))
            return true;
        else
            return false;
    }
}
