package snackbar;

public class Main 
{
    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        Vending food = new Vending(1, "Food");
        Vending drink = new Vending(2, "Drink");
        Vending office = new Vending(3, "Office");

        Snack chips = new Snack(1, "Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack(2, "Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack(3, "Pretzel", 30, 2.00, 1);
        Snack soda = new Snack(4, "Soda", 24, 2.50, 2);
        Snack water = new Snack(5, "Water", 20, 2.75, 2);

        jane.buyItem(soda.getCost() * 4);
        System.out.println(jane.getName() + " has " + jane.getCash());
        System.out.println("there are " + soda.getQuantity() + " left");

        jane.buyItem(pretzel.getCost());
        System.out.println(jane.getName() + " has " + jane.getCash());
        System.out.println("there are " + pretzel.getQuantity() + " left");
        

    }
}