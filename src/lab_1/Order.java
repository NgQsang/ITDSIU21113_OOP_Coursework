import java.util.ArrayList;

//some explanation
//1. ArrayList class is a resizable array, which can be found in the java.util package.
//2. ArrayList is a commonly used data structure in Java for creating dynamic arrays, and it is used here to store the list of items in an order.
//3. ArrayList is used to create and manage a dynamic list of items in the order.

public class Order {
    //1. each order has an order ID
    //2. each order has a list of items
    //=> 2 attributes: orderId and items
    private int orderId;
    private ArrayList<Item> items;

    //4. each class has appropriate constructors, get and set methods
    public Order(int orderId) {
        this.orderId = orderId;
        //initialize the items instance variable
        //create an empty ArrayList of Items objects and assign it to the items instance variable
        this.items = new ArrayList<Item>();
    }

    //4. getters and setters
    public int getOrderId() {
        return orderId;
    }
    //already have a setter for orderId in the constructor
    public ArrayList<Item> getItems() {
        return items;
    }
    //no setter for items, because we don't want to change the items in an order
    //add Item objects to the items ArrayList using the add() method
    //add Item takes an Item object as a parameter and adds it to the list of items in the order.
    public void addItem(Item item) {
        items.add(item);
    }

    //5. method double calculateAverageCost() 
    //to calculate the average of the cost of all items in an order
    public double calculateAverageCost() {
        //initialize the totalCost variable to 0
        double totalCost = 0;
        //loop through the items ArrayList and add the price of each item to the totalCost variable
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        //return the average cost of the items in the order
        return totalCost / items.size();
    }
}
    