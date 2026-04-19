package Composite;

public class Client {

    public static void main(String[] args) {
        Manager anna = new Manager("Anna");
        Manager brian = new Manager("Brian");

        Salesperson linda = new Salesperson("Linda", anna);
        Salesperson peter = new Salesperson("Peter", anna);
        Salesperson sophia = new Salesperson("Sophia", brian);

        SalesTeam salesTeam = new SalesTeam();
        salesTeam.addPayee(anna);
        salesTeam.addPayee(brian);
        salesTeam.addPayee(linda);
        salesTeam.addPayee(peter);
        salesTeam.addPayee(sophia);

        salesTeam.payExpenses(500);
    }
}
