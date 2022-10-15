package StrategyDesignPattern;

public class Main {
    // if we have different strategy which have completely different implementation
    // for example
    // Shopping Mart which has to apply different Discount Strategy
    // 1.Flat Discount
    // 2.Cashback Discount
    // 3.Coupon Discount

    public static void main(String[] args) {
        ApplyDiscount applyDiscount = new ApplyDiscount(new FlatDiscount());
        applyDiscount.getDiscount();

        applyDiscount.setStrategy(new CouponDiscount());
        applyDiscount.getDiscount();
    }
}
