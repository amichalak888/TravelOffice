package com.company;

public class Trip {
   private Date start;
    private Date end;
    private String destination;
    private double price;
    private double finalPrice;

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price=price;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getPrice() {
        return price;

    }



    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(Trip trip) {
        return "Poczatek wycieki: "+ trip.start.getDay() +trip.start.getMonth()+trip.start.getYear() +
                "Wycieczka kończy się: " + trip.end.getDay() + trip.end.getMonth() +trip.end.getYear()+
                "Cel podróży to: " + trip.destination+
                "Cena wycieczki: " +getPrice();


    }


}

