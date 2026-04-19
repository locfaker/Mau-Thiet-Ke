package Composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    private final List<Payee> members = new ArrayList<>();

    public void addPayee(Payee payee) {
        members.add(payee);
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee member : members) {
            member.payExpenses(amount);
        }
    }
}
