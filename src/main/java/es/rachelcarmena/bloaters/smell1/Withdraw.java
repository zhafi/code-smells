package es.rachelcarmena.bloaters.smell1;

public class Withdraw {
    private Amount amount;

    public Withdraw(Amount amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount.getValue();
    }
}