package Strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    private final String cardNumber;
    private final String accountHolder;
    private final String expiryDate;
    private final String cvv;

    CardPaymentStrategy(String cardNumber,
                        String accountHolder,
                        String expiryDate,
                        String cvv) {
        this.cardNumber = cardNumber;
        this.accountHolder = accountHolder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid amount: " + amount + " with Card ending with: " + getFinalFourDigitsFromCardNo());

    }

    private String getFinalFourDigitsFromCardNo() {
        return cardNumber.substring(cardNumber.length() - 4);
    }
}
