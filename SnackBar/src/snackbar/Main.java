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
        soda.buySnack(4);
        System.out.println(jane.getName() + " has " + jane.getCash());
        System.out.println("there are " + soda.getQuantity() + " Sodas left");

        jane.buyItem(pretzel.getCost());
        pretzel.buySnack(1);
        System.out.println(jane.getName() + " has " + jane.getCash());
        System.out.println("there are " + pretzel.getQuantity() + " Pretzels left");

        bob.buyItem(soda.getCost() * 2);
        soda.buySnack(2);
        System.out.println(bob.getName() + " has " + bob.getCash());
        System.out.println("there are " + soda.getQuantity() + " Sodas left");

        jane.addCash(10.00);
        System.out.println(jane.getName() + " found 10.00 and now has " + jane.getCash());

        jane.buyItem(chocolateBar.getCost() * 2);
        chocolateBar.buySnack(2);
        System.out.println(jane.getName() + " has " + jane.getCash());
        System.out.println("there are " + chocolateBar.getQuantity() + " Chocolate Bars left");

        pretzel.addQuantity(12);
        System.out.println("there are " + pretzel.getQuantity() + "Pretzels left");

        bob.buyItem(pretzel.getCost() * 3);
        pretzel.buySnack(3);
        System.out.println(bob.getName() + " has " + bob.getCash());
        System.out.println("there are " + pretzel.getQuantity() + " Pretzels left");

    }
}