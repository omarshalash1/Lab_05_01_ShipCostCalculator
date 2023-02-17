// This code imports the Scanner class from the java.util package.
import java.util.Scanner;
// This line declares a public class called "main".
public class main {
// This line declares a static void method called "main" that takes in an array of Strings as its argument.
public static void main(String[] args) {
// This line creates a new Scanner object called "scan".
Scanner scan = new Scanner(System.in);
     // This line prints a message asking the user to enter the price of an item.
  System.out.print("Enter the price of the item: $");
  
  // This line initializes a double variable called "itemPrice" to 100. (Note: this value is hard-coded and not based on user input.)
  double itemPrice = 100;
  
  // This line initializes a double variable called "shippingCost".
  double shippingCost;
  
  // This line begins an if-else statement. If the itemPrice is greater than or equal to 100, the shippingCost is set to 0. Otherwise, the shipping cost is calculated as 2% of the itemPrice.
  if (itemPrice >= 100) {
     shippingCost = 0;
  } else {
     shippingCost = itemPrice * 0.02;
  }
  
  // This line calculates the total price of the item (itemPrice plus shippingCost) and initializes a double variable called "totalPrice" to that value.
  double totalPrice = itemPrice + shippingCost;
  
  // This line prints the shippingCost with a message.
  System.out.println("Shipping cost: $" + shippingCost);
  
  // This line prints the totalPrice with a message.
  System.out.println("Total price: $" + totalPrice);
}
}
