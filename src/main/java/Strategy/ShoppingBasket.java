package Strategy;

import java.util.ArrayList;
import java.util.List;

class ShoppingBasket {

    private List<Item> items;

    ShoppingBasket() {
        this.items = new ArrayList<>();
    }

    void addItem(Item item) {
        this.items.add(item);
    }

    private int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(calculateTotal());
    }
}