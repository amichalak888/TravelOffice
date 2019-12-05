package com.company;

public class DomesticTrip extends Trip {
    public DomesticTrip(Date start, Date end, String destination, int price, double ownArrivalDiscount) {
        super(start, end, destination, price);
        this.ownArrivalDiscount= ownArrivalDiscount;
    }

    private double ownArrivalDiscount;

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
            }

    public double getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice()-getOwnArrivalDiscount();
    }
}
