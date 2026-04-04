package Composite;

import java.util.List;

public class SalesTeam implements Payee {
    private List<Manager> managers;
    private List<Salesperson> salespersons;

    public SalesTeam(List<Manager> managers, List<Salesperson> salespersons) {
        this.managers = managers;
        this.salespersons = salespersons;
    }
    
    @Override
    public void payExpenses(int amount) {
        for (Manager manager : managers) {
            manager.payExpenses(amount);
        }
        
        for (Salesperson salesperson : salespersons) {
            salesperson.payExpenses(amount);
        }
    }
}
