package com.company;

public class Customer {
    private String name;
    private  Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }
    public String toString(Customer customer, Trip trip, Address address) {
        String S1 = trip.toString(trip);
        String S2 = address.toString(address);
        String totalInfo = S1 + S2;
        return totalInfo;
    }


}
