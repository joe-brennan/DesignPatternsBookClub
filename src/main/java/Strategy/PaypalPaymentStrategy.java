package Strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    private final String emailAddress;
    private final String hashedPassword;

    PaypalPaymentStrategy(String emailAddress, String hashedPassword) {
        this.emailAddress = emailAddress;
        this.hashedPassword = hashedPassword;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid amount: " + amount + " with Paypal account belonging to: " + emailAddress);
    }
}
