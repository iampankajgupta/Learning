package StrategyDesignPattern;

public class ApplyDiscount {

    DiscountStrategy discountStrategy;

    // constructor Injection
    public ApplyDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    void getDiscount(){
        discountStrategy.giveDiscount();
    }

    void setStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
}
