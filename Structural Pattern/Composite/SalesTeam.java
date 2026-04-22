package Composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    private final List<Payee> members;

    public SalesTeam(List<Payee> members) {
        this.members = new ArrayList<>(members);
    }

    public void addPayee(Payee p) {
        members.add(p);
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee payee : members) {
            payee.payExpenses(amount);
        }
    }
}
