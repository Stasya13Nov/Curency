package by.nastya;

public class Money {
    private double amountOfMoney;
    private Currency currency;

    public Money(double amountOfMoney, Currency currency) {
        this.amountOfMoney = amountOfMoney;
        this.currency = currency;
    }
    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public Currency getCurrency() {
        return currency;
    }


}
