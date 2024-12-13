package model;

public interface MoneyAcceptor {
    void addMoney(int amount);
    int getBalance();
    void resetBalance();
}
