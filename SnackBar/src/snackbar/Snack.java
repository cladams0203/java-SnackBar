package snackbar;

public class Snack 
{
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

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
    public void setQuantity(int quantity)
    {
    }
}