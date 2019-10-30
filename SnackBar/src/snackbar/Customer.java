package snackbar;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double add)
    {
        this.cash = cash + add;
    }
    public void buyItem(double buy)
    {
        this.cash = cash - buy;
    }
    public double getCash()
    {
        return cash;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}