package Strategy;

public class Item {

    private String itemCode;
    private int price;

    Item(String itemCode, int cost) {
        this.itemCode = itemCode;
        this.price = cost;
    }

    public String getItemCode() {
        return itemCode;
    }

    int getPrice() {
        return price;
    }

}
