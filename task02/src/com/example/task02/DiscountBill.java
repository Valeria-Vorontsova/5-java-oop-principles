package com.example.task02;

public class DiscountBill extends Bill{
    private long discount;

    public DiscountBill(long discount){
        this.discount = discount;
    }

    public String getDiscountPercent() {
        return discount + "%";
    }

    public long getDiscountAmount(){
    return super.getPrice() * discount / 100;
    }

    @Override
    public long getPrice() {
        return super.getPrice() - super.getPrice() * discount / 100;
    }
}
