import java.util.Scanner;

/**
 * Created by tranh on 01-Aug-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account("1", "Hao", 12345, 10000);
        account.setPhoneNumber("0123456789");
        PaymentStrategy paymentStrategy = new MobileBankingStrategy("0123456789", 12345);
    }
}
