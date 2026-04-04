package Composite;

public class Salesperson implements Payee {
    private Manager manager;
    private String name;

    public Salesperson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid " + amount + " dollars");
    }
}
