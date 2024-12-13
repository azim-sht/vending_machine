package model;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;

    public CoinAcceptor(int initialAmount) {
        this.amount = initialAmount;
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
    }

    @Override
    public int getBalance() {
        return amount;
    }

    @Override
    public void resetBalance() {
        this.amount = 0;
    }
}
