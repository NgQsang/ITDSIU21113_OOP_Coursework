import java.util.Scanner;
//some explanation
//1. Scanner class is used to get user input, and it is found in the java.util package.
//2. Scanner is used for reading user input from the console.
//3. Scanner is used to read user input for the order ID, item details, and to interact with the user during the program execution.
public class TestE_commerceOrder {
    public static void main(String[] args) {
    //create a static Scanner object to be used in all methods
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the order ID: ");
    //read the order ID from the user
    int orderId = scanner.nextInt();
    //create an Order object with the order ID
    Order order = new Order(orderId);

    //loop through the items in the order
    while (true) {
        System.out.print("Enter the item ID: (or enter '0' to finish): ");
        //read the item ID from the user
        int itemId = scanner.nextInt();
        //if the user enters 'done', exit the loop
        if (itemId == 0) {
            break;
        }

        //read the item name from the user
        System.out.print("Enter the item name: ");
        String itemName = scanner.next();

        //read the item price from the user
        System.out.print("Enter the item price: ");
        double itemPrice = scanner.nextDouble();

        //create an Item object with the item ID, name, and price
        Item item = new Item(itemId, itemName, itemPrice);
        //add the item to the order
        order.addItem(item);
    }

    //calculate the average cost of the items in the order
    double averageCost = order.calculateAverageCost();
    System.out.println("\nOrder ID: " + order.getOrderId());
    System.out.println("Items in the Order:");

    //loop through the items in the order and print the details of each item
    for (Item item : order.getItems()) {
        System.out.println("Item ID: " + item.getItemId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
    }
    System.out.println("The average cost of the items in the order is: " + averageCost);

    //close the scanner object
    scanner.close();
  }
}