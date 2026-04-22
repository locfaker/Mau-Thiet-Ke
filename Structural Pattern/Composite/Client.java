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

        List<Payee> members = Arrays.asList(anna, brian, linda, peter, sophia);

        SalesTeam salesTeam = new SalesTeam(members);
        salesTeam.payExpenses(500);
    }
}
