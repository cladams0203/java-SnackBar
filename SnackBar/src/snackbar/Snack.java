package snackbar;

public class Snack 
{
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(int id, String name, int quantity, double cost, int vendingMachineId)
    {
        this.id =id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public double getCost()
    {
        return cost;
    }
    public void setVendingId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
    public int getVendingId()
    {
        return vendingMachineId;
    }
    public void addQuantity(int add)
    {
        this.quantity = quantity + add;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void buySnack(int buy)
    {
        this.quantity = quantity - buy;
    }
    public double getTotal(double amount)
    {
        return cost * amount;
    }
}