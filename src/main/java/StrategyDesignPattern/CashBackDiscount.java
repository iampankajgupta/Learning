package StrategyDesignPattern;

public class CashBackDiscount implements DiscountStrategy {

    @Override
    public void giveDiscount() {
        System.out.println("Cashback Discount.....");
    }
}
