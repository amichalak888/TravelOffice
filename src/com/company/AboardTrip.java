package com.company;

public class AboardTrip extends Trip {
    private double insurance;
    public AboardTrip(Date start, Date end, String destination, double price, double insurance) {
        super(start, end, destination, price);
        this.insurance=insurance;
    }


    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getInsurance() {
        return insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+getInsurance();
    }
}
