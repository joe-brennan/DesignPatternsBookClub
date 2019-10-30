package Strategy;

public class CheckoutTest {

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        basket.addItem(item1);
        basket.addItem(item2);

        basket.pay(new PaypalPaymentStrategy("email", "password"));
        basket.pay(new CardPaymentStrategy("0123456789", "Joseph", "01/01/2020", "123"));
    }
}
