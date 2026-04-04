package Composite;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Manager anna = new Manager("Anna");
        Manager brian = new Manager("Brian");

        Salesperson linda = new Salesperson("Linda", anna);
        Salesperson peter = new Salesperson("Peter", anna);
        Salesperson sophia = new Salesperson("Sophia", brian);

        List<Manager> managers = Arrays.asList(anna, brian);
        List<Salesperson> salespersons = Arrays.asList(linda, peter, sophia);
        
        Payee salesTeam = new SalesTeam(managers, salespersons);
        salesTeam.payExpenses(500);
    }
}
