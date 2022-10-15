package StrategyDesignPattern;

public class CouponDiscount implements DiscountStrategy {
    @Override
    public void giveDiscount() {
        System.out.println("Coupon Discount.....");
    }
}
