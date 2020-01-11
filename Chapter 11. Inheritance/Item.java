/**
 * Item
 */
public class Item {
    private String name;
    private int price;

    public String getName () {
        return this.name;
    }

    public Item (String newName) {
        this.name = newName;
        this.price = 0;
    }
    
    public Item (String newName, int newPrice) {
        this.name = newName;
        this.price = newPrice;
    }
}