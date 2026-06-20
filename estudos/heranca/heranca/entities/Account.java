package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;

    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(Double amount) {
        this.balanca -= amount;
    }

    public void deposit(Double amount) {
        this.deposit += amount;
    }
}
