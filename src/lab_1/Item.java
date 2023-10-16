public class Item {
    //3. each item has an item ID
    //3. each item has a name
    //3. each item has a price
    //=> 3 attributes: itemId, name, price
    private int itemId;
    private String name;
    private double price;

    //4. each class has appropriate constructors, get and set methods
    public Item(int itemId, String name, double price) {
        //also setters for itemId, name, price
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    //4. getters and setters
    public int getItemId() {
        return itemId;
    }
    //already have a setter for itemId in the constructor

    public String getName() {
        return name;
    }
    //already have a setter for name in the constructor

    public double getPrice() {
        return price;
    }
    //already have a setter for price in the constructor
}